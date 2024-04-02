package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EventSettersAndGettersSteps {
	
	int count=1;
	String edit="";
	venue v2;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	event e = new event("event1",v1,"1/1/2024","theme1","desc1",100);	
	public EventSettersAndGettersSteps() {		
	}
	@Given("name setter is used to change name")
	public void name_setter_is_used_to_change_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new name";
	}

	@Then("name is changed")
	public void name_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    e.setName(edit);
	}

	@Then("name getter shows the new name")
	public void name_getter_shows_the_new_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getName());
	}

	@Given("Date setter is used to change Date")
	public void date_setter_is_used_to_change_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new date";
	}

	@Then("Date is changed")
	public void date_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setDate(edit);
	}

	@Then("Date getter shows the new Date")
	public void date_getter_shows_the_new_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getDate());
	}

	@Given("Theme setter is used to change Theme")
	public void theme_setter_is_used_to_change_theme() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new theme";
	}

	@Then("Theme is changed")
	public void theme_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setTheme(edit);
	}

	@Then("Theme getter shows the new Theme")
	public void theme_getter_shows_the_new_theme() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getTheme());
	}

	@Given("Description setter is used to change Description")
	public void description_setter_is_used_to_change_description() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new Description";
	}

	@Then("Description is changed")
	public void description_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setDescription(edit);
	}

	@Then("Description getter shows the new Description")
	public void description_getter_shows_the_new_description() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getDescription());

	}

	@Given("ID setter is used to change ID")
	public void id_setter_is_used_to_change_id() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new ID";
	}

	@Then("ID is changed")
	public void id_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setID(edit);
	}

	@Then("ID getter shows the new ID")
	public void id_getter_shows_the_new_id() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getID());
	}

	@Given("Venue setter is used to change Venue")
	public void venue_setter_is_used_to_change_venue() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 v2 = new venue("011","venue1","nablus",100,100, 100, p);
	}

	@Then("Venue is changed")
	public void venue_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setVenue(v2, "unbooked date");
	}

	@Then("Venue getter shows the new Venue")
	public void venue_getter_shows_the_new_venue() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.getVenue().viewVenue();
	}

	@Given("Attendee_count setter is used to change Attendee_count")
	public void attendee_count_setter_is_used_to_change_attendee_count() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		count=10;
	}

	@Then("Attendee_count is changed")
	public void attendee_count_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.setAttendee_count(count);
	}

	@Then("Attendee_count getter shows the new Attendee_count")
	public void attendee_count_getter_shows_the_new_attendee_count() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getAttendee_count());
	}
	
	
}
