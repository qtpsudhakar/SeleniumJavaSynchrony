package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends OhrmBase {

    @FindBy(linkText = "PIM")
    private WebElement lnkPIM ;

    @FindBy(partialLinkText = "Add Emp")
    private WebElement lnkAddEmployee ;

    public void clickOnPIM(){
        lnkPIM.click();
        System.out.println("Clicked PIM link");
    }

    public void clickOnAddEmployee(){
        lnkAddEmployee.click();
        System.out.println("Clicked Add Employee link");
    }

}
