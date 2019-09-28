package guru99Site;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.POM_Guru99_day10;
import resources.base;

public class Guru99_Day10_Test extends base implements POM_Guru99_day10 {
	
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
	public void home()
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(sales)).click().perform();
		a.moveToElement(driver.findElement(order)).click().build().perform();
		Select s=new Select(driver.findElement(CSV));
		s.selectByVisibleText("CSV");
		driver.findElement(export).click();
	}
}
