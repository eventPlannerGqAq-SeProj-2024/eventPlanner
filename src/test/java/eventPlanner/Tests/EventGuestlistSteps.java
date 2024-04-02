package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EventGuestlistSteps {
	
	
	String[] guests;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1= new venue();
	event e = new event("event1",v1,"1/1/2024","theme1","desc1",100);	
	public EventGuestlistSteps() {		
	}
	@Given("user enters guest list")
	public void user_enters_guest_list() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v1=new venue("010","venue1","nablus",100,100, 100, p);
		guests=new String[] {"Ani", "Sam", "Joe"};
	}

	@Then("guestlist is set")
	public void guestlist_is_set() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.setGuestlistTest(guests);
	}

	@Then("guestlist is viewed")
	public void guestlist_is_viewed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.viewGuestlist();
	}
	
}