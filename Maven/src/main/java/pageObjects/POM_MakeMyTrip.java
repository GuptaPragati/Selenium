package pageObjects;

import org.openqa.selenium.By;

public interface POM_MakeMyTrip {
	
	By roundTrip=By.xpath("//*[contains(text(),'Round Trip')]");
	By fromCity=By.id("fromCity");
	By inputSource=By.xpath("//input[@placeholder='From']");
	By toCity=By.id("toCity");
	By desCity=By.xpath("//input[@placeholder='To']");
	By startDate=By.xpath("//div[contains(@class,'today')]//div[@class='dateInnerCell']/p");
	By endDate=By.className("dateFiled");
	By PickEndDate=By.xpath("//div[@class='dateInnerCell']/p");
	By searchButton=By.xpath("//a[contains(@class,'widgetSearchBtn')]");
	By depflight=By.xpath("//*[@id=\"ow_domrt-jrny\"]//span[contains(@class,'append_right9')]");
	By retflight=By.xpath("//*[@id=\"rt-domrt-jrny\"]//span[contains(@class,'append_right9')]");

}
