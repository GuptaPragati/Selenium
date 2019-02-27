package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class common {

	public common() {
		// TODO Auto-generated constructor stub
		String url="http://demo.guru99.com/test/login.html";
		System.setProperty("Webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	}

}
