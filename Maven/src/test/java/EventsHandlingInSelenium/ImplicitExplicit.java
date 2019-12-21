package example;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implicit wait applied to the driver while explicit wait applied to any particular locator
	System.setProperty("webdriver.chrome.driver",
				"E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	
		String baseUrl = "http://www.itgeared.com/demo/1506-ajax-loading.html";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		WebDriverWait d=new WebDriverWait(driver,20);
	     WebElement web=driver.findElement(By.xpath("//div[@id='results']"));
	System.out.println(d.until(ExpectedConditions.elementToBeClickable(web)).getText());	
	//	WebDriverWait d=new WebDriverWait(driver,20);
		//	d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
			//Thread.sleep(5000L);
	}		

}