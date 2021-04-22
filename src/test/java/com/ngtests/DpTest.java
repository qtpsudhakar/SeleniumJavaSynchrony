package com.ngtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpTest {

    @Test(dataProvider = "getData")
    public void demoTest(String str1,String str2){
        System.out.println(str1);
        System.out.println(str2);
    }

    @DataProvider
    public Object[][] getData(){
        //1st dimension controls iterations
        //2nd dimension controls parameters
        String data [][]= new String[2][2];
        //1st
        data[0][0] = "hello";
        data[0][1] = "selenium";
        //2nd
        data[1][0] = "web";
        data[1][1] = "driver";

        return data;
    }
}
