package com.ngtests;

import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OhrmAddEmpPOM {
    OhrmBase ohrm;

    @Parameters({"browser"})
    @BeforeClass
    public void OpenApplication(String brName){
        ohrm = new OhrmBase();
        ohrm.OpenApplication(brName);
    }
    @AfterClass
    public void closeApplication(){
        ohrm.closeApplication();
    }

    @Test
    public void login() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();

    }

    @Test(dependsOnMethods = "login")
    public void addEmployee(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnPIM();
        welcomePage.clickOnAddEmployee();
    }
}
