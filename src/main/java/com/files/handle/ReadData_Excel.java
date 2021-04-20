package com.files.handle;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ReadData_Excel {
    public static void main(String[] args) {

        String flPath ="src\\main\\resources\\Data.xlsx";
        File fl = new File(flPath);
        //xssf : xlsx
        //hssf : xls

        try {
            Workbook wb = new XSSFWorkbook(fl);
            Sheet sht = wb.getSheet("Sheet1");
            int rc = sht.getLastRowNum();
            int cc = sht.getRow(0).getLastCellNum();

            for (int r=0;r<=rc;r++){

                for (int c=0;c<cc;c++){
                    String dt = sht.getRow(r).getCell(c).toString();
                    System.out.println(dt);
                }
            }

            wb.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
