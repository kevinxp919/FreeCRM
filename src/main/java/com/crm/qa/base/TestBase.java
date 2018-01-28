package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;
    public TestBase() {
    try{
    	pro = new Properties();
    	FileInputStream fi = new FileInputStream("C:\\Users\\Kevin-PC\\eclipse-workspace\\FreeCRM_Test\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
    	pro.load(fi);
    	}catch(FileNotFoundException e) {
    	e.printStackTrace();	 		
    	}catch(IOException e) {
    	e.printStackTrace();		
    	}
    }
    public static void initialization() {
    	String browserName = pro.getProperty("browser");
    	String url = pro.getProperty("url");
    	if(browserName.equals("FireFox")) {
    	driver = new FirefoxDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	}	
    }
    
}
