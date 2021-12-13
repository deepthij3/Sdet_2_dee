package com.VTiger.POMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.FileUtil;

public class LoginPage 
{
WebDriver driver;

@FindBy(name="user_name")
private WebElement username;

@FindBy(name="user_password")
private WebElement password;

@FindBy(id="submitButton")
private WebElement loginbtn;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return loginbtn;
}

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void LoginToApp() throws IOException {
	username.sendKeys(FileUtil.objforfileutil().readDatafromPropfile("username"));
	password.sendKeys(FileUtil.objforfileutil().readDatafromPropfile("password"));
	loginbtn.click();
	}
public void LoginToApp(String newusername, String newpassword) {
username.sendKeys(newusername);
password.sendKeys(newpassword);
loginbtn.click();
}

}
