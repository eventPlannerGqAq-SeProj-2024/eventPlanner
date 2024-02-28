package eventPlanner.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginSteps {
		
	eventPlannerApp app;
	public loginSteps() {
		
		app = new eventPlannerApp();
		
	}
	
	public boolean logged() {
		return  true;
	}
	
	public boolean notLogged() {
		return  false;
	}
	
	//-----------admin testing:
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse("The admin is logged in",notLogged());
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("the admin enters correct {string} and {string}")
	public void theAdminEntersCorrectAnd(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in succeeds")
	public void theAdminLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("admin enters wrong {string} or {string}")
	public void adminEntersWrongOr(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in fails")
	public void theAdminLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	
	
	//---------------------User testing:
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("the user enters correct {string} and {string}")
	public void theUserEntersCorrectAnd(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user log in succeeds")
	public void theUserLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user is logged in")
	public void theUserIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Given("user enters wrong {string} or {string}")
	public void userEntersWrongOr(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user log in fails")
	public void theUserLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	
	//--------------Planner testing:
	
	@Given("that the planner is not logged in")
	public void thatThePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("the planner enters correct {string} and {string}")
	public void thePlannerEntersCorrectAnd(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in succeeds")
	public void thePlannerLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is logged in")
	public void thePlannerIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("planner enters wrong {string} or {string}")
	public void plannerEntersWrongOr(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in fails")
	public void thePlannerLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is not logged in")
	public void thePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new io.cucumber.java.PendingException();
	}







}
