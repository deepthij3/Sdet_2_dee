package com.sdet2.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.VTiger.genericUtil.FileUtil;

public class TC002_AmzonMobilesTest {
  public static void main(String[] args) throws IOException {
//	  System.getProperty(FileUtil.objforfileutil().readDatafromPropfile("browser"));
//	  System.setProperty("WebDriver.chrome.chromedriver", "./drivers/chromrdriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles under 15000");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
	
	  
  }
}
