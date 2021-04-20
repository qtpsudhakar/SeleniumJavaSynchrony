package com.java.basics;



import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class P12SetSample {
    public static void main(String[] args) {

        //hashset class
        HashSet<Integer> data = new HashSet<>();
        data.add(10);
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(20);
        data.add(30);

        System.out.println(data.size());

        for (int i:data){
            System.out.println(i);
        }
        TreeSet<Integer> data1 = new TreeSet<>();
        data1.add(10);
        data1.add(10);
        data1.add(20);
        data1.add(30);
        data1.add(40);
        data1.add(20);
        data1.add(30);

        for (int i:data1){
            System.out.println(i);
        }
       NavigableSet<Integer> data2 = data1.descendingSet();
        for (int i:data2){
            System.out.println(i);
        }

    }
}
