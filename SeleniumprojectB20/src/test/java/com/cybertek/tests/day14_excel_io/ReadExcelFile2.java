package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile2 {
    public static void main(String[] args) throws IOException {
        String path="vytrack_testusers.xlsx";
        File file=new File(path);

        Workbook workbook= WorkbookFactory.create(file);

        Sheet sheet=workbook.getSheet("QA3-short");

        int rowNum= sheet.getLastRowNum();
        int colmNum=sheet.getRow(0).getLastCellNum();

        for (int rowindex=0; rowindex<=rowNum;rowindex++){

            for (int columIndex=0;columIndex<colmNum;columIndex++){
                String value=sheet.getRow(rowindex).getCell(columIndex).getStringCellValue();
                System.out.printf("%15s  ",value );
            }
            System.out.println();
        }
        System.out.println("=================================");

        for (Row row: sheet){
            for (Cell cell:row){
                System.out.printf("%15s ",cell.getRichStringCellValue()+" ");
            }
            System.out.println();
        }



    }
}
