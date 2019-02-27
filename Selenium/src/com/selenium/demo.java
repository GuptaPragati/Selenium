package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://demo.guru99.com/test/login.html";
System.setProperty("Webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver-v0.23.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get(url);
WebElement email = driver.findElement(By.xpath("//*[@id=\'email\']"));
WebElement password = driver.findElement(By.cssSelector("#passwd"));
email.sendKeys("abcd@gmail.com");
password.sendKeys("abcdefghlkjl");
/*driver.switchTo().frame("classFrame");
driver.findElement(By.linkText("Deprecated")).click();*/


	}

}
