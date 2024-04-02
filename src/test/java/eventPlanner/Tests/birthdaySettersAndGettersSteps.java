package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class birthdaySettersAndGettersSteps {
	
	int count=1;
	String edit="";
	venue v2;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	birthday e = new birthday();	
	public birthdaySettersAndGettersSteps() {		
	}
	@Given("Age setter is used to change Age")
	public void age_setter_is_used_to_change_age() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		e = new birthday("event1",v1,"1/1/2024","theme1","desc1",100,1,"cake","celebname");	
		count=10;
	}

	@Then("Age is changed")
	public void age_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		e.setAge(count);
	}

	@Then("Age getter shows the new Age")
	public void age_getter_shows_the_new_age() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println(e.getAge());
	}

	@Given("cake setter is used to change cake")
	public void cake_setter_is_used_to_change_cake() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new cake";
	}

	@Then("cake is changed")
	public void cake_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.setCake(edit);
	}

	@Then("cake getter shows the new cake")
	public void cake_getter_shows_the_new_cake() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println(e.getCake());
	}

	@Given("Celibrant name setter is used to change Celibrant name")
	public void celibrant_name_setter_is_used_to_change_celibrant_name() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		edit="new Celibrant";
	}

	@Then("Celibrant name is changed")
	public void celibrant_name_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		e.setCelibrant_name(edit);
	}

	@Then("Celibrant name getter shows the new Celibrant name")
	public void celibrant_name_getter_shows_the_new_celibrant_name() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println(e.getCelibrant_name());
	}
	
	
}
