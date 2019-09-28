package definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import resources.base;

public class QaclickAcademy extends base implements LandingPage{
	

    @Given("^Initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
      driver=initialise();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
      driver.findElement(email).sendKeys(username);
      driver.findElement(pass).sendKeys(password);
      driver.findElement(submit).submit();
    	
    }

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
    }


    @And("^Navigate to \"([^\"]*)\" sites$")
    public void navigate_to_something_sites(String website) throws Throwable {
    	driver.get(website);
  
    }

    @And("^Click on login link in home page to land on Secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	if(driver.findElements(popup).size()>0)
    	{
    		driver.findElement(dismiss).click();
    	}
    	
    		driver.findElement(login).click();
   
       
    }

}
