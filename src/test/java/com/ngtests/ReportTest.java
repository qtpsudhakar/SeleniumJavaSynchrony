package com.ngtests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReportTest {

    ExtentReports extent ;

    @BeforeClass
    public void iniReport(){
        extent = new ExtentReports();
        String clsName = this.getClass().getSimpleName();
        ExtentSparkReporter spark = new ExtentSparkReporter("src/../Reports/"+clsName+".html");
        extent.attachReporter(spark);
    }
    @Test
    public void Test1(){

        ExtentTest t1 = extent.createTest("MyFirstTest");

            try {
                System.out.println("demo test");
                t1.log(Status.PASS, "step1 pass");
                throw new RuntimeException("custom exception");
            }
            catch (RuntimeException e){

                t1.log(Status.FAIL, "step2 fail");
                throw e;
            }finally {
                extent.flush();
            }

    }
}
