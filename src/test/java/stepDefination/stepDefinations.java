package stepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object_repository.Amazon_Home_Page;
import object_repository.login_page;
import sachinTest.Base;

public class stepDefinations extends Base {

	 
		// TODO Auto-generated method stub
		
		@Given("^Initialize brower$")
		public void initialize_brower() throws Throwable {
		    
			driver=initialize();
		   
		}

		@Given("^Navigate to \"([^\"]*)\" Site$")
		public void navigate_to_Site(String arg1) throws Throwable {
		    driver.get(arg1);
		    driver.manage().window().maximize();
		}

		@Given("^Click on login link$")
		public void click_on_login_link() throws Throwable {
		  
			
	    	 
	    	 Actions a= new Actions(driver);
	    	 Amazon_Home_Page AHP = new Amazon_Home_Page(driver);
	    	 a.moveToElement(AHP.click_login());
	    	 a.moveToElement(AHP.sign_in()).click().build().perform();
		}

		@When("^When user enters (.+) and (.+) and click login$")
		public void when_user_enters_and_and_click_login(String arg1, String arg2) throws Throwable {
		    
			login_page lp= new login_page(driver);
	    	 
	    	 lp.usr_name().sendKeys(arg1);
	    	 
	    	 lp.click_continue().click();
	    	 Thread.sleep(1000);
	    	 lp.passwd().sendKeys(arg2);
	    	 
	    	 lp.click_signin().click();
	    	 
		}

		@Then("^Verify login is success$")
		public void verify_login_is_success() throws Throwable {
		 
			Amazon_Home_Page AHP1 = new Amazon_Home_Page(driver);
			assertTrue(AHP1.verify_order().isDisplayed());
		}

	

}
