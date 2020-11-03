package com.github.sdms.util;

import cn.hutool.poi.excel.sax.CellDataType;
import com.github.sdms.entity.Stu;
import com.github.sdms.service.StuService;
import com.github.sdms.service.impl.StuServiceImpl;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

public class FileOutput {


    public void createExcel(List<Stu> stuList){
        System.out.println("fileoutput调用啦");
        HSSFWorkbook hssfWorkbook=new HSSFWorkbook();
        HSSFSheet hssfSheet=hssfWorkbook.createSheet("学生信息表");
        HSSFRow hssfRow=hssfSheet.createRow(0);
        HSSFCell hssfCell=hssfRow.createCell(0);
        hssfCell.setCellValue("姓名");


        hssfCell=hssfRow.createCell(1);
        hssfCell.setCellValue("身份证号");


        hssfCell=hssfRow.createCell(2);
        hssfCell.setCellValue("班级编码");


        hssfCell=hssfRow.createCell(3);
        hssfCell.setCellValue("班主任姓名");


        hssfCell=hssfRow.createCell(4);
        hssfCell.setCellValue("公寓名称");


        hssfCell=hssfRow.createCell(5);
        hssfCell.setCellValue("宿舍编号");


        hssfCell=hssfRow.createCell(6);
        hssfCell.setCellValue("入住日期");

        hssfCell=hssfRow.createCell(7);
        hssfCell.setCellValue("截止日期");

        hssfCell=hssfRow.createCell(8);
        hssfCell.setCellValue("备注");


        for (int listnum=0;listnum<stuList.size();listnum++) {
            hssfRow=hssfSheet.createRow(listnum+1);
            Stu stu=stuList.get(listnum);
            hssfCell=hssfRow.createCell(0);
            hssfCell.setCellValue(stu.getName());


            hssfCell=hssfRow.createCell(1);
            hssfCell.setCellValue(stu.getIdNo());


            hssfCell=hssfRow.createCell(2);
            hssfCell.setCellValue(stu.getClazzCode());


            hssfCell=hssfRow.createCell(3);
            hssfCell.setCellValue(stu.getTchName());

            hssfCell=hssfRow.createCell(4);
            hssfCell.setCellValue(stu.getAptName());


            hssfCell=hssfRow.createCell(5);
            hssfCell.setCellValue(stu.getDormCode());


            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            hssfCell=hssfRow.createCell(6);
            hssfCell.setCellValue(simpleDateFormat.format(stu.getCheckInDate()));

            hssfCell=hssfRow.createCell(7);
            hssfCell.setCellValue(simpleDateFormat.format(stu.getPaymentDeadline()));

            hssfCell=hssfRow.createCell(8);
            hssfCell.setCellValue(stu.getRemarks());
        }

        try {
            OutputStream outputStream = new FileOutputStream("D:/text.xls");
            hssfWorkbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
