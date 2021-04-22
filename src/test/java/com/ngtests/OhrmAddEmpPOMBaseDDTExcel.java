package com.ngtests;

import com.wd.pom.AddEmpPage;
import com.wd.pom.LoginPage;
import com.wd.pom.WelcomePage;
import org.testng.annotations.Test;

import java.util.HashMap;

public class OhrmAddEmpPOMBaseDDTExcel extends BaseTest{

    @Test
    public void login() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();

    }

    @Test(dependsOnMethods = "login",dataProvider = "getExcelData",dataProviderClass = DpLib.class)
    public void addEmployee(HashMap<String,String> empData) {

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnPIM();
        welcomePage.clickOnAddEmployee();
        AddEmpPage addEmpPage = new AddEmpPage();
        addEmpPage.enterFirstName(empData.get("fname"));
        addEmpPage.enterLastName(empData.get("lname"));
        addEmpPage.clickOnSave();
    }
}
