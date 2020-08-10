package stepDefinitions;

import java.io.IOException;


import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//import resources.DriverSetUp;

import utils.DriverFactory;

public class StepDefination extends DriverFactory{
		
	
	@Given("^user navigates to website$")
    public void user_navigates_to_website() throws InterruptedException {

		getDriver().get("https://test.marketcube.io/login");
	}

	@When("user clicks on the register here and clicks on the proceed as vendor")
	public void user_clicks_on_the_register_here_and_clicks_on_the_proceed_as_vendor() throws IOException, InterruptedException {	    		
		PageObjectRepository.gotoProceed();
		PageObjectRepository.mandatoryValidationForRegistration();
		
	}


	@Then("application displayed error messages for all fields")
	public void application_displayed_error_messages_for_all_fields() {
		String expected1=System.getProperty("expected1");
	    String actual1=PageObjectRepository.getTextOfEmailError();		
    	Assert.assertEquals(actual1,expected1);
    	String expected2=System.getProperty("expected2");
	    String actual2=PageObjectRepository.getTextOfPasswordError();		
    	Assert.assertEquals(actual2,expected2);
    	String expected3=System.getProperty("expected3");
	    String actual3=PageObjectRepository.getTextOConfirmPasswordError();		
    	Assert.assertEquals(actual3,expected3);
    	
    	
	}

	
//****************************************TestCase2*****************************************************//	
	
	@Given("^a browser navigate to the Market Cube login page$")
    public void a_browser_navigate_to_the_market_cube_login_page() throws InterruptedException {

    getDriver().get("https://test.marketcube.io/login");
	
}

    @When("^user does registration and verifies mail and then logs in to application \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_does_registration_and_verifies_mail_and_then_logs_in_to_application_something_something(String email, String pwd) throws Exception {
	
	PageObjectRepository.gotoProceed();
	PageObjectRepository.registerWithData(email, pwd);
	Thread.sleep(5000);
	driver.get("https://www.google.com/gmail/");
	PageObjectRepository.loginToGmail(email, pwd);
    Thread.sleep(3000);
    PageObjectRepository.verifymail();
    Thread.sleep(9000);
    PageObjectRepository.loginToApplication(email, pwd);
}



    @Then("application should be navigating to the home page of Market Cube")
    public void application_should_be_navigating_to_the_home_page_of_Market_Cube() {
	String expected=System.getProperty("EndValidation");
	String actual=PageObjectRepository.getTextOfHome();
	Assert.assertEquals(actual, expected);
	
}
	

}
