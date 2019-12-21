package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl="http://spicejet.com/";
		  WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
	 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 
		 WebElement w=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		 System.out.println(w.getCssValue("position"));
	
		 
		 //Assertions is used to validate the actual result with our expected result to apply assertions we use Testing jars
		 //Validations
		 
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	}
	

}
