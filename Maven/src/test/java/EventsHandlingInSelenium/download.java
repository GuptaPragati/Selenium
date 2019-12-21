package example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl="http://demo.guru99.com/test/yahoo.html";
				driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By
        .id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c E:\\Pragati\\Selenium\\wget\\wget.exe -P E: --no-check-certificate " + sourceLocation;

        try {
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        System.out.println(ex.toString());
        }
	}

}
