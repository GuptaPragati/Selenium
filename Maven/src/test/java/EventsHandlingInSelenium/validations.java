package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class validations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl="http://spicejet.com/";
		  WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
	
		Thread.sleep(1000);
		/*System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//run this line and observe wrong o/p true is giving in place of false
		 * hence isEnable() function is not suitable at all		 
*/	
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	{
		Assert.assertTrue(true);
		System.out.println("is disable");
	}
	
	else
	{
		Assert.assertTrue(false);
	}
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		Assert.assertTrue(true);
		System.out.println("is enable");
	}
	
	else
	{
		Assert.assertTrue(false);
	}
	
	
	}
	

}
