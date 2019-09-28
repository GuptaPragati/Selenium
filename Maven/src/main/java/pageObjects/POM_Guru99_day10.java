package pageObjects;

import org.openqa.selenium.By;

public interface POM_Guru99_day10 {
	
	By username=By.id("username");
	By password=By.id("login");
	By login=By.xpath("//input[@title='Login']");
	By popupClose=By.xpath("//a[@title='close']");
	By sales=By.xpath("//*[@id='nav']/li[1]/a/span");
	By order=By.linkText("Orders");
	By CSV=By.xpath("//*[@id=\"sales_order_grid_export\"]");
	By export=By.xpath("//button[@title='Export']");
	
	
/*	-----TestCase1 objects----------*/
	By status=By.xpath("//select[@name='status']");
	By search=By.xpath("//button[@title='Search']");
	By checkbox=By.xpath("//input[@value='9271']");
	By action=By.xpath("//span[@class='field-row']//select");
	By submit=By.xpath("//span[@class='field-row']//button");
	By errorMess=By.xpath("//li[@class='error-msg']");
	

}
