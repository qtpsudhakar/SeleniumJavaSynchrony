package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Wd4Tsrtc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FindElement timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //page load timeout
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://www.tsrtconline.in/oprs-web/");

        driver.findElement(By.id("fromPlaceName")).sendKeys("hyderabad");
        driver.findElement(By.linkText("HYDERABAD")).click();

        driver.findElement(By.id("toPlaceName")).sendKeys("BANGALORE");
        driver.findElement(By.linkText("BANGALORE")).click();

        driver.findElement(By.id("txtJourneyDate")).click();

        Calendar calendar= Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        driver.findElement(By.linkText(Integer.toString(day))).click();
        driver.findElement(By.id("searchBtn")).click();

    }
}
