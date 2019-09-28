package guru99Site;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.POM_Guru99_day6;
import resources.base;

public class Guru99_Day6Test extends base implements POM_Guru99_day6 {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException  {
     driver=initialise();
     driver.get(p.getProperty("url"));
	}	
	
	@Test(priority=0,dataProvider="serviceProvider")
	public void purchase_product(String email,String pass)
	{

		int count=driver.findElements(Account).size();
		List<WebElement> web=driver.findElements(Account);
		for(int i=0;i<count;i++)
		{
			if(web.get(i).getText().contains("ACCOUNT"))
			{
				web.get(i).click();
				break;
			}
		}
		driver.findElement(MyAccount).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(login_email).sendKeys(email);
		driver.findElement(login_pass).sendKeys(pass);
		driver.findElement(loginButton).submit();
	}
	@Test(priority=1,dataProvider="serviceProvider")
	public void My_Wishlist(String add,String city, String country,String zip,String Tele)
	{
		driver.findElement(My_wishlisht).click();
		driver.findElement(Add_to_cart).click();
		driver.findElement(proceed_checkout).click();
		driver.findElement(shipping_Address).sendKeys(add);
		
		driver.findElement(shipping_City).sendKeys(city);
		
		Select s2=new Select(driver.findElement(shipping_country));
		s2.selectByValue(country);
		driver.findElement(shipping_zip).sendKeys(zip);
		Select s1=new Select(driver.findElement(shipping_state));
		s1.selectByVisibleText(city);
		driver.findElement(shipping_Telephone).sendKeys(Tele);
		driver.findElement(shipping_continue).click();
		
	}
	
	@DataProvider(name="serviceProvider")
	public Object[][] getdata(Method m)
	{
		if(m.getName().equalsIgnoreCase("My_Wishlist"))
		{
		return new Object[][]
				{
		{"ABC","New York","US","542896","12345678"},
		
		};
		
		}
		
		else if(m.getName().equalsIgnoreCase("purchase_product"))
		{
			return new Object[][]
					{
				{"pg1308081040@gmail.com","happy@1"}
				
				
					};
		}
		return null;
	}
	@AfterTest
	public void endLife()
	{
		driver.close();
		driver=null;//to avoid increase of heap memory hence in every test case driver is not alive when test is completed hence will not waste the heap memory
	}
	
	

}
