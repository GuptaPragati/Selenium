package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://www.qaclickacademy.com/interview.php";
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	  driver.findElement(By.xpath("//section[@id='content']/div/div/div[1]/ul/li[1]")).click();
    //    driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("http://www.qaclickacademy.com/interview.php");
       
        
        
	}

}
