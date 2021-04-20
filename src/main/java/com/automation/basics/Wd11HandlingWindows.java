package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Wd11HandlingWindows {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FindElement timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //page load timeout
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://www.naukri.com/");

        driver.findElement(By.linkText("LOGIN")).click();

        driver.findElement(By.xpath("//span[text()='Sign in with Facebook']")).click();

        String mWndHandlerId = driver.getWindowHandle();
        Set<String> allWndHandles = driver.getWindowHandles();

        for (String wnd:allWndHandles){
            driver.switchTo().window(wnd);
            String wndTitle =driver.getTitle();
            if (wndTitle.contains("Facebook")){
                break;
            }
        }

        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);
        driver.close(); //closes only active window

        driver.switchTo().window(mWndHandlerId); //switches back to main window
        //perform actions on main window

        driver.quit(); //closes session (closes all windows)
//        driver.switchTo().window()
    }
}
