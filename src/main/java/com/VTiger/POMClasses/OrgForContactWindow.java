package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtil;

public class OrgForContactWindow {
	
	WebDriver driver;
	
	@FindBy(id="search_txt")
	private WebElement searchTxtfld;
	
	@FindBy(name="search_field")
	private WebElement orgNameDD;
	
	@FindBy(name="search")
	private WebElement searchNowbtn;
	
	@FindBy(id="4")
	private WebElement chooseOrg;

	public WebElement getChooseOrg() {
		return chooseOrg;
	}

	public WebElement getSearchTxtfld() {
		return searchTxtfld;
	}

	public WebElement getOrgNameDD() {
		return orgNameDD;
	}

	public WebElement getSearchNowbtn() {
		return searchNowbtn;
	}

	public OrgForContactWindow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void organizationForContact(String orgName,String text) {
		searchTxtfld.sendKeys(orgName);
		WebDriverUtil util= new WebDriverUtil(driver);
		util.selectValueFromDd(text, orgNameDD);
		searchNowbtn.click();
		chooseOrg.click();
	}
}
