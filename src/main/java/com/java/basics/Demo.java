package com.java.basics;

public class Demo {

    //main method executes when we run a class
    public static void main(String[] args) {

        int x =10;
        System.out.println(x);
        findOdd(11);
    }

    public static void findOdd(int n){
        if (n%2==1){
            System.out.println(n+ " is odd number");
        }else{
            System.out.println(n+ " is even number");
        }
    }
}
