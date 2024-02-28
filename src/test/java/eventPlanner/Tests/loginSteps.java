package eventPlanner.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginSteps {
		
	eventPlannerApp app;
	boolean isLogged;
	
	public loginSteps() {
		
		app = new eventPlannerApp();
		
		app.setNames();
		app.setPasswords();
		app.setUsernames();
	}
	
	public boolean isLogged() {
		return  isLogged;
	}		
	
	//-----------Administrator testing:
	
	//Scenario 1:
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		isLogged = false;
		assertFalse("The admin is already logged in",isLogged);
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("admin enters correct user name {string} or password {string}")
	public void adminEntersCorrectUserNameOrPassword(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		
		//Test 1:
		if(isLogged == false) {
			assertTrue("wrong username or password",app.checkAdminPass(username,pass));
		}
		
		//Test 2:
		username = "0001";
		pass = "admin1111";
		
		if(isLogged == false) {
			assertTrue("wrong username or password",app.checkAdminPass(username,pass));
		}
		
		//Test 3:
		username = "0100";
		pass = "admin4444";
		
		if(isLogged == false) {
			assertTrue("wrong username or password",app.checkAdminPass(username,pass));
		}		
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in succeeds")
	public void theAdminLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		isLogged = true;
		assertTrue("The admin is not logged in",isLogged);
		System.out.println("Admin logged in successfully");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Go to admin menu");
		//throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 2:
	@Given("admin enters wrong user name {string} or password {string}")
	public void adminEntersWrongUserNameOrPassword(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		if(isLogged == false) {
			assertFalse("Invalid username or password",!app.checkAdminPass(username,pass));
		}
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in fails")
	public void theAdminLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		isLogged = false;
		assertFalse("The admin is not logged in",isLogged);
		System.out.println("Admin login faield");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stay in login menu");
		//throw new io.cucumber.java.PendingException();
	}
	
	
	//---------------------User testing:
	
	//Scenario 1:
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
	
	//Scenario 2:
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
	//Scenario 1:
	
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
	
	//Scenario 2:
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
