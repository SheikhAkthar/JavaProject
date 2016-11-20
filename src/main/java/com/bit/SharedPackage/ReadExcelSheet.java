package com.bit.SharedPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow  row;
	public static XSSFCell cell;
	
	public void readExcelSheet(String excelRead) throws IOException{
		
		FileInputStream fd = new FileInputStream(excelRead);
		
		 wb = new XSSFWorkbook(fd);
		 
		 sheet =  wb.getSheet("sheet1");
		 
		 row = sheet.getRow(0);
		 
		 cell = row.getCell(0);
		 
		 String cellValue =	cell.getStringCellValue();
		 
	}
	
	@DataProvider(name = "data")
	public static Object[][] getData() {
		
		Object[][] arrayObject = getExcelData(null);
		
		return arrayObject;
	}
	
	@Test(dataProvider = "data")	
	public static String[][] getExcelData(String excelPath){
		
		String[][] arrayExcelData = null;
		
	try {
		FileInputStream fd = new FileInputStream(excelPath);
		
		 wb = new XSSFWorkbook(fd);
		 
		 sheet = wb.getSheet(excelPath);
		 
		 int rowNum = sheet.getLastRowNum();
		
		 int cellNum = row.getLastCellNum();
			
		arrayExcelData = new String[rowNum][cellNum];
			
			
		for(int i = 0; i<rowNum; i++){
				 
				 for(int j = 0; j<cellNum;j++){
					 
					 String  cellValue = row.getCell(j).getStringCellValue();
					 
					 arrayExcelData[i][j] = cellValue;
					 
					 System.out.println(cellValue);
				 }
		  }
	}catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
return arrayExcelData;
}
	
	

}
