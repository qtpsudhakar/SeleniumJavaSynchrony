package com.java.oops;

public class CreateMail {
    public static void main(String[] args) {
        Gmail gmail = new Gmail();
        gmail.search();

        Google g1 = new Gmail();
        g1.search();

        g1.search("selenium");

        Google g2 = new Google();
        g2.search();
    }
}
