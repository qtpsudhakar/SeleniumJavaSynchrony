package com.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DemoParmTest {

    int n1;
    int n2;
    int res;

    public DemoParmTest(int n1, int n2,int res){
        this.n1 = n1;
        this.n2 = n2;
        this.res = res;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][] {
                {2,3,5},{1,2,4},{10,20,30}
        });
    }

    @Test
    public void demoTestAdd(){
        Assert.assertEquals(res,n1+n2);
    }
}
