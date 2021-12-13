package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtil;

public class CreateContactPage {

	WebDriver driver;
	
	@FindBy(name="salutationtype")
	private WebElement salutationDD;
	
	@FindBy(name="firstname")
	private WebElement firstNametxtfld;
	
	@FindBy(name="lastname")
	private WebElement lastNametxtfld;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement addOrgforContact;
	
	@FindBy(name="button")
	private WebElement saveBtn;

	public WebElement getSalutationDD() {
		return salutationDD;
	}

	public WebElement getFirstNametxtfld() {
		return firstNametxtfld;
	}

	public WebElement getLastNametxtfld() {
		return lastNametxtfld;
	}

	public WebElement getAddOrgforContact() {
		return addOrgforContact;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public CreateContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createContactwithLN(String lastname) {
		lastNametxtfld.sendKeys(lastname);
		saveBtn.click();
	}
	
	
	public void createContact(String text, String firstname, String lastname,String titleOfWindow) {
		WebDriverUtil util= new WebDriverUtil(driver);
		util.selectValueFromDd(text, salutationDD);
		firstNametxtfld.sendKeys(firstname);
		lastNametxtfld.sendKeys(lastname);
		addOrgforContact.click();
		util.switchToWindow(titleOfWindow);
	}
	
}
