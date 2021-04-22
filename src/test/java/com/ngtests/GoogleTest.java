package com.ngtests;

import org.testng.annotations.*;

public class GoogleTest {

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
