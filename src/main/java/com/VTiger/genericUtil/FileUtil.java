package com.VTiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtil {
	
	private FileUtil() {
		
	}
	public static FileUtil objforfileutil() {
	FileUtil prop= new FileUtil();
	return prop;

}
/**
 * @author Deepthi
 * This method read data from propfile
 * @param key
 * @return
 * @throws IOException  
 */
 public String readDatafromPropfile(String key) throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.propfilepath);
	 Properties prop= new Properties();
	 prop.load(fis);
	 return prop.getProperty(key);
 }
 
//   public String readDatafromPropfile(String key, String path) throws IOException {
//	FileInputStream fis=new FileInputStream(path);
//	Properties prop= new Properties();
//	 prop.load(fis);
//	 return prop.getProperty(key);
//	
// }
 /**
  * @author Deepthi
  * This method read data from propfile
  * @param key
  * @return
  * @throws IOException  
  */
 public String readIndustryDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Industry").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readRateDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForRatedd();
	 return workbook.getSheet("Rating").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readTypeDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Type of Org").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readIndDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Ind").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readSalDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Salutation Type").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readOrgnameDatafromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Organization Name").getRow(row).getCell(0).getStringCellValue();
 }
 
 public String readChildInDdfromExcel() throws IOException {
	 FileInputStream fis= new FileInputStream(IAutoConstants.excelpath);
	 Workbook workbook=WorkbookFactory.create(fis);
	 int row=JavaUtil.objectforJavaUtil().generateRandomnumForInddd();
	 return workbook.getSheet("Child IN Dd").getRow(3).getCell(0).getStringCellValue();
 }
 
 
 }