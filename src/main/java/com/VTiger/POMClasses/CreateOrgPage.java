package com.VTiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
WebDriver driver;

@FindBy(name="accountname")
private WebElement orgNametxtfld;

@FindBy(name="button")
private WebElement savebtn;

@FindBy(name="industry")
private WebElement industryDD;

@FindBy(name="rating")
private WebElement ratingDD;


@FindBy(name="accounttype")
private WebElement accTypeDD;

@FindBy(name="phone")
private WebElement phnnmbr;


public WebElement getPhnnmbr() {
	return phnnmbr;
}


public WebElement getOrgNametxtfld() {
	return orgNametxtfld;
}


public WebElement getSavebtn() {
	return savebtn;
}


public WebElement getIndustryDD() {
	return industryDD;
}


public WebElement getRatingDD() {
	return ratingDD;
}


public WebElement getAccTypeDD() {
	return accTypeDD;
}
public CreateOrgPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void createOrganization(String organizationName) {
	orgNametxtfld.sendKeys(organizationName);
	
}

}
