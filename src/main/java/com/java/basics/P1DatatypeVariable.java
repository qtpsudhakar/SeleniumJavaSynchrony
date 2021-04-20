package com.java.basics;

public class P1DatatypeVariable {
    public static void main(String[] args) {
        //byte : 8bit : -128 to 127

        byte b = 10;
        System.out.println(b);
        b=127;
        System.out.println(b);

        //short: 16 bit:
        short st = 10;
        st = 10000;
        st = 32000;

        //int : 32bit
        int i = 2140000000;

        //long : 64 bit
        long ln = 10;

        //long values should have sufixed with L/l
        long creditcard = 444433332222111L;

        //floating point types
        //float values should have sufixed with F/f
        //32bit
        float f = 1.111111111111111f;
        System.out.println(f);

        //double can store more float points
        //64bit
        double d = 1.1111111111111111111111;
        System.out.println(d);

        //char : 16 bit
        // can store only one character using single quote
        char c = 'a';
        System.out.println(c);

        //boolean : 8 bit
        //can store true or false literal
        boolean isExist = true;
    }
}
