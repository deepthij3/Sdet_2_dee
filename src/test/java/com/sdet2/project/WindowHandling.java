package com.sdet2.project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Set<String> winids=driver.getWindowHandles();
	for(String id: winids) {
		String title=driver.switchTo().window(id).getTitle();
		System.out.println(title);
	
	if(title.equalsIgnoreCase("Tech Mahindra"))
	{
		driver.close();
	}
 }
}
}
