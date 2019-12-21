package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regexExam extends Thread {
	
	/*public regexExam()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
	}*/

public void run() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		String baseUrl="http://rediff.com";
		driver.get(baseUrl);
		/*Important Note:
			We can skip tagName while using syntax of xpath and Css by various ways if we remove tagName it finds elements on the basis of given attribute or value*/
		
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector("a[title*='Already']")).click();// by using css regex
	//	driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("HelloJi"); //by using regex for xpath 
	
		/*driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("HelloJi");//by using generating customized Xpath
		//Or
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("HelloJi");//here * will accept any attribute exactly match with id=login1 for xpath
		driver.findElement(By.cssSelector("[id='login1']")).sendKeys("helloJi");//accept any attribute exactly match id=login1 for css
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Hello ji");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Hello ji");//by using customizw css
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("fineJi");//by using regex for css
		System.out.println(driver.findElement(By.cssSelector("a.f12")).getText());*///by using tagName.className for css
		
	}

}
