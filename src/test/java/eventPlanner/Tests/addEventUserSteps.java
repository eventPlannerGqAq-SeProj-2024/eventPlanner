package eventPlanner.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;


import event.Planner.*;
import static org.junit.Assert.*;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addEventUserSteps {
	dataBase app;
	public boolean isLoggedU;
	
//	Scanner scan;
//	boolean unbooked;
//	boolean addeventselected;
//	boolean completedata;
	
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true);
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	
	public addEventUserSteps() {
		app = dataBase.createApp();
		isLoggedU = false;
		v1.addEvent("event1","1/1/2024","theme1","desc1",100);
	//    unbooked=true;
	    
	}

	
	@Given("User doesnt enter a booked date")
	public void user_doesnt_enter_a_booked_date() {
	    // Write code here that turns the phrase above into concrete actions
		v1.addEvent("event2","1/2/2024","theme2","desc2",100);
		
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("User enters all details for the event")
	public void userEntersAllDetailsForTheEvent() {
	    // Write code here that turns the phrase above into concrete actions
		v1.addEvent("event2","1/2/2024","theme2","desc2",100);//String name,String date,String theme,String description,int attendee_count
		
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Add a new event to the userEventsList")
	public void addANewEventToTheUserEventsList() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new event is added");
		//throw new io.cucumber.java.PendingException();
	}


	@Given("User enters a booked date")
	public void user_enters_a_booked_date() {
	    // Write code here that turns the phrase above into concrete actions
		v1.addEvent("event3","1/1/2024","theme2","desc2",100);
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("add new event fails")
	public void add_new_event_fails() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("date is booked,try a new date or a different venue");
	 //   throw new io.cucumber.java.PendingException();
	}


	@Given("User doesnt enter all details for the event")
	public void user_doesnt_enter_all_details_for_the_event() {
	    // Write code here that turns the phrase above into concrete actions
		
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("user tries again")
	public void user_tries_again() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		//v1.addEvent();
		v1.addEvent("event3","1/1/2024","theme2","desc2",100);
	}

	
	
	
}
