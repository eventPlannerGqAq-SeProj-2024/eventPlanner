package eventPlanner.Tests;

import java.util.logging.*;

import event.Planner.User;
import event.Planner.dataBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class userConstSteps {
	public static dataBase app;
	Logger logger;
	
	String name;
	String username;
	String email;
	String date;
	char gender;
	String pass;
	boolean isLogged;
	
	public userConstSteps() {
		app = dataBase.createApp();
		logger = Logger.getLogger(getClass().getName());
		
		name = "";
		username = "";
		email = "";
		date = "";
		gender = '\0';
		pass = "";
		isLogged = false;
	}

	@Given("user wants to signup as customer role")
	public void userWantsToSignupAsCustomerRole() {
	    // Write code here that turns the phrase above into concrete actions
		name = "Adel";
		username = "Adel99Qadi";
		email = "AdelTest@Testmail.com";
		date = "1/2/2023";
		gender = 'M';
		pass = "Adel1234Q";
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("create new user with the other constructor")
	public void createNewUserWithTheOtherConstructor() {
	    // Write code here that turns the phrase above into concrete actions
		User test = new User(username,pass,name,email,date,gender,isLogged);//String u,String p,String n, String e, String b, char g,boolean l
		
		logger.info(test.getName());
		logger.info(test.getUsername());
		logger.info(test.getEmail());
		logger.info(test.getBday());
		logger.info(Character.toString(test.getGender()));
	    //throw new io.cucumber.java.PendingException();
	}



}
