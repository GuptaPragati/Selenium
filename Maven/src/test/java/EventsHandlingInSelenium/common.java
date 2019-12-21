package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface commonforall {


	default void show() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();}
	
}

public class common implements commonforall
{
	
	
}
	