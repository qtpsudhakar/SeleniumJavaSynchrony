package com.ngtests;

import org.testng.annotations.*;

public class GoogleTest {

    @BeforeSuite
    public void setSetup(){
        System.out.println("this is before suite");
    }

    @AfterSuite
    public void closeSetup(){
        System.out.println("this is after suite");
    }
    @BeforeTest
    public void setTestSetup(){
        System.out.println("this is before test");
    }

    @AfterTest
    public void closeTestSetup(){
        System.out.println("this is after test");
    }

    @BeforeClass
    public void openApplication(){
        System.out.println("Gmail Opened");
    }

    @AfterClass
    public void closeApplication(){
        System.out.println("Gmail Closed");
    }
    @BeforeMethod
    public void login(){
        System.out.println("Login to application");
    }

    @AfterMethod
    public void logout(){
        System.out.println("Logged out of application");
    }

    @Test
    public void CreateAndSendMail(){
        System.out.println("Mail created and sent");
    }

    @Test(enabled = false)
    public void CheckMail(){
        System.out.println("Mail checked");
    }
}
