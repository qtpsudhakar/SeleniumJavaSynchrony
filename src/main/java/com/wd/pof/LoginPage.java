package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends OhrmBase {

    @FindBy(xpath = "//input[@name='txtUsername']")
    private WebElement txtUserName;

    @FindBy(xpath = "//input[@name='txtPassword']")
    private WebElement txtPassword;

    @FindBy(xpath = "//input[@value='LOGIN']")
    private WebElement btnLogin;

    LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String userName){
        txtUserName.sendKeys(userName);
        System.out.println(userName+" entered on UserName Textbox");
    }

    public void enterUserName(String userName1,String userName2){
        txtUserName.sendKeys(userName1+" "+userName2);
        System.out.println(userName1+" "+userName2+" entered on UserName Textbox");
    }
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
        System.out.println(password+" entered on Password Textbox");
    }

    public void clickOnLogin(){
        btnLogin.click();
        System.out.println("click on login button");
    }

}
