package com.ngtests;

import com.wd.pom.OhrmBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    OhrmBase ohrm;

    @Parameters({"browser"})
    @BeforeClass
    public void OpenApplication(@Optional("chrome")String brName){
        ohrm = new OhrmBase();
        ohrm.OpenApplication(brName);
    }
    @AfterClass
    public void closeApplication(){
        ohrm.closeApplication();
    }

}
