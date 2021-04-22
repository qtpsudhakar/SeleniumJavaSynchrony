package com.ngtests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OhrmAddDeleteEmployeeTest {
    private WebDriver driver;
    private String empId;


    @Test
    public void OpenApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='txtUsername']")).isDisplayed());

        Assert.assertEquals(1,driver.findElements(By.xpath("//input[@name='txtUsername']")).size());

    }

    @Test(dependsOnMethods = "OpenApplication")
    public void Login(){
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

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
