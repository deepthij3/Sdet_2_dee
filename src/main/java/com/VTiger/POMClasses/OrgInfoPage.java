package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtil;

public class OrgInfoPage {

	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorgimg;
	
	@FindBy(name="search_text")
	private WebElement searchbox;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchfororgDD;
	 
	@FindBy(name="submit")
	private WebElement searchnowbtn;

	public WebElement getCreateorgimg() {
		return createorgimg;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchfororgDD() {
		return searchfororgDD;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}
	
	public OrgInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchForOrg(String orgnameforsearch,String text) {
		searchbox.sendKeys(orgnameforsearch);
		WebDriverUtil util= new WebDriverUtil(driver);
		util.selectValueFromDd(text, searchfororgDD);
		searchnowbtn.click();
	}
		
	
}
