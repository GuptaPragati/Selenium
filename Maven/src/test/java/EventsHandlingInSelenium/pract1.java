package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;

public class pract1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	//	 String baseUrl="http://www.facebook.com";
		String baseUrl="http://demo.guru99.com/test/ajax.html";
		  WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
		 Thread.sleep(10000);
		/* driver.switchTo().frame("classFrame");
		 driver.findElement(By.linkText("Deprecated")).click();
*/
		 List<WebElement> elements=driver.findElements(By.name("name"));
         System.out.println("No. of elements=" +elements.size());
         for(int i=0;i<elements.size();i++)
         {
        	 System.out.println("Radio button text:" +elements.get(i).getAttribute("value")); 
         }
		 /* String tgName=driver.findElement(By.id("email")).getTagName();
		  System.out.println(tgName);
		 String verUrl=driver.getCurrentUrl();
		 System.out.println(verUrl);
		 System.out.println(driver.getPageSource().length());
		  String expedtedTitle="Facebook – log in or sign up";
		  String ActualTitle= driver.getTitle();
		  if(expedtedTitle.equalsIgnoreCase(ActualTitle)&& verUrl.equalsIgnoreCase(baseUrl))
		  {System.out.println("PASS");}
		  else
		  {
			  System.out.println("FAIL");  
		  }*/
		 
		 /* String alertMessage;

	      driver.get("http://jsbin.com/usidix/1");
	      driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	      
	      alertMessage = driver.switchTo().alert().getText();
	      Thread.sleep(1000);
	      driver.switchTo().alert().accept();
	     
	      System.out.println(alertMessage);
	      */


	}

}
