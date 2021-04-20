package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wd13JSExecutorSample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

//      driver.findElement(By.id("btnLogin")).click();
//        Actions act = new Actions(driver);
//        act.click(driver.findElement(By.id("btnLogin"))).build().perform();

        JavascriptExecutor jsDriver= (JavascriptExecutor) driver;
        //find element by selenium and perform action using JS
//        jsDriver.executeScript("arguments[0].click();",driver.findElement(By.id("btnLogin")));

        //find element by JS and perform action using webdriver
//        WebElement elm = (WebElement) jsDriver.executeScript("return document.getElementById('btnLogin');");
//        elm.click();

        //find element by JS and perform action using JS
        jsDriver.executeScript("document.getElementById('btnLogin').click();");


//        driver.quit();
    }
}
