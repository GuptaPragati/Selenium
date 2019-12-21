package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAprjects

{
	

public static void main(String[] args) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver", "E:\\Pragati\\Selenium\\Exe files\\chromedriver_win32\\chromedriver.exe");


WebDriver driver = new ChromeDriver();

//I want to check if alert is present or no before accepting it. How to do it.

/*try{
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText()+" Alert is Displayed"); 
    }
    catch(NoAlertPresentException ex){
    System.out.println("Alert is NOT Displayed");
    }*/

driver.get("https://www.path2usa.com/travel-companions");

System.out.println(driver.getTitle());

driver.findElement(By.xpath("//*[@id='travel_date']")).click();

WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

	

while(!month.getText().contains("February 2019"))

{

     driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();

}

int count= driver.findElements(By.cssSelector("td[class*='day']")).size();

for(int i=0;i<count;i++)

{

     String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();

     if(text.equalsIgnoreCase("21"))

     {

   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

driver.findElements(By.xpath("//td[@class='day']")).get(i).click();

    System.out.println(text);

    break;
  
    

     }
    /* I tried go to chrome setting/advance/notification to block Facebook notification and is not working.

     each time i run the program in Chrome, the notification pop up is blank under Chrome setting as above shown


     
   //  https://stackoverflow.com/questions/38684175/how-to-click-allow-on-show-notifications-popup-using-selenium-webdriver
*/


}

}

}