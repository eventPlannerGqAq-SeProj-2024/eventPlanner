package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class deleteUserSteps {
	eventPlannerApp app;
	
	public deleteUserSteps() {
		app = eventPlannerApp.createApp();
	}
	
	@Given("Admin is logged in")
	public void adminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("Admin selected delete a user option")
	public void adminSelectedDeleteAUserOption() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("Users list is displayed to the admin")
	public void usersListIsDisplayedToTheAdmin() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Given("Admin selects a specific user")
	public void adminSelectsASpecificUser() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Delete selected user from the system")
	public void deleteSelectedUserFromTheSystem() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("Selected user deletion is successful")
	public void selectedUserDeletionIsSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}



	
	
	
}
