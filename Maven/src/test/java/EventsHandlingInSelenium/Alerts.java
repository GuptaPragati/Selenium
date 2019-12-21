package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl="http://www.tizag.com/javascriptT/javascriptalert.php";
		
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//for ok done accept yes
		
	//	driver.switchTo().alert().dismiss();//to respond to some negative response
		
	}

}
