package com.automation.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wd12HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FindElement timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //page load timeout
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://www.tsrtconline.in/oprs-web/");

        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep((2000));

        Alert al = driver.switchTo().alert();

        if (al.getText().contains("Please select start place.")){
            System.out.println("Start place validation succesful");
        }else{
            System.out.println("Start place validation failed");
        }

        al.accept(); //clicks on ok/yes

        driver.findElement(By.id("fromPlaceName")).sendKeys("hyderabad");
        driver.findElement(By.linkText("HYDERABAD")).click();

        driver.findElement(By.id("searchBtn")).click();

        Thread.sleep((2000));

        if (al.getText().contains("Please select end place.")){
            System.out.println("End place validation succesful");
        }else{
            System.out.println("End place validation failed");
        }

        al.accept(); //clicks on ok/yes

        driver.findElement(By.id("toPlaceName")).sendKeys("BANGALORE");
        driver.findElement(By.linkText("BANGALORE")).click();

        driver.findElement(By.id("txtJourneyDate")).click();

        driver.findElement(By.linkText("23")).click();
        driver.findElement(By.id("searchBtn")).click();

    }
}
