package com.cg.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
	@Test
	public void methd() throws IOException {
		File file=new File("C:\\Users\\MOHAKHTA\\Downloads\\MyFirstExcel.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(input);
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println("Total number of rows are:"+row);
		for(int i=0;i<=row;i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
		}
		
		
		
	}

}
