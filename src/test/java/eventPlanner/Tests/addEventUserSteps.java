package eventPlanner.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;


import event.Planner.eventPlannerApp;
import static org.junit.Assert.*;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addEventUserSteps {
	eventPlannerApp app;
<<<<<<< HEAD
	public boolean isLoggedU;
	
=======
	Scanner scan;
	boolean unbooked;
	boolean addeventselected;
	boolean completedata;
>>>>>>> branch 'AQ_Branch' of https://github.com/Qasrawi03Ghassan/eventPlanner
	public addEventUserSteps() {
		app = eventPlannerApp.createApp();
<<<<<<< HEAD
		isLoggedU = false;
=======
		scan = new Scanner(System.in);
		
	    unbooked=true;
	    
>>>>>>> branch 'AQ_Branch' of https://github.com/Qasrawi03Ghassan/eventPlanner
	}
	@Given("User is logged in")
	public void userIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		isLoggedU = true;
		assertTrue("User is not logged in",isLoggedU);
		//throw new io.cucumber.java.PendingException();
	}
	@Given("User selected add a new event option")
	public void userSelectedAddANewEventOption() {
	    // Write code here that turns the phrase above into concrete actions
<<<<<<< HEAD
		
=======
		addeventselected=true;
		assertTrue("User selected add a new event option",addeventselected);
>>>>>>> branch 'AQ_Branch' of https://github.com/Qasrawi03Ghassan/eventPlanner
		//throw new io.cucumber.java.PendingException();
	}
	@Given("User doesnt enter a booked date")
	public void user_doesnt_enter_a_booked_date() {
	    // Write code here that turns the phrase above into concrete actions
		unbooked=true;
		assertTrue("User doesnt enter a booked date",unbooked);
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("User enters all details for the event")
	public void userEntersAllDetailsForTheEvent() {
	    // Write code here that turns the phrase above into concrete actions
		
		completedata=true;
		assertTrue("User enters all details for the event",completedata);
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Add a new event to the userEventsList")
	public void addANewEventToTheUserEventsList() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new event is added");
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Addition is successful")
	public void additionIsSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Given("user is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("User enters a booked date")
	public void user_enters_a_booked_date() {
	    // Write code here that turns the phrase above into concrete actions
		unbooked=false;
		assertFalse("User doesnt enter a booked date",unbooked);
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("add new event fails")
	public void add_new_event_fails() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("date is booked,try a new date or a different venue");
	 //   throw new io.cucumber.java.PendingException();
	}

	@Then("Addition is unsuccessful")
	public void addition_is_unsuccessful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("User doesnt enter all details for the event")
	public void user_doesnt_enter_all_details_for_the_event() {
	    // Write code here that turns the phrase above into concrete actions
		completedata=false;
		assertFalse("User enters all details for the event",completedata);
	  //  throw new io.cucumber.java.PendingException();
	}


	
	
	
}
