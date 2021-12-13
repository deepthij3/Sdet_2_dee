package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClasses.CreateOrgPage;
import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.OrgInfoPage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.JavaUtil;


public class TC001_CreateOrganizationTest extends BaseClass
{

  	@Test(groups="smokeTest", retryAnalyzer=com.VTiger.genericUtil.RetryAnalyzer.class)
	public void createOrganization() throws InterruptedException
	{
		
  	HomePage hp=new HomePage(driver);
  	hp.getOrglink().click();

  	OrgInfoPage orginfo=new OrgInfoPage(driver);
  	orginfo.getCreateorgimg().click();


String orgname=JavaUtil.objectforJavaUtil().getFullName()+JavaUtil.objectforJavaUtil().generateRandomNumber();


//	Save organization

	CreateOrgPage co=new CreateOrgPage(driver);
	co.createOrganization(orgname);
	co.getSavebtn().click();
	driver.navigate().refresh();
//	validation
	hp.getOrglink().click();


	orginfo.searchForOrg(orgname, "Organization Name");


	orginfo.getSearchnowbtn().click();

	Thread.sleep(2000);
	
	
		String organizationname=driver.findElement(By.xpath("//a[text()='"+orgname+"' and @title='Organizations']")).getText();
		Assert.assertEquals(orgname, organizationname);

   }
  	@Test(groups="regressionTest", retryAnalyzer=com.VTiger.genericUtil.RetryAnalyzer.class)
  	public void createOrgWithPhonenumber() throws InterruptedException
	{
		
  	HomePage hp=new HomePage(driver);
  	hp.getOrglink().click();

  	OrgInfoPage orginfo=new OrgInfoPage(driver);
  	orginfo.getCreateorgimg().click();


String orgname=JavaUtil.objectforJavaUtil().getFullName()+JavaUtil.objectforJavaUtil().generateRandomNumber();
String cellPhone=JavaUtil.objectforJavaUtil().getPhoneNumber();

//	Save organization

	CreateOrgPage co=new CreateOrgPage(driver);
	co.createOrganization(orgname);
	co.getPhnnmbr().sendKeys(cellPhone);
	co.getSavebtn().click();
	driver.navigate().refresh();
//	validation
	hp.getOrglink().click();


	orginfo.searchForOrg(cellPhone, "Phone");


	orginfo.getSearchnowbtn().click();

	Thread.sleep(2000);
	
	String organizationname=driver.findElement(By.xpath("//a[text()='"+orgname+"' and @title='Organizations']")).getText();
	Assert.assertEquals(orgname, organizationname);
//	try {
//		String organizationname=driver.findElement(By.xpath("//a[text()='"+orgname+"' and @title='Organizations']")).getText();
//		if(organizationname.equalsIgnoreCase(orgname))
//		{
//			System.out.println("Pass");
//		}
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//		System.out.println("fail");
//	}

   }
  }
  	
