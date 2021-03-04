package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() 
	{
		//first we need to open URL
		driver.get(baseURL);
		
		//we have to use page object class, Here below we are passing driver as argument, 
		//which are pre-defined in pageObject methods
		
		LoginPage lp = new LoginPage(driver);  //creating object of LoginPage
		lp.setUserName(username);    		   //by using the object lp call the methods
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		  Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}











