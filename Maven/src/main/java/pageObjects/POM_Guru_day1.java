package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POM_Guru_day1 {
	WebDriver driver;
 By Sony_Xperia_price=By.id("product-price-1");
 public By Sony_Xperia_DetailsPrice=By.className("price");
 public By Sony_Xperia=By.partialLinkText("SONY");
 public By AddCart=By.xpath("//button[@title='Add to Cart']/span");
 public By quantity=By.xpath("//input[@title='Qty']");
 public By update=By.xpath("//button[@title='Update']");
 public By ErrorMessage=By.className("error-msg");
 public By EmptyCart=By.xpath("//button[@value='empty_cart']");
 public By ver_EmptyCart=By.className("page-title");
 public By AddToCompare=By.xpath("//a[@class='link-compare']");
 public By AddToCompare_mess=By.xpath("//*[@class='success-msg']");
 public By ComapreItem=By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a");
 public By compareButton=By.xpath("//button[@title='Compare']");
 
 //day-5....objects
 public By Account=By.className("label");
 public By MyAccount=By.linkText("My Account");
 public By CreateAcc=By.xpath("//a[@title='Create an Account']/span/span");
 public By firstName=By.id("firstname");
 public By lastName=By.id("lastname");
 public By  email=By.name("email");
 public By password=By.name("password");
 public By confirmPass=By.name("confirmation");
 public By Register=By.xpath("//button[@title='Register']");
 public By verAcc=By.xpath("//p[@class='welcome-msg']");
 public By TV=By.linkText("TV");
 public By Whishlist=By.xpath("//a[@class='link-wishlist']");
 public By login_email=By.id("email");
 public By login_pass=By.id("pass");
 public By loginButton=By.id("send2");
 public By share_Whishlist=By.xpath("//button[@title='Share Wishlist']");
 public By whislist_email=By.id("email_address");
 public By whislist_mess=By.id("message");
 public By secc_msg=By.xpath("//li[@class='success-msg']");
 
 

	public POM_Guru_day1(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public WebElement Home_page()
	{
		return 
				driver.findElement(By.xpath("//div[@id='header-nav']/nav/ol/li[1]"));			
		}

	public String Verify_Home_pageTitle()
	{
		return driver.getTitle();
	}
	
	public  Select SortBy_name()
	{//s.selectByVisibleText(Name)
		
		return new Select(driver.findElement(By.cssSelector("select[title='Sort By']")));
				
	}
	
	
	public String Sony_Xperia_price()
	{
		String price= driver.findElement(Sony_Xperia_price).getText();
		return price;
		
	}
	

}



