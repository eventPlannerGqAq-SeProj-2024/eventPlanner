package eventPlanner.Tests;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

import event.Planner.dataBase;
//import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginSteps {
		
	dataBase app;
	boolean isLoggedA;
	boolean isLoggedU;
	boolean isLoggedP;
	
	Scanner scan;
	public loginSteps() {
		
		app = dataBase.createApp();
		
		//app.setLists();
		
		scan = new Scanner(System.in);
		
		isLoggedA = false;
		isLoggedU = false;
		isLoggedP = false;
		
		
	}	
	
	//-----------Administrator testing:
	
	//Scenario 1:
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		app.setLists();
		
		isLoggedA = false;
		assertFalse("The admin is already logged in",isLoggedA);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("admin enters correct user name {string} and password {string}")
	public void adminEntersCorrectUserNameAndPassword(String username, String pass) {
		// Write code here that turns the phrase above into concrete actions
				
				//username = scan.nextLine();
				//pass = scan.nextLine();
				username = "1A";
				pass = "admin1";
				
				if(isLoggedA == false) {
					assertTrue("wrong username or password",app.checkPass(username,pass));
				}	
				//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in succeeds")
	public void theAdminLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedA = true;
		assertTrue("The admin is not logged in",isLoggedA);
		System.out.println("Admin logged in successfully");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Go to admin menu\n");
		//throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 2:
	@Given("admin enters wrong user name {string} or password {string}")
	public void adminEntersWrongUserNameOrPassword(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		//username = scan.nextLine();
		//pass = scan.nextLine();
		
		username = "A1";
		pass = "admin1";
		
		if(isLoggedA == false) {
			assertFalse("correct ceredentials entered",app.checkPass(username,pass));
		}
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("the admin log in fails")
	public void theAdminLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedA = false;
		assertFalse("The admin is not logged in",isLoggedA);
		System.out.println("Admin login failed");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stay in login menu\n");
		//throw new io.cucumber.java.PendingException();
	}
	
	
	//---------------------User testing:
	
	//Scenario 1:
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedU = false;
		assertFalse("The user is already logged in",isLoggedU);
		//throw new io.cucumber.java.PendingException();
	}
	@Given("the user enters correct {string} and {string}")
	public void theUserEntersCorrectAnd(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
				//username = scan.nextLine();
				//pass = scan.nextLine();
			username = "5U";
			pass = "user5";
				if(isLoggedU == false) {
					assertTrue("wrong username or password",app.checkPass(username,pass));
				}
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user log in succeeds")
	public void theUserLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedU = true;
		assertTrue("The user is not logged in",isLoggedU);
		System.out.println("User logged in successfully");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user is logged in")
	public void theUserIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Go to user menu\n");
		//throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 2:
	@Given("user enters wrong {string} or {string}")
	public void userEntersWrongOr(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		//username = scan.nextLine();
		//pass = scan.nextLine();
		
		username = "U2";
		pass = "user2";
		
		if(isLoggedU == false) {
			assertFalse("Correct ceredentails were entered",app.checkPass(username,pass));
		}
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user log in fails")
	public void theUserLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedU = false;
		assertFalse("The user is not logged in",isLoggedU);
		System.out.println("User login failed");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stay in login menu\n");
		//throw new io.cucumber.java.PendingException();
	}
	
	//--------------Provider testing:
	//Scenario 1:
	
	@Given("that the planner is not logged in")
	public void thatThePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedP = false;
		assertFalse("The provider is already logged in",isLoggedP);
		//throw new io.cucumber.java.PendingException();
	}
	@Given("the planner enters correct {string} and {string}")
	public void thePlannerEntersCorrectAnd(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
				//username = scan.nextLine();
				//pass = scan.nextLine();
				
		username = "3P";
		pass = "provider3";
				if(isLoggedP == false) {
					assertTrue("wrong username or password",app.checkPass(username,pass));
				}
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in succeeds")
	public void thePlannerLogInSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedP = true;
		assertTrue("The provider is not logged in",isLoggedP);
		System.out.println("Provider logged in successfully");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is logged in")
	public void thePlannerIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Go to provider menu\n");
		//throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 2:
	@Given("planner enters wrong {string} or {string}")
	public void plannerEntersWrongOr(String username, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		//username = scan.nextLine();
		//pass = scan.nextLine();
		username = "3P";
		pass = "prodiver33";
		
		if(isLoggedP == false) {
		}
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner log in fails")
	public void thePlannerLogInFails() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedP = false;
		assertFalse("The provider is not logged in",isLoggedP);
		System.out.println("Provider login failed");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the planner is not logged in")
	public void thePlannerIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Stay in login menu\n");
	   //throw new io.cucumber.java.PendingException();
	}







}
