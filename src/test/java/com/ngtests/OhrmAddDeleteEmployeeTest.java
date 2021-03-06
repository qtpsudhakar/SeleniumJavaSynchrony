package com.ngtests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class OhrmAddDeleteEmployeeTest {
    private WebDriver driver;
    private String empId;

    ExtentReports extent ;
    ExtentTest test1;
    @BeforeClass
    public void iniReport(){
        extent = new ExtentReports();
        String clsName = this.getClass().getSimpleName();
        ExtentSparkReporter spark = new ExtentSparkReporter("src/../Reports/"+clsName+".html");
        extent.attachReporter(spark);
        test1 = extent.createTest(clsName);

    }

    @Test
    public void OpenApplication(){

        String brName=System.getProperty("browser");
        if (brName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (brName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        test1.log(Status.PASS,"Application Opened");

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='txtUsername']")).isDisplayed());

        Assert.assertEquals(1,driver.findElements(By.xpath("//input[@name='txtUsername']")).size());

    }

    @Test(dependsOnMethods = "OpenApplication")
    public void Login(){
        try {
            driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
            test1.log(Status.PASS, "User Name Entered");

            driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
            test1.log(Status.PASS, "PAssword Entered");
            driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
            test1.log(Status.PASS, "clicked on login");
        }catch (Exception e){
            test1.log(Status.FAIL,e.getMessage());
            TakesScreenshot ts = (TakesScreenshot) driver;
//            File fl = ts.getScreenshotAs(OutputType.FILE);
//            ts.getScreenshotAs(OutputType.BASE64);
            test1.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
            throw e;
        }finally {
            extent.flush();
        }
    }

    @Test(dependsOnMethods ="Login" )
    public void AddEmployee(){
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.partialLinkText("Add Emp")).click();
        driver.findElement(By.id("firstName")).sendKeys("sudhakar");
        driver.findElement(By.id("lastName")).sendKeys("k");
        empId = driver.findElement((By.id("employeeId"))).getAttribute("value");
        driver.findElement(By.id("btnSave")).click();

    }

    @Test(dependsOnMethods = "AddEmployee")
    public void DeleteEmployee() throws InterruptedException {
        driver.findElement(By.linkText("Employee List")).click();

        String xp="//tr[contains(normalize-space(),'"+empId+"')]//input";

        WebDriverWait wait =new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultTable")));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));

        Thread.sleep(1000);
        driver.findElement(By.xpath(xp)).click();
        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();
    }

    @Test(dependsOnMethods = "DeleteEmployee")
    public void Logout(){
        System.out.println("Logged out");
    }

    @Test(dependsOnMethods ="Logout" )
    public void CloseApplication(){
        driver.quit();
    }
}
