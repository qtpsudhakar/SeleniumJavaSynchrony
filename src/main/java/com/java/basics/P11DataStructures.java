package com.java.basics;

import java.util.ArrayList;

public class P11DataStructures {
    public static void main(String[] args) {
        //list, set , map

        ArrayList<Integer> users = new ArrayList<Integer>();
        users.add(10);
        users.add(20);
        users.add(30);
        users.add(0,100);
        System.out.println(users.get(0));


        //Java Array are type specific arrays
        //These are fixed length arrays
        int data[] = {10,20,30};
        System.out.println(data.length);

        ArrayList<Integer> fact = getFactors(100);

        for (int f:fact) {
            System.out.println(f);
        }
    }
    public static ArrayList<Integer> getFactors(int n){

        ArrayList<Integer> res = new ArrayList();

        for (int i=1;i<=n;i++){
            if (n%i==0){
                res.add(i);
            }
        }
        return res;
    }
    public static int[] getFactorsArr(int n){

        int out[] = new int[6];
        int j=0;

        for (int i=1;i<=n;i++){
            if (n%i==0){
                out[j]=i;
                j++;
            }
        }
        return out;
    }
}
