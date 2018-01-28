package com.crm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewContactsPage extends TestBase{
@FindBy(xpath = "//select[@name = \"title\"]")
WebElement title;
@FindBy(xpath = ".//*[@id='first_name']")
WebElement firstName;
@FindBy(xpath = ".//*[@id='middle_initial']")
WebElement lastName;
@FindBy(xpath = "//select[@name = \"suffix\"]")
WebElement suffix;
@FindBy(xpath = ".//*[@id='image_file']")
WebElement image;
@FindBy(xpath = "//input[@name = \"nickname\"]")
WebElement nickname;
@FindBy(xpath = "//input[@name = \"client_lookup\"]")
WebElement company;
@FindBy(xpath = ".//*[@id='company_position']")
WebElement position;
@FindBy(xpath = "//select[@name = \"category\"]")
WebElement category;
@FindBy(xpath = ".//*[@id='fieldId_birthday']")
WebElement birthdate;
@FindBy(xpath = "//input[contains(@name, \"receive_email\") and contains(@value,\"N\") ]")
WebElement receiveEmail;


public NewContactsPage() {
	PageFactory.initElements(driver, this);	
}
public void titleSelect() {
	Select se = new Select(title);
	se.selectByIndex(3);
}
public void enterFirstName() {
	firstName.sendKeys("Kevin");
}
public void enterLastName() {
	lastName.sendKeys("Cai");
}
public void suffixSelect() {
	Select se1 = new Select(suffix);
	se1.selectByIndex(2);
}
public void imagebtn() throws AWTException {
	image.click();
	StringSelection ss = new StringSelection("C:\\Users\\Kevin-PC\\Desktop\\Screenshot2.PNG");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    Robot rb = new Robot();
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
}
}
