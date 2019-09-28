package guru99Site;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.POM_Guru99_day10;
import resources.base;

public class TestCase1_Test extends base implements POM_Guru99_day10 {

	public WebDriver driver;
	@BeforeTest
	public void inilialize() throws IOException  
	{
		driver=initialise();
		driver.get("http://live.guru99.com/index.php/backendlogin");
	}
	
	@Test(priority=0)
	public void login() throws InterruptedException
	{
		driver.findElement(username).sendKeys(p.getProperty("userName"));
		driver.findElement(password).sendKeys(p.getProperty("password"));
		driver.findElement(login).submit();
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(popupClose)).click();
	
	}
	
	@Test(priority=1)
	public void home() throws InterruptedException
	{
		driver.findElement(sales).click();
		driver.findElement(order).click();
		Thread.sleep(1000);
		Select s=new Select(driver.findElement(status));
		s.selectByValue("canceled");
		driver.findElement(search).click();
		driver.findElement(checkbox).click();
		Select s1=new Select(driver.findElement(action));
		s1.selectByValue("pdfinvoices_order");
		driver.findElement(submit).click();
		String message="There are no printable documents related to selected orders.";
		Assert.assertEquals(driver.findElement(errorMess).getText(), message);
	}
	}
	
