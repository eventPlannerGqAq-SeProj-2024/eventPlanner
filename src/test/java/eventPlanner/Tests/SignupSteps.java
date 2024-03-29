package eventPlanner.Tests;

import event.Planner.User;
import event.Planner.eventPlannerApp;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import event.Planner.eventPlannerApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
	eventPlannerApp app;
	User user;
	boolean isValid;
	boolean confirm;
	boolean isUser;
	boolean isAdmin;
	boolean isProvider;
	Scanner scan;
	
	public SignupSteps(){
		app = eventPlannerApp.createApp();
		app.setLists();
		
		user = new User();
		isValid = false;
		confirm = false;
		isUser = false;
		isAdmin = false;
		isProvider = false;
		
		scan = new Scanner(System.in);
		
		
	}
	
	
	//User scenario:
	@Given("user enters valid  data {string} {string} {string} {string} {string} {string}")
	public void userEntersValidData(String n, String u, String e, String bd, String g, String p) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Name:");n = scan.nextLine();
		user.setName(n);
		
		System.out.print("Username:");u = scan.nextLine();
		user.setUsername(u);
		
		System.out.print("Email:");e = scan.nextLine();
		user.setEmail(e);
		
		System.out.print("Birthdate:");bd = scan.nextLine();
		user.setBday(bd);
		
		System.out.print("Gender:");g = scan.nextLine();
		user.setGender(g.charAt(0));
		
		System.out.print("Password:");p = scan.nextLine();
		user.setPassword(p);		
		
		isValid = true;
		assertTrue("The data entered are not valid",isValid);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user seleceted user role")
	public void userSelecetedUserRole() {
	    // Write code here that turns the phrase above into concrete actions
		isUser = true;
		assertTrue("User didnt select user role",isUser);
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("user confirms addition")
	public void userConfirmsAddition() {
	    // Write code here that turns the phrase above into concrete actions
		confirm = true;
		assertTrue("User didnt confirm yet",confirm);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("check if email and date are valid {string} {string}")
	public void checkIfEmailAndDateAreValid(String e, String d) {
	    // Write code here that turns the phrase above into concrete actions
		e = user.getEmail();
		d = user.getBday();
		
		assertTrue("Entered email is not valid",user.isValidEmail(e));
		assertTrue("Entered date is not valid",user.isValidDate(d));
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("Add a new user")
	public void addANewUser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Before: ");
		for(int i=0;i<app.Users.size();i++) {
			System.out.println(app.Users.get(i).getName());
		}
		
		app.Users.add(user);
		
		System.out.println("After: ");
		for(int i=0;i<app.Users.size();i++) {
			System.out.println(app.Users.get(i).getName());
		}
	    //throw new io.cucumber.java.PendingException();
	}


	@Given("user enters wrong format for the date or email values {string} {string} {string} {string} {string} {string}")
	public void userEntersWrongFormatForTheDateOrEmailValues(String n, String u, String e, String b, String g, String p) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("user seleceted role type")
	public void userSelecetedRoleType() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Show a try again dialog")
	public void showATryAgainDialog() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	//Administrator role:
	@Given("user seleceted admin role")
	public void userSelecetedAdminRole() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Add a new admin")
	public void addANewAdmin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	//Provider role:
	@Given("user seleceted provider role")
	public void userSelecetedProviderRole() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Add a new provider")
	public void addANewProvider() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}













	
	
}
