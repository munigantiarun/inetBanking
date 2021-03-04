package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
//	These are common for every testcase. so we define the variables below
	public String baseURL = "http://www.demo.guru99.com/v4/index.php";
	public String username = "mngr311219";
	public String password = "apAzymU";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}


