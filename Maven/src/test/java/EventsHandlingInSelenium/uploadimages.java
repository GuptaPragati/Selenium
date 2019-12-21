package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String baseUrl = "http://demo.guru99.com/test/upload/";
		 System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
			// String baseUrl = "http://demo.guru99.com/test/newtours/";
			  WebDriver driver= new ChromeDriver();
		                driver.get(baseUrl);    
		                WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		                // enter the file path onto the file-selection input field
		                uploadElement.sendKeys("C:\\Users\\Pragati\\Desktop\\Jyoti\\fourth.html");

		                // check the "I accept the terms of service" check box
		                driver.findElement(By.id("terms")).click();

		                // click the "UploadFile" button
		                driver.findElement(By.name("send")).click();

	}

}
