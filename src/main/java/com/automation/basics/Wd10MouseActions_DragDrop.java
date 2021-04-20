package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Wd10MouseActions_DragDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FindElement timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //page load timeout
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        new Actions(driver).moveToElement(driver.findElement(By.linkText("API documentation"))).build().perform();

        WebElement frm= driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);

        WebElement src= driver.findElement(By.id("draggable"));
        WebElement dst= driver.findElement(By.id("droppable"));

//        new Actions(driver).dragAndDrop(src,dst).build().perform();

        Rectangle elmRect = dst.getRect();
        new Actions(driver).dragAndDropBy(src,elmRect.x,elmRect.y).build().perform();

    }
}
