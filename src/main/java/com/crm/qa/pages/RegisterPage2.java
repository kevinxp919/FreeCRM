package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class RegisterPage2 extends TestBase{
@FindBy(xpath = ".//*[@id='company_name']")
WebElement companyName;
@FindBy(xpath = ".//*[@id='phone']")
WebElement phone;
@FindBy(xpath = ".//*[@id='fax']")
WebElement fax;
@FindBy(xpath = ".//*[@id='website']")
WebElement website;
@FindBy(xpath = ".//*[@id='company_email']")
WebElement companyEmail;
@FindBy(xpath = ".//*[@id='service']")
WebElement description;
@FindBy(xpath = ".//*[@id='address']")
WebElement address;
@FindBy(xpath = ".//*[@id='city']")
WebElement city;
@FindBy(xpath = ".//*[@id='state']")
WebElement state;
@FindBy(xpath = ".//*[@id='postcode']")
WebElement postcode;
@FindBy(xpath = "//select[@name = \"country\"]")
WebElement country;
@FindBy(xpath = "//input[@name = \"copy_address\"]")
WebElement checkBox;
@FindBy(xpath = "//button[@name= \"btnSubmit\"]")
WebElement submitBtn;
@FindBy(xpath = "//button[@name=\"finish\"]")
WebElement completeReg;



public RegisterPage2() {
	
 PageFactory.initElements(driver, this);	
}

public void enterCompanyName() {
	
	companyName.sendKeys("OZlink");
}
public void enterPhone() {
	phone.sendKeys("6666666");
}
public void enterFax() {
	fax.sendKeys("6666666");
}
public void enterWebsite() {
	website.sendKeys("www.utas.edu.au");
	
}
public void enterCompanyEmail() {
	companyEmail.sendKeys("asdadasd@gmail.com");
	
}
public void enterDescription() {
	
	description.sendKeys("helloworld");
}
public void enterAddress() {
	
	address.sendKeys("15 Springwood view Bundoora");
}
public void enterCity() {
	city.sendKeys("Melbourne");
}
public void enterState() {
	state.sendKeys("vic");
}
public void enterPostcode() {
	postcode.sendKeys("3083");
}
public void enterCountry() {
	Select iCountry = new Select (country);
	iCountry.selectByVisibleText("Australia");
	
}	
public void clickCheckBox() {
	checkBox.click();
	
}
public void clickSubmitBtn() {
	submitBtn.click();
}
public void clickCompleteReg() {
	
	completeReg.click();
}
}




