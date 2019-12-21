package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseclick extends Thread{

	public void run() {
		/*commonforall com1=new mouseclick();
		com1.show();*/


		System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
	
		 String baseUrl = "http://www.facebook.com/";
		// String baseUrl = "http://demo.guru99.com/test/newtours/";
		  
	                driver.get(baseUrl); 
	                
		
		driver.get(baseUrl);   
		WebElement txtUsername = driver.findElement(By.id("email"));
		

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;

       /* WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
         
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
    
*/
	}
	
}

