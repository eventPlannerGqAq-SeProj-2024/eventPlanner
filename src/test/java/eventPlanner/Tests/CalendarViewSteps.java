package eventPlanner.Tests;

import event.Planner.*;
import event.Planner.eventPlannerApp;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalendarViewSteps {
	dataBase app;
	User u1;
	public CalendarViewSteps() {
		app = dataBase.createApp();
		
	}
	@Given("user chooses to see a calendar")
	public void user_chooses_to_see_a_calendar() {
	    // Write code here that turns the phrase above into concrete actions
	   // ]throw new io.cucumber.java.PendingException();
		app.setLists();
	}

	@Then("calendar is viewed")
	public void calendar_is_viewed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		app.venues.get(1).viewcalendar();
	}
	
	
}
