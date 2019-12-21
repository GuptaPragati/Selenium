package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	
			String baseUrl="http://spicejet.com/";
			  WebDriver driver= new ChromeDriver();
			 driver.get(baseUrl);
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);

	//		driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[1]/div[2]/span[3]")).click();
		//	driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[1]/div[1]")).click();
			for(int i=1;i<3;i++)
			{driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();}
			driver.findElement(By.xpath("//*[@value='Done']")).click();
			String en=driver.findElement(By.id("divpaxinfo")).getText();
		//	String em=driver.findElement(By.xpath("//*[text()='3 Adult, 2 Child']")).getText();
			//Lets validate by assertions
			
			Assert.assertEquals(en, "3 Adult, 2 Child");
			
			
			/*if(en.equals(em))
			{System.out.println(em);}
			else
			{System.out.println("Fail");}
			*/
			//dynamic dropdown example
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			//driver.findElement(By.xpath("//a[@value='BLR']")).click();

			Thread.sleep(2000);
	/*		driver.findElement(By.xpath("//a[@value='MAA']")).click();
	 
	 * this line will give error as it tries to find element from 
			dparture city dropdown which is already closed after select BLR this occur because 'MAA' present in both dropdown i.e.
			dpature city and arrival city. Hence 'MAA' will not be in visible mode in dropdown menu so will give error since selenium 
			 * always tries to find the first element. So to resolve this problem we have to define xpath for 2nd element.
*/			
			
			
		//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			//Parent-child relationship mechanism used when we do not want to use index value
			
			driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		    

            Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));	
			s.selectByValue("USD");
	}

}
