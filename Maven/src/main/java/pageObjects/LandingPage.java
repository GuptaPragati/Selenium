package pageObjects;

import org.openqa.selenium.By;

public interface LandingPage {
	
By popup=By.xpath("//*[contains(@class,'popup-scale')]");
By dismiss=By.xpath("//button[text()='NO THANKS']");
By login=By.linkText("Login");
By email=By.id("user_email");
By pass=By.id("user_password");
By submit=By.name("commit");
}
