package eventPlanner.Tests;


import java.util.ArrayList;
import java.util.Scanner;
import event.Planner.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class addVenueSteps {
	dataBase app;
	Provider p;
	public  ArrayList<venue> venues;
	venue v1;
	
	public addVenueSteps(){
		app = dataBase.createApp();
		p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true);
		venues = new ArrayList<venue>();
	}
	@Given("information is correct")
	public void InformationIsCorrect() {
	    // Write code here that turns the phrase above into concrete actions
		 v1 = new venue("010","venue1","nablus",100,100, 100, p);
		//throw new io.cucumber.java.PendingException();
	}
	@Given("information is incorrect")
	public void InformationIsIncorrect() {		
	    // Write code here that turns the phrase above into concrete actions
		/*Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();*/
		int q = 120;//Some example value
		 v1 = new venue("010","venue1","nablus",q,100, 100, p);
		//throw new io.cucumber.java.PendingException();
	}
	@Then("the new venue isnt added")
	public void TheNewVenueIsntAdded() {
	    // Write code here that turns the phrase above into concrete actions
		
		//throw new io.cucumber.java.PendingException();
	}@Then("the new venue is added")
	public void TheNewVenueIsAdded() {
	    // Write code here that turns the phrase above into concrete actions
		venues.add(v1);
		//throw new io.cucumber.java.PendingException();
	}



	
	
	
}
