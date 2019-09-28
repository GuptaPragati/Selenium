package practices;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class M10 extends base{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initialise();
	driver.get("https://www.amazon.in/Samsung-Galaxy-Ocean-Blue-16GB/product-reviews/B07HGBM9WZ/ref=cm_cr_dp_d_show_all_btm?ie=UTF8&reviewerType=all_reviews");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@Test
	public void Fetch_5_Star_Rating() throws InterruptedException
	{
		driver.findElement(By.linkText("5 star")).click();
		Thread.sleep(5000);
		WebElement d=driver.findElement(By.xpath("//div[contains(@id,'cm_cr-review_list')]"));
		//List<WebElement> el=d.findElements(By.className("a-icon-alt"));
		List<WebElement> el=d.findElements(By.xpath("//*[contains(@id,'customer_review-')]/div[2]/a[1]/i/span"));
		System.out.println(el.size());
		
		  int i=0; do { String rating=el.get(i).getText(); System.out.println(rating);
		  i++;
		  
		  continue;
		  
		  // d.findElement(By.xpath("//li[contains(@class,'a-last')]")).click();
		  
		  }
		  while(i<=el.size()||d.findElement(By.xpath("//li[contains(@class,'a-last')]")
		  ).isEnabled());
		
		
	}

}
