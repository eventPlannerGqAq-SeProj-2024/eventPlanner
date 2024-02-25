package eventPlanner.Tests;

import event.Planner.adminLoginApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class adminLoginSteps {
	
	adminLoginApp app;
	
	public adminLoginSteps() {
		app = new adminLoginApp();
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

	@Given("the password is not {string}")
	public void thePasswordIsNot(String string) {
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
