package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClasses.CreateOrgPage;
import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.OrgInfoPage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.JavaUtil;

public class TC002_CreateOrganizationWithDropdownTest extends BaseClass
{
	@Test(groups="regressionTest", retryAnalyzer=com.VTiger.genericUtil.RetryAnalyzer.class)
	public void CreateOrganizationWithDropdown() throws InterruptedException
	{
    //click on Organization link
	
	HomePage hp=new HomePage(driver);
	hp.getOrglink().click();

//	click on create org
	OrgInfoPage orginfo=new OrgInfoPage(driver);
	orginfo.getCreateorgimg().click();

	
	
//	pass orgName
	String orgname= JavaUtil.objectforJavaUtil().getFirstName()+JavaUtil.objectforJavaUtil().generateRandomNumber();
		CreateOrgPage co=new CreateOrgPage(driver);
		co.createOrganization(orgname);
		
//		Industry type from dd
	 co.getIndustryDD().sendKeys("Construction");
	 
	 co.getRatingDD().sendKeys("Active");
	 
	 co.getAccTypeDD().sendKeys("Analyst");
	 
	 
	 
//		WebElement dd1 = driver.findElement(By.name("industry"));
//		
//
//		ExcelUtil eu=new ExcelUtil();
//		String industry=eu.selectValueforDd("VTDd", 0, "Construction");
//		util.selectValueFromDd(dd1, industry);
		
//		Select s1=new Select(dd1);
//		String industry=FileUtil.objforfileutil().readIndustryDatafromExcel();
//		s1.selectByValue(industry);
		
//		WebElement dd2 = driver.findElement(By.name("rating"));
//       String rate=eu.selectValueforDd("VTDd", 1, "Active");
//       util.selectValueFromDd(dd2, rate);

		
//		WebElement dd3 = driver.findElement(By.name("accounttype"));
//		String type=eu.selectValueforDd("VTDd", 2, "Analyst");
//		util.selectValueFromDd(dd3, type);

		co.getSavebtn().click();
		Thread.sleep(1000);
		
		hp.getOrglink().click();
		
		orginfo.searchForOrg(orgname, "Organization Name");
		
		orginfo.getSearchnowbtn().click();
	
	

//	Validation
		Thread.sleep(2000);
//try {
String ele = driver.findElement(By.xpath("//a[text()='"+orgname+"' and @title='Organizations']")).getText();
Assert.assertEquals(orgname, ele);
//if(ele.getText().equalsIgnoreCase(orgname))
//{
//	System.out.println("Pass");
//}
//}
//catch(Exception e)
//{
//	e.printStackTrace();
//	System.out.println("Fail");
//}
}
}

