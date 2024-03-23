package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addEventUserSteps {
	eventPlannerApp app;
	
	public addEventUserSteps() {
		app = eventPlannerApp.createApp();
	}
	
	@Given("User is logged in")
	public void userIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("User selected add a new event option")
	public void userSelectedAddANewEventOption() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		
	}
	@Given("Event details dialog is displayed")
	public void eventDetailsDialogIsDisplayed() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("User enters all details for the event")
	public void userEntersAllDetailsForTheEvent() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Add a new event to the userEventsList")
	public void addANewEventToTheUserEventsList() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Addition is successful")
	public void additionIsSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}



	
	
	
}
