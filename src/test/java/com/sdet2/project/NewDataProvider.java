package com.sdet2.project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.VTiger.genericUtil.IAutoConstants;

public class NewDataProvider {
@Test(dataProvider="getValue")
public void print(String value1,String value2)
{
	System.out.println(value1+" "+value2);
}
	
	
	@DataProvider()
	public Object[][] getValue() 
	{
		Object arr[][]=new Object[4][2];
		arr[0][0]="TYSS";
		arr[0][1]="HYD";
		
		arr[1][0]="QSP";
		arr[1][1]="CHENNAI";
		
		arr[2][0]="JSP";
		arr[2][1]="BANGLORE";
		
		arr[3][0]="PYSP";
		arr[3][1]="NOIDA";
		
		return arr;
	}

}

