package com.crm.qa.testcases;

import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
  public LoginPage lp;
  public String usernameText;
  public String passwordText;
   	
  public LoginPageTest() {
	  
	  super();
	  }
	
  @Test (priority = 1)
  public void enterUsernameTest() {
	 lp.enterDetails(pro.getProperty("username"), pro.getProperty("password"));
	 System.out.println(lp.validateTitle());
	  
  }
  @Test (priority =2)
  public void validateTitleTest() {
	  
	  String title = lp.validateTitle();
	  Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
  }
  @BeforeMethod
  public void beforeMethod() {
	  initialization();
	  lp= new LoginPage();
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
