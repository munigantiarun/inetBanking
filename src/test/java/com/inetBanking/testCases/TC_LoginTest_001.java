package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws InterruptedException 
	{
		//first we need to open URL
		driver.get(baseURL);
		logger.info("URL is opened");
		driver.manage().window().maximize();
		//we have to use page object class, Here below we are passing driver as argument, 
		//which are pre-defined in pageObject methods
		
		LoginPage lp = new LoginPage(driver);  //creating object of LoginPage
		Thread.sleep(2000);
		lp.setUserName(username);
		//by using the object lp call the methods
		logger.info("Username entered!");
		Thread.sleep(2000);
		lp.setPassword(password);
		logger.info("Password Entered!");
		Thread.sleep(2000);
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		  Assert.assertTrue(true);
		  logger.info("Login Test passed!");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
	}
}











