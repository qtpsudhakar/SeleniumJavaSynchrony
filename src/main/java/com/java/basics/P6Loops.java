package com.java.basics;

public class P6Loops {

    public static void main(String[] args) {
        //print number from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //extended for loop
        int data[] = {10, 20, 30};
        for (int i : data) {
            System.out.println(i);
        }

        int j = 1;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
        } while (j < 10);
    }
}
