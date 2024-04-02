package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class manageBirthdaySteps {
	dataBase app;
	int cases,count=1;
	String edit="";
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	birthday e = new birthday("event1",v1,"1/1/2024","theme1","desc1",100,10,"cake","celebiant");	
	event e2 = new event("event2",v1,"1/2/2024","theme2","desc2",100);;
	public manageBirthdaySteps() {
		app = dataBase.createApp();
		
	}
	@Given("Provider chooses to change age")
	public void provider_chooses_to_change_age() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		cases =6;
	}

	@Given("Provider enters new age to replace old age")
	public void provider_enters_new_age_to_replace_old_age() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		count=10;
	}

	@Then("Provider changes age successfully")
	public void provider_changes_age_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}

	@Given("Provider chooses to change cake")
	public void provider_chooses_to_change_cake() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		cases=7;
	}

	@Given("Provider enters new cake to replace old cake")
	public void provider_enters_new_cake_to_replace_old_cake() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		edit ="temp";
	}

	@Then("Provider changes cake successfully")
	public void provider_changes_cake_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}

	@Given("Provider chooses to change Celibrant name")
	public void provider_chooses_to_change_celibrant_name() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		cases  =8;
	}

	@Given("Provider enters new Celibrant name to replace old Celibrant name")
	public void provider_enters_new_celibrant_name_to_replace_old_celibrant_name() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit ="temp";	
	}

	@Then("Provider changes Celibrant name successfully")
	public void provider_changes_celibrant_name_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}

}