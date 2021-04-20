package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Wd9MouseActions_Hover_DblClick_Scoll {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FindElement timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //page load timeout
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://api.jquery.com/dblclick/");

        WebElement frm= driver.findElement(By.xpath("//div[@class='demo code-demo']/iframe"));
        driver.switchTo().frame(frm);

        WebElement elm = driver.findElement(By.xpath("//span[text()='Double click the block']/../div"));
        Actions act = new Actions(driver);
        act.doubleClick(elm).build().perform();

        driver.switchTo().defaultContent(); //switch to top html doc

        act.moveToElement(driver.findElement(By.linkText("Support"))).build().perform();
        Thread.sleep(2000);

        act.click(driver.findElement(By.linkText("Forums"))).build().perform();

    }
}
