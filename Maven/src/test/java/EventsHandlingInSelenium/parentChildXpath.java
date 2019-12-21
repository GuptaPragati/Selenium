package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		//	 String baseUrl="http://www.facebook.com";
			String baseUrl="http://qaclickacademy.com/interview.php";
			  WebDriver driver= new ChromeDriver();
			 driver.get(baseUrl);
	//		 driver.findElement(By.xpath("//Body/section/div/div/div/div/ul/li[2]")).click();//Relative Xpath
		//	 driver.findElement(By.xpath("//Body/section/div/div/div/div/ul/li[3]")).click();//Reltive Xpath
			 
	//		 driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
			List<WebElement> web=driver.findElements(By.xpath("//*[@class='responsive-tabs__list__item']"));
			int count=web.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
		//		web.get(i).click();
				if(i==1)
				{
					web.get(i).click();
					break;
				}
				else {continue;}
				
			}
			 
	}

}
