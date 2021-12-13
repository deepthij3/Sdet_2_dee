package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtil;

public class ContactsPage {

	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactImg;
	
	@FindBy(name="search_text")
	private WebElement contactsearchfortxtfld;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchForContactDD;
	
	@FindBy(name="submit")
	private WebElement searchNowbtn;

	public WebElement getCreateContactImg() {
		return createContactImg;
	}

	public WebElement getContactsearchfortxtfld() {
		return contactsearchfortxtfld;
	}

	public WebElement getSearchForContactDD() {
		return searchForContactDD;
	}

	public WebElement getSearchNowbtn() {
		return searchNowbtn;
	}
	public ContactsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void searchContact(String contactNameforsearch, String text){
			contactsearchfortxtfld.sendKeys(contactNameforsearch);
			WebDriverUtil util= new WebDriverUtil(driver);
			util.selectValueFromDd(text, searchForContactDD);
			searchNowbtn.click();
		}
	}
	
	
	
	
	
	
	
	

