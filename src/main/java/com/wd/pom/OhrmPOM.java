package com.wd.pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmPOM {
    public static void main(String[] args) {

        OhrmBase ohrm = new OhrmBase();
        ohrm.OpenApplication("firefox");

        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnPIM();
        welcomePage.clickOnAddEmployee();

    }
}
