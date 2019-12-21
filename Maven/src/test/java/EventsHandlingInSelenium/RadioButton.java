package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		
		String baseUrl="http://www.echoecho.com/htmlforms10.htm";
	    WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count= driver.findElements(By.xpath("//input[@name='group1']")).size();//to get radio button counts
	//	driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();//to click at 3rd radio button by using index value
		 for(int i=0;i<count;i++)
		 {
			 String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			 if(text.equals("Cheese"))
			 {
				 {
					 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
					 
				 }
			 }
			
			 
		 }

	}

}
