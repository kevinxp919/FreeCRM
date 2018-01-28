package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
@FindBy (xpath = "//input[@name = \"username\"]")
WebElement username;
@FindBy(xpath = "//input[@name = \"password\"]")
WebElement password;
@FindBy(xpath = "//input[@type = \"submit\"]")
WebElement submitBtn;
@FindBy(xpath = "//td[contains(text(), 'User: tina cai')]")
WebElement logon;
public LoginPage() {
	
	PageFactory.initElements(driver, this);
}

public HomePage enterDetails(String un, String pw) {
	username.sendKeys(un);
	password.sendKeys(pw);
	submitBtn.sendKeys(Keys.ENTER);
	return new HomePage();
}
public String validateTitle() {
	
	String title =driver.getTitle();
	return title;
}
public boolean validateLogo() {
	return logon.isDisplayed();
	
}
}

