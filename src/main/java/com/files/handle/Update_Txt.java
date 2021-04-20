package com.files.handle;

import java.io.*;
import java.util.ArrayList;

public class Update_Txt {

    public static void main(String[] args) {

        //FileReader
        //BufferedReader

        //File
        //FileInputStream
        String flPath = "src\\main\\resources\\Demo.txt";
        try {
            FileReader fr = new FileReader(flPath);
            BufferedReader br = new BufferedReader(fr);

            ArrayList<String> lnData = new ArrayList<>();

            String ln = br.readLine();
            while (ln!=null){
                lnData.add(ln);
                ln = br.readLine();
            }

            br.close();
            fr.close();

            lnData.set(2,"test3 updated");

            FileWriter fw= new FileWriter(flPath);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String line:lnData){
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
