package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long Implicity_Time =10;
	public static String registerFilePath;
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFCell Cell;
	public static int totalRow;
	public static int totalColumn;
	
public static Object[][] getTestData() throws IOException {
	registerFilePath = "F:\\TestData.xlsx";
	
	try {
		FileInputStream fis = new FileInputStream(registerFilePath);
		ExcelWBook = new XSSFWorkbook(fis);
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		totalRow =  ExcelWSheet.getLastRowNum();
		totalColumn = ExcelWSheet.getRow(0).getLastCellNum();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Object[][] testData = new Object[totalRow][totalColumn];
	for (int i=0; i<totalRow;i++) {
		for (int k=0;k<totalColumn;k++) {
		 testData[i][k] = ExcelWSheet.getRow(i+1).getCell(k).toString();
		}
		
	}
	
	return testData; 
	
	
}
public void switchToFrame() {
	
	driver.switchTo().frame("mainpanel");
}
public void swtichToTopFrame() {
	driver.switchTo().frame("processFrame");
}
}




