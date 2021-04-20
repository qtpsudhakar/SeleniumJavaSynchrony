package com.java.basics;

public class P5Conditions {

    public static void main(String[] args) {
        int n=10;
        if (n%2==1){
            System.out.println(n+" is odd number");
        }else {
            System.out.println(n+" is even number");
        }

        //write a program to find which variable has big number
        int x = 10;
        int y= 20;

        if (x>y) {
            System.out.println("x is bigger");
        }else if (y>x){
            System.out.println("y is bigger");
        }else{
            System.out.println("Both are equal");
        }

        //find capital by statecode
        String stCode= "ts";
        switch (stCode){
            case "ts":
                System.out.println("Hyderabad");
                break;
            case "ap":
                System.out.println("amaravathi");
                break;
            default:
                System.out.println("no state found");
        }
    }
}
