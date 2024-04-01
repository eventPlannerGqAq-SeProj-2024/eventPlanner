package eventPlanner.Tests;

import event.Planner.dataBase;
import event.Planner.eventPlannerApp;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class manageEventSteps {
	dataBase app;
	
	public manageEventSteps() {
		app = dataBase.createApp();
	}

	@Given("Provider is logged in")
	public void providerIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider selects an event")
	public void providerSelectsAnEvent() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("Provider selects to manage the event")
	public void providerSelectsToManageTheEvent() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Provider can change event details")
	public void providerCanChangeEventDetails() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Changes are saved for the specific event")
	public void changesAreSavedForTheSpecificEvent() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}



	
	
	
}
