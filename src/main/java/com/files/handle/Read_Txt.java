package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Txt {

    public static void main(String[] args) {

        //FileReader
        //BufferedReader

        //File
        //FileInputStream
        String flPath = "src\\main\\resources\\Demo.txt";
        try {
            FileReader fr = new FileReader(flPath);
            BufferedReader br = new BufferedReader(fr);

            String ln = br.readLine();
//            ln.split(","); //comma seperated values

            while (ln!=null){
                System.out.println(ln);
                ln = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
