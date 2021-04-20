package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OhrmBase {
    static WebDriver driver;
    
    public void OpenApplication(String brName){
        switch (brName){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","C:\\Software\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }
}
