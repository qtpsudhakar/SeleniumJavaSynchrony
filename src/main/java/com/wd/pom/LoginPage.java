package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends OhrmBase{

    private By txtUserName = By.xpath("//input[@name='txtUsername']");
    private By txtPassword = By.xpath("//input[@name='txtPassword']");
    private By btnLogin = By.xpath("//input[@value='LOGIN']");

    public void enterUserName(String userName){
        getElement(txtUserName).sendKeys(userName);
        System.out.println(userName+" entered on UserName Textbox");
    }

    public void enterUserName(String userName1,String userName2){
        getElement(txtUserName).sendKeys(userName1+" "+userName2);
        System.out.println(userName1+" "+userName2+" entered on UserName Textbox");
    }
    public void enterPassword(String password){
        getElement(txtPassword).sendKeys(password);
        System.out.println(password+" entered on Password Textbox");
    }

    public void clickOnLogin(){
        getElement(btnLogin).click();
        System.out.println("click on login button");
    }

    public WebElement getElement(By locator){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
