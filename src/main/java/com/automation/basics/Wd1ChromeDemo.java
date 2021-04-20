package com.automation.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd1ChromeDemo {
    public static void main(String[] args) {
        //specify chromedriver exe path
//        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        //open browser
        ChromeDriver driver = new ChromeDriver();

        //navigate to application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //get opened page title
        String pageTitle = driver.getTitle();

        //print page title
        System.out.println(pageTitle);

        //close browser
        driver.quit();
    }
}
