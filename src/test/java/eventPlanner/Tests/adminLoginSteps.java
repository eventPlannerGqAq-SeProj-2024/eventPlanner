package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class adminLoginSteps {
	
	eventPlannerApp app;
	public adminLoginSteps() {
		
		app = new eventPlannerApp();
		
	}
	
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("the admin enters correct user name and password")
	public void theAdminEntersCorrectUserNameAndPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in succeeds")
	public void theAdminLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("admin enters wrong user name or password")
	public void adminEntersWrongUserNameOrPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in fails")
	public void theAdminLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
