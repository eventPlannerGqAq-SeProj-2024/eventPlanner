package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchSteps {
	eventPlannerApp app;
	
	public SearchSteps() {
		app = eventPlannerApp.createApp();
		
	}

	@Given("User selected search for a hall")
	public void userSelectedSearchForAHall() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Searched hall is found")
	public void searchedHallIsFound() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Hall is displayed for the user")
	public void hallIsDisplayedForTheUser() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}



	
}
