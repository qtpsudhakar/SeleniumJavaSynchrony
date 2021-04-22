package com.ngtests;

import com.wd.pom.AddEmpPage;
import com.wd.pom.LoginPage;
import com.wd.pom.WelcomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OhrmAddEmpPOMBaseDDT extends BaseTest{

    @Test
    public void login() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUserName("admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();

    }

    @Test(dependsOnMethods = "login",dataProvider = "getData")
    public void addEmployee(String fname,String lname){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnPIM();
        welcomePage.clickOnAddEmployee();
        AddEmpPage addEmpPage = new AddEmpPage();
        addEmpPage.enterFirstName(fname);
        addEmpPage.enterLastName(lname);
        addEmpPage.clickOnSave();
    }

    @DataProvider
    public Object[][] getData(){
        //1st dimension controls iterations
        //2nd dimension controls parameters
        String data [][]= new String[2][2];
        //1st
        data[0][0] = "selenium";
        data[0][1] = "dev";
        //2nd
        data[1][0] = "web";
        data[1][1] = "driver";

        return data;
    }

}
