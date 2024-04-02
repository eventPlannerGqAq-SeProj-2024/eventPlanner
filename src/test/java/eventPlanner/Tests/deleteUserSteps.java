package eventPlanner.Tests;

import event.Planner.*;
//import event.Planner.eventPlannerApp;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class deleteUserSteps {
	dataBase app;
	User u1 = new User();
	public deleteUserSteps() {
		app = dataBase.createApp();
		
	}
		@Given("Admin selects a specific user")
	public void adminSelectsASpecificUser() {
	      app.setLists();
	   u1= app.Users.get(1);
	}
	@Then("Delete selected user from the system")
	public void deleteSelectedUserFromTheSystem() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		app.deleteUserAccount(u1);
	}
	@Then("Selected user deletion is successful")
	public void selectedUserDeletionIsSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("user deleted");
	}



	
	
	
}
