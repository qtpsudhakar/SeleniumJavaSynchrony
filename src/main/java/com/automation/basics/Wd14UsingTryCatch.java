package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd14UsingTryCatch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

//        driver.findElement(By.xpath("//input[@name='txtUsername1']")).sendKeys("admin");
//        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        try {
            driver.findElement(By.xpath("//input[@name='txtUsername1']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
            driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        }
        catch (NoSuchElementException e){
            //write your handling code
            System.out.println("Failed because of element not found");
//            System.out.println(e.getMessage());
            throw e;
        }catch (Exception e){
//            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
