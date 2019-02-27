package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://jqueryui.com/droppable/";
		driver.get(url);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
	/*	driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();*/
	}

}
