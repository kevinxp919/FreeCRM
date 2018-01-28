package com.crm.qa.testcases;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

public class NewContactPageTest extends TestBase{
  TestUtil tu;
  LoginPage lpt;
  HomePage hp;
  
  @Test
  public void f() {
	tu.switchToFrame();
  }
  public NewContactPageTest() {
	  super();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	initialization();
	tu= new TestUtil();
	lpt = new LoginPage();
	hp = new HomePage();
	lpt.enterDetails(pro.getProperty("username"), pro.getProperty("password"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	tu.switchToFrame();
	hp.clickOnNewContactLink();
	
  }

  @AfterMethod
  public void afterMethod() {
  }

}
