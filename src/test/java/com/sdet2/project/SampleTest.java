package com.sdet2.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
public void cmdLineParameter() 
{
	WebDriver driver;
	String browser=System.getProperty("browser");
	String url=System.getProperty("url");
	System.out.println(browser);
	System.out.println(url);
	
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
	driver.get(url);
}
}
