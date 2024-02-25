package eventPlanner.Tests;

import event.Planner.adminLoginMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;



public class adminLoginSteps {

	
	adminLoginMain app;
	public adminLoginSteps() {
		app = new adminLoginMain();
		
		
	}
	
	
	
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("the password is {string}")
	public void thePasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("admin enter Y")
	public void adminEnterY() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("admin is logged in")
	public void adminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	
	
}
