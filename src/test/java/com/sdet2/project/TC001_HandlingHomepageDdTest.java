package com.sdet2.project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.VTiger.POMClasses.HomePage;
import com.VTiger.POMClasses.LoginPage;
import com.VTiger.genericUtil.FileUtil;
import com.VTiger.genericUtil.WebDriverUtil;

public class TC001_HandlingHomepageDdTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch browser
		String browser=FileUtil.objforfileutil().readDatafromPropfile("browser");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) 
	  {
			driver=new FirefoxDriver();
		  }
	  else if(browser.equalsIgnoreCase("safari"))
	  {
			driver=new SafariDriver();
		  }
	  else
	  {
		  driver=new ChromeDriver();
	  }
	  
//		get URl
	  
	  driver.get(FileUtil.objforfileutil().readDatafromPropfile("url"));
	  
//		Maximize window and wait

	  WebDriverUtil util= new WebDriverUtil(driver);
	  util.maximizewindow();
	  util.pageLoadTimeout();

//		Login to app
	  
	  	LoginPage lp=new LoginPage(driver);
	  	lp.LoginToApp();
	  	
	  	List<WebElement> dd = driver.findElements(By.xpath("//select[@id='qccombo']/option"));
	  	
	  	for(int i=0;i<=dd.size()-1;i++)
	  	{
	  		String text=dd.get(i).getText();
	  		if(text.equalsIgnoreCase("New Project"))
	  		{
	  			dd.get(i).click();
	  		}
	  	}
	    HomePage hp=new HomePage(driver);
	    hp.logoutFromApp();
	  	driver.close();
	}  	
}
