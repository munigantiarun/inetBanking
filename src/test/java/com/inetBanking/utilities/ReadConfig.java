package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	
	//12-20 constructor to load complete file(config.properties)
	public ReadConfig(){
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//below code is to Read and return the value from properties file
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");   //pro object
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String cpath = pro.getProperty("chromepath");
		return cpath;
	}
	
	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
}











