package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotCaptcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");		
		String baseUrl="https://spinbot.com/Login";
		WebDriver driver= new ChromeDriver();
		 driver.get(baseUrl);
		 Thread.sleep(2000);
		/* List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		 int countFrame=driver.findElements(By.tagName("iframe")).size();
		 for(int i=0;i<countFrame;i++)
		 {
			 while(frame.contains(driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"))))
					 {
				 driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
					 }
		 }*/
		 int m=gotoframe(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));

		 driver.switchTo().frame(m);

		 driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();


	}
	
	public static int gotoframe(WebDriver driver1,By by)

	{	

	int i;


	int a=driver1.findElements(By.tagName("iframe")).size();

	for(i=0;i<a;i++)

	{

	driver1.switchTo().frame(i);

	int b=driver1.findElements(by).size();

	if(b>0)

	{

	break;

	}
	else
	{
		System.out.println("Continue looping");
	}
	driver1.switchTo().defaultContent();
	}

driver1.switchTo().defaultContent();	

	return i;

	}
	}


