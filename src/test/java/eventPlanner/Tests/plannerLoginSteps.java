package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class plannerLoginSteps {
	
	eventPlannerApp app;
	public plannerLoginSteps() {
		
		app = new eventPlannerApp();
		
	}

	@Given("that the planner is not logged in")
	public void thatThePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("the planner enters correct user name and password")
	public void thePlannerEntersCorrectUserNameAndPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in succeeds")
	public void thePlannerLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is logged in")
	public void thePlannerIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("planner enters wrong user name or password")
	public void plannerEntersWrongUserNameOrPassword() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in fails")
	public void thePlannerLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is not logged in")
	public void thePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




	
}
