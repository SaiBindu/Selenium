package Login;

import static org.junit.Assert.assertEquals;

import com.cg.Credentials.Credentials;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	public Credentials cred;
	
	@Given("^User had entered all details and has credentials$")
	public void user_had_entered_all_details_and_has_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		cred=new Credentials("SaiBindu","Rish");
		
	}

	@When("^User enters valid Username and Password$")
	public void user_enters_valid_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		assertEquals(cred.getUsername(),"SaiBindu");
	}

	@Then("^welcome page is displayed$")
	public void welcome_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
	}


}
