package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmpPage extends OhrmBase{

    private By txtFirstName = By.id("firstName");
    private By txtLastName = By.id("lastName");
    private By btnSave = By.id("btnSave");

    public void enterFirstName(String firstName){
        getElement(txtFirstName).sendKeys(firstName);
        System.out.println(firstName+" entered on FirstName Textbox");
    }

    public void enterLastName(String lastName){
        getElement(txtLastName).sendKeys(lastName);
        System.out.println(lastName+" entered on LastName Textbox");
    }

    public void clickOnSave(){
        getElement(btnSave).click();
        System.out.println("click on save button");
    }

    public WebElement getElement(By locator){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
