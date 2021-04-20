package com.java.basics;

public class P2RefTypes {
    public static void main(String[] args) {

        String str = "hello";

        String n1= "10";
        String n2 = "20";
        System.out.println(n1+n2);

        Object obj = 10; //Object is super type in java.
        System.out.println(obj);
        obj = "hello";
        System.out.println(obj);

    }
}
