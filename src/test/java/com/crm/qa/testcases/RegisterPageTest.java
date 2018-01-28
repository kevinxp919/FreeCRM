package com.crm.qa.testcases;

import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.RegisterPage;
import com.crm.qa.pages.RegisterPage2;
import com.crm.qa.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class RegisterPageTest extends TestBase {
   TestUtil tu;
   RegisterPage rp;
   RegisterPage2 rp2;

 
  public RegisterPageTest() { 
	  super();
  }
  
  @BeforeMethod
  public void setUp() {
      initialization();
	  rp = new RegisterPage();
	  tu = new TestUtil();
	  rp2 = new RegisterPage2();
      driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_Time, TimeUnit.SECONDS);
      rp.clickSignUpLink();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      rp.selectEdition("Free Edition");
	  
	  
  }

  @DataProvider
  public Object[][] getRegisterData() throws IOException {
	  Object[][] data = tu.getTestData();
	  return data; 
  }
  @Test(dataProvider = "getRegisterData")
  public void enterUserdetailsTest (String firstName, String lastName, String email, String confirmEmail, String username, String password,String passwordConfirm) throws Exception{
	 
	  rp.enterUserdetails(firstName, lastName, email, confirmEmail, username, password,passwordConfirm);
      rp.clickAgreeCheck();
      rp.clickSubmitBtn();
      rp2.enterCompanyName();
      rp2.enterPhone();
      rp2.enterFax();
      rp2.enterWebsite();
      rp2.enterCompanyEmail();
      rp2.enterDescription();
      rp2.enterAddress();
      rp2.enterCity();
      rp2.enterState();
      rp2.enterPostcode();
      rp2.enterCountry();
      rp2.clickCheckBox();
      rp2.clickSubmitBtn();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      rp2.clickCompleteReg();
      
  }

  @AfterMethod
  public void afterMethod(){
	 //driver.close();
  }


 
}
