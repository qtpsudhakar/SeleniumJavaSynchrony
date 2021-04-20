package com.files.handle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Append_Txt {
    public static void main(String[] args) {
        //FileWriter
        //BufferedWriter

        String flPath = "src\\main\\resources\\Out.txt";

        try {
            FileWriter fw= new FileWriter(flPath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Line1");
            bw.newLine();
            bw.write("Line2");
            bw.newLine();
            bw.write("Line3");

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
