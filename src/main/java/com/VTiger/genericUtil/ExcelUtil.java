package com.VTiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
public int getLastRow(String sheetname) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet(sheetname);
	return sheet.getLastRowNum();
	
}
	
public String selectValueforDd(String sheetname, int cell, String Ddvalue) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis=new FileInputStream(IAutoConstants.excelpath);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet= workbook.getSheet(sheetname);
	int lastrow= getLastRow(sheetname);
	String value="Null";
	for(int i=0;i<=lastrow; i++) 
	{
		value=sheet.getRow(i).getCell(cell).getStringCellValue();
		if(value.equalsIgnoreCase(Ddvalue))
		{
			break;
		}
	}
return value;
}
}
