package pageObjects;

import org.openqa.selenium.By;

public interface POM_Assign {
By location=By.xpath("//input[contains(@id,'location')]");
By priceList=By.xpath("//a[contains(@class,'listing-results-price text-price')]");
By AgentName=By.xpath("//*[contains(@class,'agent__name')]");
By sameAgent=By.xpath("//*[contains(@class,'bottom-half')]//b");
}
