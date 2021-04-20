package com.files.handle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateData_Excel {
    public static void main(String[] args) {

        //xssf : xlsx
        //hssf : xls

        try {
            String flPath ="src\\main\\resources\\Out.xlsx";

            FileInputStream fl = new FileInputStream(flPath);
            Workbook wb;
            if (flPath.endsWith(".xlsx")){
                wb = new XSSFWorkbook(fl);
            }else {
                wb = new HSSFWorkbook(fl);
            }

            Sheet sht = wb.getSheet("outdata");

            int rc = sht.getLastRowNum();
            Row firstRow = sht.createRow(rc+1);
            firstRow.createCell(0).setCellValue(2);
            firstRow.createCell(1).setCellValue("balu");
            firstRow.createCell(2).setCellValue(20);

            FileOutputStream fos= new FileOutputStream(flPath);
            wb.write(fos);

            wb.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
