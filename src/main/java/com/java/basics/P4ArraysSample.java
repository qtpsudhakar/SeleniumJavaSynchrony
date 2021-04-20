package com.java.basics;

public class P4ArraysSample {
    public static void main(String[] args) {

        int data [] = {10,20,30};
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);

        String [] users={"user1","user2"};
        System.out.println(users[0]);
        System.out.println(users[1]);

        int numbers[] = new int[2]; //2 values can be stored
        numbers[0] = 10;
        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
        Object objVals[] ={"selenium",4};
        System.out.println(objVals[0]);
        System.out.println(objVals[1]);

//        Object ob1 = new P4ArraysSample();
        int matrix1[][] = new int[2][2]; //2 dimensional array
        matrix1[0][0] = 10;
        matrix1[0][1] = 20;
        matrix1[1][0] = 100;
        matrix1[1][1] = 200;

        Object usersData[][] = new Object[3][3];

        usersData[0][0] = "sudhakar";
        usersData[0][1] = 36;
        usersData[0][2] = "test automation";

        usersData[1][0] = "sudhakar";
        usersData[1][1] = 36;
        usersData[1][2] = "test automation";

        usersData[2][0] = "sudhakar";
        usersData[2][1] = 36;
        usersData[2][2] = "test automation";
    }
}
