package eventPlanner.Tests;

import event.Planner.dataBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class getLoggedDetailsSteps {
	public static dataBase app;
	
	public getLoggedDetailsSteps() {
		app = dataBase.createApp();
	}

	@Given("user wants to get his detials")
	public void userWantsToGetHisDetials() {
	    // Write code here that turns the phrase above into concrete actions
		app.setLists();
		app.Users.get(0).setLogged(true);
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("admin wants to get his detials")
	public void adminWantsToGetHisDetials() {
	    // Write code here that turns the phrase above into concrete actions
		app.Users.get(0).setLogged(false);
		app.setLists();
		app.Admins.get(3).setLogged(true);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("provider wants to get his detials")
	public void providerWantsToGetHisDetials() {
	    // Write code here that turns the phrase above into concrete actions
		app.Admins.get(3).setLogged(false);
		app.setLists();
		app.Providers.get(5).setLogged(true);
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("user or amin or provider gets details")
	public void userOrAminOrProviderGetsDetails() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(app.getLoggedDetails());
	    //throw new io.cucumber.java.PendingException();
	}




}
