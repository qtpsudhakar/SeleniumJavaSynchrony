package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebUtils extends OhrmBase{

    public static boolean isElementExist(By locator){
        try {
            driver.findElement(locator);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public static void selectOptionalListItem(By locator,String itemName) {
        try {
            WebElement elm = driver.findElement(locator);
            try {
                new Select(elm).selectByVisibleText(itemName);
            } catch (NoSuchElementException ns) {
                new Select(elm).selectByIndex(1);
                System.out.println("List item is selected by index as " + itemName + " is not exist");
            }

        }catch(NoSuchElementException e){
            System.out.println("Failed because list element not found");
        }
    }
}
