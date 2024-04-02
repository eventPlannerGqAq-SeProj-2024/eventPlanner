package eventPlanner.Tests;

import event.Planner.*;

import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmenitesSteps {
	dataBase app;
	String[] amenities;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1= new venue();
	
	public AmenitesSteps() {
		app = dataBase.createApp();
		
	}
	@Given("user sets amenites")
	public void user_sets_amenites() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v1=new venue("010","venue1","nablus",100,100, 100, p);
		amenities=new String[] {"am1", "am2", "am3","done"};	
		}

	@Then("amenites are set")
	public void amenites_are_set() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v1.setAmenitiesTest(p.getName(), amenities);
	}

	@Then("amenites are viewed")
	public void amenites_are_viewed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		v1.viewAmenities();
	}	
	
}
