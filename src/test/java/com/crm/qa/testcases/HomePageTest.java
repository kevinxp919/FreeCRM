package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.NewContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewContactsPage contactsPage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new NewContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.enterDetails(pro.getProperty("username"), pro.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
    @Test(priority=2)
	public void verifyUserNameTest(){
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
