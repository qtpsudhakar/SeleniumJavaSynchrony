package com.ngtests;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class DpLib {

    @DataProvider
    public Object[][] getData(){
        //1st dimension controls iterations
        //2nd dimension controls parameters
        String data [][]= new String[2][2];
        //1st
        data[0][0] = "selenium";
        data[0][1] = "dev";
        //2nd
        data[1][0] = "web";
        data[1][1] = "driver";

        return data;
    }

    @DataProvider
    public Object[][] getExcelData(){

        String flPath ="src\\main\\resources\\Data.xlsx";

        //xssf : xlsx
        //hssf : xls

        try {
            FileInputStream fl = new FileInputStream(flPath);
            Workbook wb;
            if (flPath.endsWith(".xlsx")){
                wb = new XSSFWorkbook(fl);
            }else {
                wb = new HSSFWorkbook(fl);
            }

            Sheet sht = wb.getSheet("Sheet1");
            int rc = sht.getLastRowNum();
            int cc = sht.getRow(0).getLastCellNum();

            Object tcData[][] = new Object[rc][1];

            for (int r=1;r<=rc;r++){
                HashMap<String,String> rData = new HashMap<>();
                for (int c=0;c<cc;c++){
                    String dtKeyName = sht.getRow(0).getCell(c).toString();
                    String dtKeyVal = sht.getRow(r).getCell(c).toString();
                    rData.put(dtKeyName,dtKeyVal);
                }
                tcData[r-1][0] = rData;
            }

            wb.close();
            return tcData;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
