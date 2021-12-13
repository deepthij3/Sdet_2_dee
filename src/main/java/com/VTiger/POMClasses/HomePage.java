package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtil;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(id="qccombo")
	private WebElement quickCreateDD;
	

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;
	
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactslink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutimg;
	
	public WebElement getQuickCreateDD() {
		return quickCreateDD;
	}


	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getLogoutimg() {
		return logoutimg;
	}
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutFromApp() {
		WebDriverUtil util= new WebDriverUtil(driver);
		util.moveToElement(logoutimg);
		signoutlink.click();
	}
	
}
