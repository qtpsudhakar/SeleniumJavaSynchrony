package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OhrmAddDeleteEmployeeTest {
    private static WebDriver driver;
    private static String empId;

    @Test
    public void t1_OpenApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='txtUsername']")).isDisplayed());

        Assert.assertEquals(1,driver.findElements(By.xpath("//input[@name='txtUsername']")).size());

    }

    @Test
    public void t2_Login(){
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

    }

    @Test
    public void t3_AddEmployee(){
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.partialLinkText("Add Emp")).click();
        driver.findElement(By.id("firstName")).sendKeys("sudhakar");
        driver.findElement(By.id("lastName")).sendKeys("k");
        empId = driver.findElement((By.id("employeeId"))).getAttribute("value");
        driver.findElement(By.id("btnSave")).click();

    }

    @Test
    public void t4_DeleteEmployee() throws InterruptedException {
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

    @Test
    public void t5_Logout(){
        System.out.println("Logged out");
    }

    @Test
    public void t6_CloseApplication(){
        driver.quit();
    }
}
