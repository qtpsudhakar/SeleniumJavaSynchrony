package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wd7OhrmAddEmployee_DeleteEmp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.partialLinkText("Add Emp")).click();
        driver.findElement(By.id("firstName")).sendKeys("sudhakar");
        driver.findElement(By.id("lastName")).sendKeys("k");
        String empId = driver.findElement((By.id("employeeId"))).getAttribute("value");
        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.linkText("Employee List")).click();
        //a[text()='0217']/../preceding-sibling::td/input
        String xp="//tr[contains(normalize-space(),'"+empId+"')]//input";

        WebDriverWait wait =new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultTable")));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));

        Thread.sleep(1000);
        driver.findElement(By.xpath(xp)).click();
        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();

    }
}
