package com.ngtests;

import com.wd.pom.AddEmpPage;
import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OhrmAddEmpPOMBase extends BaseTest{

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
        AddEmpPage addEmpPage = new AddEmpPage();
        addEmpPage.enterFirstName("selenium");
        addEmpPage.enterLastName("dev");
        addEmpPage.clickOnSave();
    }


}
