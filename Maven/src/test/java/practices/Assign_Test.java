package practices;


import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import pageObjects.POM_Assign;
import resources.base;

public class Assign_Test extends base implements POM_Assign {
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initialise();
		driver.get(p.getProperty("zoopla"));
		
		
	}
	
	@Test(priority=1)
	public void tescase1() throws InterruptedException
	{
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(location)).sendKeys("London").sendKeys(Keys.ARROW_DOWN.ENTER).build().perform();
		Thread.sleep(2000);
		List<WebElement> w=driver.findElements(priceList);
		int count=w.size();
		List<String> prices=new ArrayList<>();
		
		int i,y;
		for(i=0;i<count;i++)
		{
			String s=w.get(i).getText();
			String lst="";
			//System.out.println(s);
			for(y=0;y<s.length();y++)
			{
			char c=s.charAt(y);
			if(Character.isDigit(c))
			{
				
				lst=lst+c;
			}
			else
			{
				continue;
			}
		//	System.out.println(lst);
		//	num = Integer.parseInt(lst);		
			}
			
			prices.add(lst);
			
		}
	
		Iterable<Integer> iterable = Iterables.transform(prices, 
				Integer::valueOf);
List<Integer> nlst=new ArrayList<>();
for(int t:iterable)
{
	
    nlst.add(t);	
}
System.out.println(nlst);
Collections.sort(nlst);
Collections.reverse(nlst);
for(int d=0;d<nlst.size();d++)
{System.out.println(nlst.get(d));}
System.out.println("5th property's price is:" +nlst.get(5));

		/*
		 * java.util.List<Integer> newList = prices.stream() .map(s ->
		 * Integer.parseInt(s)) .collect(Collectors.toList());
		 */
		/*
		 * System.out.println(prices); Collections.sort(newLst);
		 * Collections.reverse(newLst); System.out.println(newLst);
		 */
		for(i=0;i<w.size();i++)
		{
			if(prices.get(i).startsWith(nlst.get(5).toString()))
			{
				System.out.println(prices.get(i)+"=£"+nlst.get(5));
				w.get(i).click();
				break;
			}
			else 
			{
				System.out.println(prices.get(i)+"!=£"+nlst.get(5));
				continue;
			}
		}
		
	}
	
	@Test(priority=2)
	public void Testcase2()
	{
		WebDriverWait wt=new WebDriverWait(driver,20);
		String actual=driver.findElement(AgentName).getText();
		wt.until(ExpectedConditions.elementToBeClickable(AgentName)).click();
		//driver.findElement(AgentName).click();
		Assert.assertTrue(actual.contains(driver.findElement(sameAgent).getText()));
	}

}
