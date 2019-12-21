package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	
		String baseUrl = "https://www.amazon.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/span[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox")))
		.click()
		.keyDown(Keys.SHIFT)
		.sendKeys("hello")
		.keyUp(Keys.SHIFT)
		.doubleClick()
		.contextClick()
		.build()
		.perform();
		

	}

}
