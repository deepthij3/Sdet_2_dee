package com.sdet2.project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {
	public static void main(String args[]) throws EncryptedDocumentException, IOException {
		String dirpath=System.getProperty("user.dir");
		String Excelpath=dirpath+"/SDET2.xlsx";
		FileInputStream fis=new FileInputStream(Excelpath);
		Workbook workbook=WorkbookFactory.create(fis);
	 Sheet sheet = workbook.getSheet("Sheet1");
	 Row row =sheet.getRow(0);
		String value =row.getCell(1).getStringCellValue();
		
		System.out.println(value);
		
	}

}
