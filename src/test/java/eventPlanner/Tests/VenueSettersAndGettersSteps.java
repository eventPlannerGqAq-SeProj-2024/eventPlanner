package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VenueSettersAndGettersSteps {
	
	int count=1;
	String edit="";
	//venue v2;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	Provider p2;
	venue v = new venue();
	public VenueSettersAndGettersSteps() {		
	}
	@Given("venue name setter is used to change name")
	public void venue_name_setter_is_used_to_change_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v = new venue("010","venue1","nablus",100,100, 100, p);
		edit="new name";
	}

	@Then("venue name is changed")
	public void venue_name_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v.setName(edit);
	}

	@Then("venue name getter shows the new name")
	public void venue_name_getter_shows_the_new_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getName());
	}

	@Given("location setter is used to change location")
	public void location_setter_is_used_to_change_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new loc";
	}

	@Then("location is changed")
	public void location_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		v.setlocation(edit);
	}

	@Then("location getter shows the new location")
	public void location_getter_shows_the_new_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getlocation());
	}

	@Given("venue ID setter is used to change ID")
	public void venue_id_setter_is_used_to_change_id() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new ID";
	}

	@Then("venue ID is changed")
	public void venue_id_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v.setID(edit);
	}

	@Then("venue ID getter shows the new ID")
	public void venue_id_getter_shows_the_new_id() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println(v.getID());
	}

	@Given("provider setter is used to change provider")
	public void provider_setter_is_used_to_change_provider() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		p2=new Provider();
	}

	@Then("provider is changed")
	public void provider_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		v.setProvider(p2);
	}

	@Then("provider getter shows the new provider")
	public void provider_getter_shows_the_new_provider() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getProvider().getName());
	}

	@Given("Capacity setter is used to change Capacity")
	public void capacity_setter_is_used_to_change_capacity() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		count=10;
	}

	@Then("Capacity is changed")
	public void capacity_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v.setCapacity(count);
	}

	@Then("Capacity getter shows the new Capacity")
	public void capacity_getter_shows_the_new_capacity() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getCapacity());
	}

	@Given("Price setter is used to change Price")
	public void price_setter_is_used_to_change_price() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		count=1000;
	}

	@Then("Price is changed")
	public void price_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v.setPrice(count);
	}

	@Then("Price getter shows the new Price")
	public void price_getter_shows_the_new_price() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getPrice());
	}

	@Given("Area setter is used to change Area")
	public void area_setter_is_used_to_change_area() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		count=1000;
	}

	@Then("Area is changed")
	public void area_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		v.setArea(count);
	}

	@Then("Area getter shows the new Area")
	public void area_getter_shows_the_new_area() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(v.getArea());
	}

	
	
}
