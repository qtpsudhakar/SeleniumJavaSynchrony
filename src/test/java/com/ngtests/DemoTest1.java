package com.ngtests;

import org.testng.annotations.Test;

public class DemoTest1 {


    @Test(priority = 1)
    public void Test1(){
        System.out.println("This is test1");
    }

    @Test(priority = 3)
    public void Test2(){
        System.out.println("This is test2");
    }
    @Test
    public void Test3(){
        System.out.println("This is test3");
    }

    @Test
    public void Test4(){
        System.out.println("This is test4");
    }
}
