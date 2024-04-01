package eventPlanner.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;


import event.Planner.*;
import static org.junit.Assert.*;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class filterVenuesSteps {
	dataBase app;
	int price,area,capacity;
	String date;
	boolean a=false,p=false,c=false,d=false;
	public filterVenuesSteps() {
		app = dataBase.createApp();
		
	}

@Given("user enters search filter")
public void user_enters_search_filter() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	
	price =100;
	area = 100;
	capacity =100;
	date = "3/1/2024";
}

@Given("user chooses filter by price")
public void user_chooses_filter_by_price() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	app.setLists();
	p=true;
	assertTrue("user chooses filter by price",p);
}

@Then("a list of venues is printed based on price")
public void a_list_of_venues_is_printed_based_on_price() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	app.filterVenuesByPrice(price);
}

@Given("user chooses filter by unbooked date")
public void user_chooses_filter_by_unbooked_date() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	d=true;
	assertTrue("user chooses filter by unbooked date",d);
}

@Then("a list of venues is printed based on unbooked date")
public void a_list_of_venues_is_printed_based_on_unbooked_date() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	app.filterVenuesByUnbookedDate(date);
}

@Given("user chooses filter by area")
public void user_chooses_filter_by_area() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	a=true;
	assertTrue("user chooses filter by area",a);
}

@Then("a list of venues is printed based on area")
public void a_list_of_venues_is_printed_based_on_area() {
    // Write code here that turns the phrase above into concrete actions
 //   throw new io.cucumber.java.PendingException();
	app.filterVenuesByArea(area);
}

@Given("user chooses filter by capacity")
public void user_chooses_filter_by_capacity() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	c=true;
	assertTrue("user chooses filter by capacity",c);
}

@Then("a list of venues is printed based on capacity")
public void a_list_of_venues_is_printed_based_on_capacity() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	app.filterVenuesByCapacity(capacity);
}
}