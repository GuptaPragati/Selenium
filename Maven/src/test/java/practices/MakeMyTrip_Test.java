package practices;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.POM_MakeMyTrip;
import resources.base;

public class MakeMyTrip_Test extends base implements POM_MakeMyTrip {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initialise();
		driver.get(p.getProperty("makeMyTrip"));
		
		
	}
	
	@Test(priority=0,enabled=false)
	public void testcase1() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver,20);
		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(roundTrip))).click();
		driver.findElement(fromCity).click();
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(inputSource)).sendKeys("Delhi").perform();
	    Thread.sleep(2000);
		a.moveToElement(driver.findElement(inputSource)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	//	driver.findElement(toCity).click();
		a.moveToElement(driver.findElement(desCity)).sendKeys("Banglore").perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(desCity)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		WebElement web=driver.findElement(startDate);
	    web.click();
		driver.findElements(endDate).get(1).click();
		int val=Integer.parseInt(web.getText());
		int result=val+7;
		int count=driver.findElements(PickEndDate).size();
		for(int i=0;i<count;i++)
		{
			if(driver.findElements(PickEndDate).get(i).getText().contains(String.valueOf(result)))
			{
				driver.findElements(PickEndDate).get(i).click();
				break;
			}
			else
			{
				continue;
			}
		}
		
	//	driver.findElement(searchButton).click();
			
	}		
	
@Test(priority=1,dataProvider="dataProvider")
public void tesecase2(int x,int y) throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ow_domrt-jrny']/div[2]/div["+x+"]/label/div[1]/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='rt-domrt-jrny']/div[2]/div["+y+"]/label/div[1]/span[1]")).click();
	Thread.sleep(2000);
}

@DataProvider(name="dataProvider")
public Object[][] getdata()
{
	 Object[][] data=new Object[3][2];
	 
	 // 1st Set
	 data[0][0]=1;
	 data[0][1]=2;
	 
	 //2nd Set
	 data[1][0]=2;
	 data[1][1]=3;
	 
	 
	 return data;
	 
	 
}
}