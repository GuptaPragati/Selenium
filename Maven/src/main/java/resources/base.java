package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base {
	public static WebDriver driver;
	public Properties p;

	public WebDriver initialise() throws IOException {
		p=new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\PC\\eclipse-workspace\\Maven\\src\\main\\java\\resources\\data.properties");
		p.load(file);
		String browserName = p.getProperty("browser");
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Pragati\\Exe files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.contains("IE")) {
//new IEDriver();	
		}
		if (browserName.contains("firefox")) {
			new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("E:\\Pragati\\Selenium\\Test cases\\screenshot\\"+result+"fail.png"));
	}
}
