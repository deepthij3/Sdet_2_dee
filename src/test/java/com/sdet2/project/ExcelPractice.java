package com.sdet2.project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice {
	public int getLastRow(String sheetname) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./DataProPract.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		return sheet.getLastRowNum();
	}
	
	public String selectValue(String sheetname, int cell, int row) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./DataProPract.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet= workbook.getSheet(sheetname);
		int lastrow= getLastRow(sheetname);
		String value="Null";
		
		
			value=sheet.getRow(row).getCell(cell).getStringCellValue();
			workbook.close();
		return value;
}
}