package com.github.sdms.util;

import com.github.sdms.entity.Stu;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileInput {


    /*public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("D:/students.xls");
            List<Stu> stuList = getStuList(is);
            for (Stu stu : stuList) {
                System.out.println(stu);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }*/


    public List<Stu> getStuList(InputStream is) {
        List<Stu> stuList = new ArrayList<>();
        HSSFWorkbook workbook = null;
        try {
            workbook = new HSSFWorkbook(is);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int numsheet = 0; numsheet < workbook.getNumberOfSheets(); numsheet++) {
            HSSFSheet hssfSheet = workbook.getSheetAt(numsheet);
            if (hssfSheet == null) {
                continue;
            }
            for (int numrow = 1; numrow <= hssfSheet.getLastRowNum(); numrow++) {
                System.out.println(numrow);
                HSSFRow hssfRow = hssfSheet.getRow(numrow);
                if (hssfRow == null) {
                    continue;
                }
                Stu stu = new Stu();
                HSSFCell hssfCell = hssfRow.getCell(0);
                if (hssfCell == null) {
                    continue;
                }
                stu.setName(hssfCell.getStringCellValue());

                hssfCell = hssfRow.getCell(1);
                if (hssfCell == null) {
                    continue;
                }
                stu.setIdNo(hssfCell.getStringCellValue());

                hssfCell = hssfRow.getCell(2);
                if (hssfCell == null) {
                    continue;
                }
                stu.setClazzCode(hssfCell.getStringCellValue());

                hssfCell = hssfRow.getCell(3);
                if (hssfCell == null) {
                    continue;
                }
                stu.setAptName(hssfCell.getStringCellValue());

                hssfCell = hssfRow.getCell(4);
                if (hssfCell == null) {
                    continue;
                }
                hssfCell.setCellType(CellType.STRING);
                stu.setDormCode(hssfCell.getStringCellValue());

                hssfCell = hssfRow.getCell(5);
                if (hssfCell == null) {
                    continue;
                }

                stu.setCheckInDate(hssfCell.getDateCellValue());


                hssfCell = hssfRow.getCell(6);
                if (hssfCell == null) {
                    continue;
                }
                stu.setPaymentDeadline(hssfCell.getDateCellValue());

                hssfCell = hssfRow.getCell(7);
                if (hssfCell != null) {
                    stu.setRemarks(hssfCell.getStringCellValue());
                }

                stuList.add(stu);
            }

        }


        return stuList;
    }
}
