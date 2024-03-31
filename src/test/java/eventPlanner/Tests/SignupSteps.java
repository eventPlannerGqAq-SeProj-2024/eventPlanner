package eventPlanner.Tests;

import event.Planner.Admin;
import event.Planner.Provider;
import event.Planner.User;
import event.Planner.eventPlannerApp;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import event.Planner.eventPlannerApp;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
	eventPlannerApp app;
	
	User user;
	Admin admin;
	Provider provider;
		
	boolean isValid;
	boolean confirm;
	
	
	boolean isUser;
	boolean isAdmin;
	boolean isProvider;
	
	boolean roleSelected;
	Scanner scan;
	
	public SignupSteps(){
		app = eventPlannerApp.createApp();
		//app.setLists();
		
		user = new User();
		admin = new Admin();
		provider = new Provider();
		
		isValid = false;
		confirm = false;
		isUser = false;
		isAdmin = false;
		isProvider = false;
		roleSelected = false;
		
		scan = new Scanner(System.in);
		
		
	}	
	
	//User scenario:
	@Given("user enters valid  data as user {string} {string} {string} {string} {string} {string}")
	public void userEntersValidDataAsUser(String n, String u, String e, String bd, String g, String p) {
	    // Write code here that turns the phrase above into concrete actions
		app.setLists();
		
		n = "Ahmad";
		u = "Ahm@d33";
		e = "ahmad@gmail.com";
		bd = "01/02/2000";
		g = "M";
		p = "1234A";
		
		//System.out.print("Name: ");//n = scan.nextLine();
		user.setName(n);
		
		//System.out.print("Username: ");//u = scan.nextLine();
		user.setUsername(u);
		
		//System.out.print("Email: ");//e = scan.nextLine();
		user.setEmail(e);
		
		//System.out.print("Birthdate: ");//bd = scan.nextLine();
		user.setBday(bd);
		
		//System.out.print("Gender: ");//g = scan.nextLine();
		user.setGender(g.charAt(0));
		
		//System.out.print("Password: ");//p = scan.nextLine();
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
		System.out.println();
		System.out.println("Users Before: ");
		for(int i=0;i<app.Users.size();i++) {
			System.out.println(app.Users.get(i).getName());
		}
		System.out.println();

		
		app.Users.add(user);
		
		System.out.println("Users After: ");
		for(int i=0;i<app.Users.size();i++) {
			System.out.println(app.Users.get(i).getName());
		}
		System.out.println();
	    //throw new io.cucumber.java.PendingException();
	}
	
	//Administrator role:
	@Given("user enters valid  data as admin {string} {string} {string} {string} {string} {string}")
	public void userEntersValidDataAsAdmin(String n, String u, String e, String bd, String g, String p) {
	    // Write code here that turns the phrase above into concrete actions
		n = "Amani";
		u = "Am@ni11";
		e = "amani@gmail.com";
		bd = "01/02/1998";
		g = "F";
		p = "0000A";
		
		//System.out.print("Name: ");//n = scan.nextLine();
		admin.setName(n);
		
		//System.out.print("Username: ");//u = scan.nextLine();
		admin.setUsername(u);
		
		//System.out.print("Email: ");//e = scan.nextLine();
		admin.setEmail(e);
		
		//System.out.print("Birthdate: ");//bd = scan.nextLine();
		admin.setBday(bd);
		
		//System.out.print("Gender: ");//g = scan.nextLine();
		admin.setGender(g.charAt(0));
		
		//System.out.print("Password: ");//p = scan.nextLine();
		admin.setPassword(p);		
		
		isValid = true;
		assertTrue("The data entered are not valid",isValid);
	    //throw new io.cucumber.java.PendingException();
	}



		@Given("user seleceted admin role")
		public void userSelecetedAdminRole() {
		    // Write code here that turns the phrase above into concrete actions
			isAdmin = true;
			assertTrue("The user didnt select admin role",isAdmin);
		    //throw new io.cucumber.java.PendingException();
		}
		@Then("Add a new admin")
		public void addANewAdmin() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println();
			System.out.println("Admins Before: ");
			for(int i=0;i<app.Admins.size();i++) {
				System.out.println(app.Admins.get(i).getName());
			}
			System.out.println();

			
			app.Admins.add(admin);
			
			
			System.out.println("Admins After: ");
			for(int i=0;i<app.Admins.size();i++) {
				System.out.println(app.Admins.get(i).getName());
			}
			System.out.println();
		    //throw new io.cucumber.java.PendingException();
		}

		//Provider role:
		@Given("user enters valid  data as provider {string} {string} {string} {string} {string} {string}")
		public void userEntersValidDataAsProvider(String n, String u, String e, String bd, String g, String p) {
		    // Write code here that turns the phrase above into concrete actions
			n = "Ali";
			u = "Ali03";
			e = "Ali@gmail.com";
			bd = "11/11/1999";
			g = "M";
			p = "AAAA";
			
			//System.out.print("Name: ");n = scan.nextLine();
			provider.setName(n);
			
			//System.out.print("Username: ");//u = scan.nextLine();
			provider.setUsername(u);
			
			//System.out.print("Email: ");//e = scan.nextLine();
			provider.setEmail(e);
			
			//System.out.print("Birthdate: ");//bd = scan.nextLine();
			provider.setBday(bd);
			
			//System.out.print("Gender: ");//g = scan.nextLine();
			provider.setGender(g.charAt(0));
			
			//System.out.print("Password: ");//p = scan.nextLine();
			provider.setPassword(p);		
			
			isValid = true;
			assertTrue("The data entered are not valid",isValid);
		    //throw new io.cucumber.java.PendingException();
		}



		@Given("user seleceted provider role")
		public void userSelecetedProviderRole() {
		    // Write code here that turns the phrase above into concrete actions
			isProvider = true;
			assertTrue("The user didnt select providor role",isProvider);
		    //throw new io.cucumber.java.PendingException();
		}
		@Then("Add a new provider")
		public void addANewProvider() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println();
			System.out.println("Providers Before: ");
			for(int i=0;i<app.Providers.size();i++) {
				System.out.println(app.Providers.get(i).getName());
			}
			System.out.println();

			
			app.Providers.add(provider);
			
			System.out.println("Providers After: ");
			for(int i=0;i<app.Providers.size();i++) {
				System.out.println(app.Providers.get(i).getName());
			}
			System.out.println();
		    //throw new io.cucumber.java.PendingException();
		}
	
	@Given("user enters wrong format for the date or email values {string} {string}")
	public void userEntersWrongFormatForTheDateOrEmailValues(String e, String bd) {
	    // Write code here that turns the phrase above into concrete actions
		
		//System.out.println("Email: ");e = scan.nextLine();
		//System.out.println("Birthday: ");bd = scan.nextLine();
		e = "test0";
		bd = "01/23A";
		
		assertFalse("Email is valid",user.isValidEmail(e));
		assertFalse("Birthday date is valid",user.isValidDate(bd));
	    //throw new io.cucumber.java.PendingException();
	}



	@Given("user seleceted role type")
	public void userSelecetedRoleType() {
	    // Write code here that turns the phrase above into concrete actions
		roleSelected = true;
		assertTrue("User didnt select a rule yet",roleSelected);
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Show a try again dialog {string} {string}")
	public void showATryAgainDialog(String e, String bd) {
	    // Write code here that turns the phrase above into concrete actions
		/*do {
			System.out.println("Please try again here:\n-Email: ");
			e = scan.nextLine();
			System.out.println();
			
			}while(!user.isValidEmail(e));
		
		do {
			System.out.println("Please try again here:");
			System.out.println("-Birthdate: ");
			bd = scan.nextLine();
			}while(!user.isValidDate(bd));*/
		
		e = "test0";
		bd = "01/23A";
		if(!(user.isValidDate(bd) && user.isValidEmail(e)))System.out.println("Try again");
		
		
		
			assertFalse("Valid email",user.isValidEmail(e));
			assertFalse("Valid date",user.isValidDate(bd));
	    //throw new io.cucumber.java.PendingException();
	}



		
	
}
