package example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class demo  {
  
  public static void main(String[] args) throws InterruptedException
  {
/*	  System.setProperty("webdriver.gecko.driver", "E:\\Pragati\\Selenium\\Exe files\\geckodriver.exe");
	 
	  WebDriver driver= new FirefoxDriver();
	 /* driver.get("http://newtours.demoaut.com/");
	  verifyHomepageTitle();
	  String expedtedTitle="Welcome: Mercury Tours";
	  String ActualTitle= driver.getTitle();
	  if(expedtedTitle.equalsIgnoreCase(ActualTitle))
	  {System.out.println("PASS");}
	  else
	  {
		  System.out.println("FAIL");  
	  }*/
	/*  String alertMessage;

      driver.get("http://jsbin.com/usidix/1");
      driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
      
      alertMessage = driver.switchTo().alert().getText();
      Thread.sleep(1000);
      driver.switchTo().alert().accept();
     
      System.out.println(alertMessage);
  */ 
	  String str="madam";
	  String t = null;
	  for(int i=str.length();i>=0;i--)
	  {
		  t=t+str.charAt(i);
	  }
	  System.out.println(t);
     
  }
}
		
	
	



