package eventPlanner.Tests;

import event.Planner.eventPlannerApp;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class signupSteps {
	
 eventPlannerApp app;
 public signupSteps() {
	 app = eventPlannerApp.createApp();
 }
 
 @Given("Registeration is selected")
 public void registerationIsSelected() {
     // Write code here that turns the phrase above into concrete actions
     //throw new io.cucumber.java.PendingException();
 }
 @Given("user selects admin role")
 public void userSelectsAdminRole() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 @Given("user enters personal details {string} {string} {string} {string}")
 public void userEntersPersonalDetails(String string, String string2, String string3, String string4) {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 @Given("User enteres a new username {string} and a password {string}")
 public void userEnteresANewUsernameAndAPassword(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 @Then("Add a new admin with the details and user name and password")
 public void addANewAdminWithTheDetailsAndUserNameAndPassword() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 @Then("Registeration is successfull")
 public void registerationIsSuccessfull() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }

 @Given("user selects user role")
 public void userSelectsUserRole() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 
 @Then("Add a new user with the details and user name and password")
 public void addANewUserWithTheDetailsAndUserNameAndPassword() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }

 @Given("user selects provider role")
 public void userSelectsProviderRole() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 }
 
 @Then("Add a new provider with the details and user name and password")
 public void addANewProviderWithTheDetailsAndUserNameAndPassword() {
     // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
 } 

}
