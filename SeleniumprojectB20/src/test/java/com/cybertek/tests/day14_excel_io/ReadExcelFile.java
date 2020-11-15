package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {

        String path="vytrack_testusers.xlsx";
        File file= new File(path);

        Workbook workbook= WorkbookFactory.create(file);
        int numOfSheet= workbook.getNumberOfSheets();

        System.out.println("Number of sheet = " + numOfSheet);

        Sheet sheet=workbook.getSheet("QA3-short");

        Row row1=sheet.getRow(0);
        Cell cell1=row1.getCell(0);

        String value1=cell1.getStringCellValue();

        System.out.println("Value of 1st row 1st column :"+value1);

       workbook.forEach(w -> System.out.println(w.getSheetName()));


        Iterator<Cell> cellIterator=row1.cellIterator();
        while (cellIterator.hasNext()){
            String value=cellIterator.next().getStringCellValue();
            System.out.print(value +" ");
        }
        System.out.println();
        System.out.println("===================================");
        Iterator<Row> rowIterator=sheet.rowIterator();

        while (rowIterator.hasNext()){
            Iterator<Cell> tempCellIterator= rowIterator.next().cellIterator();
            while (tempCellIterator.hasNext()){
                String value=tempCellIterator.next().getStringCellValue();
                System.out.print(value+" ");
            }
            System.out.println();
        }


    }
}
