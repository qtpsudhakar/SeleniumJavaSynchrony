package com.files.handle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ReadTCData_Excel {
    public static void main(String[] args) {

       HashMap<String,String> rtData= getTCData("TC_AddEmp_001");
       System.out.println(rtData);

    }

    public static HashMap<String, String> getTCData(String expTCID){

        String flPath ="src\\main\\resources\\Data.xlsx";

        //xssf : xlsx
        //hssf : xls
        HashMap<String,String> tcData = null;

        try {
            FileInputStream fl = new FileInputStream(flPath);
            Workbook wb;
            if (flPath.endsWith(".xlsx")){
                wb = new XSSFWorkbook(fl);
            }else {
                wb = new HSSFWorkbook(fl);
            }

            Sheet sht = wb.getSheet("AllTC");
            int rc = sht.getLastRowNum();
            int cc = sht.getRow(0).getLastCellNum();

            tcData = new HashMap<>();

            for (int r=0;r<=rc;r++){

                //TC_AddEmp_001
                String actTcID = sht.getRow(r).getCell(0).toString();

                if (actTcID.equalsIgnoreCase("TC_AddEmp_001")){
                    for (int c=0;c<cc;c++){
                        String dtKeyName = sht.getRow(0).getCell(c).toString();
                        String dtKeyVal = sht.getRow(r).getCell(c).toString();
                        tcData.put(dtKeyName,dtKeyVal);
                    }
                    break;
                }

            }

            wb.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tcData;
    }
}
