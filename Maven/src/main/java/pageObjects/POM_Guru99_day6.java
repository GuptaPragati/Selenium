package pageObjects;

import org.openqa.selenium.By;

public interface POM_Guru99_day6 {
	public By Account=By.className("label");
	 public By MyAccount=By.linkText("My Account");
	 public By login_email=By.id("email");
	 public By login_pass=By.id("pass");
	 public By loginButton=By.id("send2");
	 public By My_wishlisht=By.linkText("MY WISHLIST");
	 public By Add_to_cart=By.xpath("//button[@title='Add to Cart']");
	 public By proceed_checkout=By.xpath("//button[@title='Proceed to Checkout']");
	 public By shipping_Address=By.xpath("//input[@title='Street Address']");
	 public By shipping_City=By.xpath("//input[@title='City']");
	 public By shipping_state=By.xpath("//select[@title='State/Province']");
	 public By shipping_zip=By.xpath("//input[@title='Zip']");
	 public By shipping_country=By.xpath("//select[@title='Country']");
	 public By shipping_continue=By.xpath("//button[@title='Continue']");
	 public By shipping_Telephone=By.xpath("//input[@title='Telephone']");

}
