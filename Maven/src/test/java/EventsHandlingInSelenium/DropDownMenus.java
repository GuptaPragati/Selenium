package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl="http://www.makemytrip.com/";
	    WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);
		WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
		destination.sendKeys("DEL");
		
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
         destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
			
	}

	

}
