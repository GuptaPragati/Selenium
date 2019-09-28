package guru99Site;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.POM_Guru_day1;
import resources.base;

public class Guru99_Day1Test extends base {
	
	WebDriver driver;
	POM_Guru_day1 d;
	
	@BeforeTest
	 public void setup() throws IOException {

		driver=initialise();
	driver.get(p.getProperty("url"));
	
	 }
	@Test(priority=0) 
	public void Verify_And_click_Mobile() 
	{
		d=new POM_Guru_day1(driver);
		System.out.println(d.Verify_Home_pageTitle());
		d.Home_page().click();
		try {
		Assert.assertEquals(d.Verify_Home_pageTitle(), "Mobile");}
		catch(Exception e)
		{
			System.out.println("Fail");
		}
	}
	@Test(priority=1) 
	public void Verify_And_SortByName()
	{
		d.SortBy_name().selectByVisibleText("Name");
		
	}
	
	@Test(priority=2) 
	public void VerifyPrice_Sony_Xperia()
	{
		String price=d.Sony_Xperia_price();
	    driver.findElement(d.Sony_Xperia).click();
	    String detail_price=driver.findElement(d.Sony_Xperia_DetailsPrice).getText();
	    Assert.assertEquals(price, detail_price);
	}
	
	@Test(priority=3) 
	public void AddToCart_Sony_Xperia()
	{
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int addcart_count=driver.findElements(d.AddCart).size();
		List<WebElement> AddCart=driver.findElements(d.AddCart);
		for(int i=0;i<addcart_count;i++)
		{
			if(i==2)
			{
				AddCart.get(i).click();
			}
		}
		WebElement web=driver.findElement(d.quantity);
		web.click();
		web.clear();
		web.sendKeys("1000");
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.findElement(d.update).click();
		
	}
	
	@Test(priority=4) 
	public void ErrorMessage()
	{
		String mess=driver.findElement(d.ErrorMessage).getText();
		Assert.assertTrue(mess.contains("products cannot be ordered"));
	}
	
	@Test(priority=4) 
	public void Verify_EmptyCart()
	{
		driver.findElement(d.EmptyCart).click();
		String mess=driver.findElement(d.ver_EmptyCart).getText();
		Assert.assertTrue(mess.contains("CART IS EMPTY"));
	}
	@Test (priority=5)
	public void AddToCompare() throws InterruptedException
	{
	Verify_And_click_Mobile();
		int compare_count=driver.findElements(d.AddToCompare).size();
		List<WebElement> AddCompare=driver.findElements(d.AddToCompare);
		for(int i=0;i<compare_count;i++)
		{
			if(i==0)
			{
				
				AddCompare.get(i).click();
				String s=driver.findElement(d.AddToCompare_mess).getText();
				System.out.println(s);
				break;
				
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(d.ComapreItem).click();
		String s=driver.findElement(d.AddToCompare_mess).getText();
		System.out.println(s);
		driver.findElement(d.compareButton).click();
		String MainWindowHandle=driver.getWindowHandle();
		for(String handle:driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			
		}
		driver.switchTo().window(MainWindowHandle);
		
	
	//	driver.findElement(d.clear_list).click();
		driver.manage().timeouts().implicitlyWait(6 , TimeUnit.SECONDS);
	//	driver.switchTo().alert().accept();*/
	}
	@AfterTest
	public void endLife()
	{
		driver.quit();
		driver=null;//to avoid increase of heap memory hence in every test case driver is not alive when test is completed hence will not waste the heap memory
	}
}
