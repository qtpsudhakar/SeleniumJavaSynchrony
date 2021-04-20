package com.java.basics;

public class P7DemoMaths {

    public static boolean findOdd(int n){
        if (n%2==1){
            return true;
        }else {
            return false;
        }
    }

    public int findFactorial(int n){
        //n*n-1*n-2
        int res =1;
        for (int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
