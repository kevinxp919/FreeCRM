package com.crm.qa.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class RegisterPage extends TestBase{
	
	
@FindBy(xpath = "//a[text()='Sign Up']")
WebElement signUpLink;
@FindBy(xpath = ".//*[@id='payment_plan_id']")
WebElement edition;
@FindBy(xpath = "//input[@name=\"first_name\"]")
WebElement firstName;
@FindBy(xpath = "//input[@name = \"surname\"]")
WebElement lastName;
@FindBy(xpath = "//input[@name = \"email\"]")
WebElement email;
@FindBy(xpath = "//input[@name = \"email_confirm\"]")
WebElement confirmEmail;
@FindBy(xpath = "//input[@name = \"username\"]")
WebElement username;
@FindBy(xpath = "//input[@name = \"password\"]")
WebElement password;
@FindBy(xpath = "//input[@name = \"passwordconfirm\"]")
WebElement passwordConfirm;
@FindBy(xpath = "//input[@type = \"checkbox\"]")
WebElement agreeCheck;
@FindBy(xpath = ".//*[@id='submitButton']")
WebElement submitBtn;


public RegisterPage() {
	
	PageFactory.initElements(driver, this);
}

public void clickSignUpLink() {
	signUpLink.sendKeys(Keys.ENTER);	
}
public void selectEdition(String name) {
Select editionVersion = new Select(edition);
editionVersion.selectByVisibleText(name);	
}
public void enterUserdetails(String firstName, String lastName, String email, String confirmEmail, String username, String password,String passwordConfirm) {
 this.firstName.sendKeys(firstName);
 this.lastName.sendKeys(lastName);
 this.email.sendKeys(email);
 this.confirmEmail.sendKeys(confirmEmail);
 this.username.sendKeys(username);
 this.password.sendKeys(password);
 this.passwordConfirm.sendKeys(passwordConfirm);
}
public void clickAgreeCheck() {
	
	agreeCheck.click();
}
public void clickSubmitBtn() {
	
	submitBtn.click();
}
}

