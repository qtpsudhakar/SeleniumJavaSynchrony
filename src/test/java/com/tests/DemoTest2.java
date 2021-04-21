package com.tests;

import com.categories.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DemoTest2 {

    @Category(Smoke.class)
    @Test
    public void test3(){
        System.out.println("this is demo test3");
    }
    
    @Test
    public void test1(){
        System.out.println("this is demo test1");
    }

    @Test
    public void test2(){
        System.out.println("this is demo test2");
    }
}
