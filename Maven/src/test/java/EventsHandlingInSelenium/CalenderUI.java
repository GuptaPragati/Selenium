package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");		
		String baseUrl="https://www.path2usa.com/travel-companions";
		WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
		 driver.findElement(By.id("travel_date")).click();
		 
		 while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		 {
		 driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		 }

		 List<WebElement> day=driver.findElements(By.className("day"));
		 int dayCount= day.size();
		 for(int i=0;i<dayCount;i++)
		 {
			 String dayText=day.get(i).getText();
			 if(dayText.equals("19"))
			 {
				 day.get(i).click();
				 break;
			 }
		 }
		/* Thread.sleep(20000);
		 WebDriverWait d=new WebDriverWait(driver,20);
	
		 d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div.sumo-form-wrapper.listbuilder-popup"))));
		 driver.findElement(By.tagName("svg")).click();
		*/
	}

}
