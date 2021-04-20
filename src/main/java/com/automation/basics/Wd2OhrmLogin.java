package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wd2OhrmLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

//        driver.findElement(By.id("btnLogin")).click();
        Actions act = new Actions(driver);
        act.click(driver.findElement(By.id("btnLogin"))).build().perform();

        driver.findElements(By.tagName("a"));

        driver.quit();
    }
}
