package com.java.basics;

public class P3TypeCast {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        System.out.println(str1+str2);

        byte n1 = Byte.parseByte(str1);
        byte n2 = Byte.parseByte(str2);
        System.out.println(n1+n2);

        byte b = 100; //8 bit
        int i = b; //32 bit implicit casting

        b= (byte)i; //explicit casting

        //wrappers on primitive : Wrapper types

        //byte : Byte
        //short : Short
        //int : Integer
        //long : Long
        //float : Float
        //double : Double
        //char: Character
        //boolean: Boolean
    }
}
