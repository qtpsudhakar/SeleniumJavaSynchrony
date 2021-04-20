package com.files.handle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData_Excel {
    public static void main(String[] args) {

        //xssf : xlsx
        //hssf : xls

        try {

            Workbook wb = new XSSFWorkbook();

            Sheet sht = wb.createSheet("outdata");

            Row hRow = sht.createRow(0);
            hRow.createCell(0).setCellValue("sn");
            hRow.createCell(1).setCellValue("empname");
            hRow.createCell(2).setCellValue("age");

            Row firstRow = sht.createRow(1);
            firstRow.createCell(0).setCellValue(1);
            firstRow.createCell(1).setCellValue("sudhakar");
            firstRow.createCell(2).setCellValue(36);

            String flPath ="src\\main\\resources\\Out.xlsx";
            FileOutputStream fos= new FileOutputStream(flPath);
            wb.write(fos);

            wb.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
