package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClasses.ContactsPage;
import com.VTiger.POMClasses.CreateContactPage;
import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.OrgForContactWindow;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.JavaUtil;
import com.VTiger.genericUtil.WebDriverUtil;

public class TC003_CreateContactWithOrganizationTest extends BaseClass 
{
//	static WebDriver driver;
//	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		//launch browser
//		String browser=FileUtil.objforfileutil().readDatafromPropfile("browser");
//	  if(browser.equals("chrome"))
//	  {
//		driver=new ChromeDriver();
//	  }
//	  else if(browser.equalsIgnoreCase("firefox")) 
//	  {
//			driver=new FirefoxDriver();
//		  }
//	  else if(browser.equalsIgnoreCase("safari"))
//	  {
//			driver=new SafariDriver();
//		  }
//	  else
//	  {
//		  driver=new ChromeDriver();
//	  }
//	//get URl
//	driver.get(FileUtil.objforfileutil().readDatafromPropfile("url"));
//	//Maximize window and wait
//WebDriverUtil util= new WebDriverUtil(driver);
//	util.maximizewindow();
//	util.pageLoadTimeout();
//	
//	//Login to app
//		LoginPage lp=new LoginPage(driver);
//		lp.LoginToApp();
		
		//Click on Contacts
		@Test(groups="smokeTest", retryAnalyzer=com.VTiger.genericUtil.RetryAnalyzer.class)
		public void createContactwithOrgname() throws InterruptedException
		{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		
//		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Create Contact
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactImg().click();
		
		CreateContactPage cc=new CreateContactPage(driver);
		String firstName=JavaUtil.objectforJavaUtil().getFirstName();
		String lastName=JavaUtil.objectforJavaUtil().getLastName();
		cc.createContact("Ms.", firstName, lastName, "Accounts");
		
		OrgForContactWindow cw=new OrgForContactWindow(driver);
		cw.organizationForContact("ATE", "Organization Name");
		WebDriverUtil util= new WebDriverUtil(driver);
		util.switchToWindow("Contacts");
		cc.getSaveBtn().click();
		
		Thread.sleep(1000);
		
		hp.getContactslink().click();
		
		cp.searchContact(lastName, "Last Name");
		

//			try {
			String text = driver.findElement(By.xpath("//a[text()='"+lastName+"'and @title='Contacts']")).getText();
			Assert.assertEquals(lastName, text);
//			if(text.equalsIgnoreCase(lastName))
//			{
//				System.out.println("Pass");
//			}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("Fail");
//			}
//			finally {
//			
////        logout
//			hp.logoutFromApp();
//			
//			Thread.sleep(1000);
//
//			driver.close();
//			}
	}
		
		@Test(groups="regressionTest",retryAnalyzer=com.VTiger.genericUtil.RetryAnalyzer.class)
		public void createContact() throws InterruptedException
		{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactImg().click();
		
		CreateContactPage cc=new CreateContactPage(driver);
		String lastName=JavaUtil.objectforJavaUtil().getLastName();
		cc.createContactwithLN(lastName);

		hp.getContactslink().click();
		
		cp.searchContact(lastName, "Last Name");
		

//			try {
			String text = driver.findElement(By.xpath("//a[text()='"+lastName+"'and @title='Contacts']")).getText();
			Assert.assertEquals(lastName, text);
//			if(text.equalsIgnoreCase(lastName))
//			{
//				System.out.println("Pass");
//			}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("Fail");
//			}
		
		}
		}
	
