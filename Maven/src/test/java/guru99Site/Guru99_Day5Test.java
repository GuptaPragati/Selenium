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

public class Guru99_Day5Test extends base {
	WebDriver driver;
	POM_Guru_day1 d;
	
	@BeforeTest
	 public void setup() throws IOException {
	
driver=initialise();
d=new POM_Guru_day1(driver);
driver.get(p.getProperty("url"));

}
	@Test(priority=0)
	public void create_account()
	{
		
		int count=driver.findElements(d.Account).size();
		List<WebElement> web=driver.findElements(d.Account);
		for(int i=0;i<count;i++)
		{
			if(web.get(i).getText().contains("ACCOUNT"))
			{
				web.get(i).click();
				break;
			}
		}
		driver.findElement(d.MyAccount).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(d.CreateAcc).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(d.firstName).sendKeys("happy");
		driver.findElement(d.lastName).sendKeys("gupta");
		driver.findElement(d.email).sendKeys("pg1308081040@gmail.com");
		driver.findElement(d.password).sendKeys("happy@1");
		driver.findElement(d.confirmPass).sendKeys("happy@1");
		driver.findElement(d.Register).submit();
	//	Assert.assertEquals(driver.findElement(d.verAcc).getText(),driver.findElement(d.verAcc).getText().contains("happy gupta"));;
		
	}
	@Test(priority=1)
	public void whishlist()
	{
		driver.findElement(d.TV).click();
		driver.findElement(d.Whishlist).click();
		driver.findElement(d.login_email).sendKeys("pg1308081040@gmail.com");
		driver.findElement(d.login_pass).sendKeys("happy@1");
		driver.findElement(d.loginButton).submit();
		driver.findElement(d.share_Whishlist).click();
		driver.findElement(d.whislist_email).sendKeys("protechneo@gmail.com");
		driver.findElement(d.whislist_mess).sendKeys("Hi!  please check the product that i send");
		driver.findElement(d.share_Whishlist).click();
		String mess=driver.findElement(d.secc_msg).getText();
		Assert.assertTrue(mess.contains("Wishlist has been shared"));
	}
	@AfterTest
	public void endLife()
	{
		driver.close();
		driver=null;//to avoid increase of heap memory hence in every test case driver is not alive when test is completed hence will not waste the heap memory
	}
}
