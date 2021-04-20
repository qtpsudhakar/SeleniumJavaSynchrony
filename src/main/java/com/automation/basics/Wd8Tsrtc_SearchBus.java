package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wd8Tsrtc_SearchBus {
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

        driver.findElement(By.linkText("23")).click();
        driver.findElement(By.id("searchBtn")).click();

        driver.findElement(By.id("BtFid")).click();
        driver.findElement(By.xpath("//span[normalize-space()='A/C CLASS']")).click();

/*        List<WebElement> lstServices = driver.findElements(By.cssSelector("div.srvceNO"));

        System.out.println(lstServices.size());
        int counter =0;
        for (WebElement elm:lstServices){
            if (elm.isDisplayed()){
                System.out.println(elm.getText());
                counter++;
            }
        }

        System.out.println("total ac services are:"+counter);
 */
        List<WebElement> lstServices = driver.findElements(By.xpath("//div[@class='srvceNO' and not(ancestor::div[@style='display: none;'])]"));
        System.out.println("total ac services are:"+lstServices.size());

        for (WebElement elm:lstServices){
                System.out.println(elm.getText());
        }

    }
}
