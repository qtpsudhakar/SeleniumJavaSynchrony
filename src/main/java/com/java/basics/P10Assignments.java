package com.java.basics;

public class P10Assignments {

    public static void main(String[] args) {
        P10Assignments pa = new P10Assignments();
        pa.printTable(5);
        pa.printDenominations(7777);
    }
    //write a function to print table
    //write a function to print minimum denominations for a number

    public void printDenominations(int n){
        int den[] ={2000,500,200,100,50,20,10,5,2,1};
        for (int d:den) {
            System.out.println(d+"*"+n/d);
            n=n%d;
        }
    }

    public void printTable(int n){
        //2*1 = 2
        //2*2 = 4
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
