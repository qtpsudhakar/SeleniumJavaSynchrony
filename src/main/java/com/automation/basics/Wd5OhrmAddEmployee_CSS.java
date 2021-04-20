package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd5OhrmAddEmployee_CSS {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.partialLinkText("Add Emp")).click();
        driver.findElement(By.id("firstName")).sendKeys("sudhakar");
        driver.findElement(By.id("lastName")).sendKeys("k");
        driver.findElement(By.id("btnSave")).click();

        //click on edit
        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.id("personal_optGender_1")).click();

        WebElement elm= driver.findElement(By.id("personal_cmbNation"));
        Select lstCountry = new Select(elm);
        lstCountry.selectByVisibleText("Indian");

//        new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");

        if (!driver.findElement(By.id("personal_chkSmokeFlag")).isSelected()) {
            driver.findElement(By.id("personal_chkSmokeFlag")).click();
        }
    }
}
