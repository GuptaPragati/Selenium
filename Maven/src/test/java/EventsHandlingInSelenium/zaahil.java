package example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zaahil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");		
		String baseUrl="https://www.zaahil.com";
		WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
		 driver.findElement(By.className("ng-scope")).click();
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 Thread.sleep(1000);
	//	 driver.findElement(By.xpath("//li[@ng-click='userAccountCtrl.change_tab(2)']")).click(); 
		 driver.findElement(By.xpath("//div[@class='col-md-12']/ul/li[2]")).click();
		 driver.findElement(By.name("userMobile")).sendKeys("8920954417");
		 driver.findElement(By.xpath("//*[@type='submit']")).submit();

	/*	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.findElement(By.cssSelector("div[class*='col-md-3']")).click();
	//	 WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement e= driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(1000);
		e.sendKeys("delhi");
		e.sendKeys(Keys.BACK_SPACE);
		 Actions a=new Actions(driver);
		 a.moveToElement(e).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 if(driver.findElement(By.cssSelector("[class*='close']")).isDisplayed())
		 {
			 driver.findElement(By.cssSelector("[class*='close']")).click(); 
			 
		 }
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 List<WebElement> list=driver.findElements(By.className("form-control"));
		 for(int x=0;x<list.size();x++)
		 { 
			 if(list.get(x).findElements(By.cssSelector("i[class*='pull-right']")).size()>0)
		 {
			 list.get(x).click();
			 List<WebElement> lists=driver.findElements(By.tagName("a"));
			 int count=lists.size();
			 for(int i=0;i<count;i++)
			 {
				if(lists.get(i).getText().contentEquals("Bikes"))
				{
					lists.get(i).click();
					break;
				}
				else
				{
					continue;
				}
			 }
			
			 break;
		 }	
		 else
			{
				continue;
			}
		 }
		 
	
		
	}
*/
}
}
