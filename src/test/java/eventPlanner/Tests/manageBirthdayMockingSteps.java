package eventPlanner.Tests;

import java.util.Scanner;

import event.Planner.Provider;
import event.Planner.birthday;
import event.Planner.dataBase;
import event.Planner.event;
import event.Planner.venue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*; 

public class manageBirthdayMockingSteps {
	public static dataBase app;
	Scanner scannermock = mock(Scanner.class);
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	birthday e = new birthday("event1",v1,"1/1/2024","theme1","desc1",100,10,"cake","celebiant");	
	event e2 = new event("event2",v1,"1/2/2024","theme2","desc2",100);;
	
	public manageBirthdayMockingSteps() {
		dataBase.createApp();
	}
	
	@Given("Provider chooses to change nameb by mocking")
	public void providerChoosesToChangeNamebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(1);		
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new name to replace old nameb by mocking")
	public void providerEntersNewNameToReplaceOldNamebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextLine()).thenReturn("").thenReturn("newName");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes name successfullyb by mocking")
	public void providerChangesNameSuccessfullybByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Provider chooses to change Dateb by mocking")
	public void providerChoosesToChangeDatebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		//when(scannermock.nextInt()).thenReturn(2);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new unbooked Date to replace old Dateb by mocking")
	public void providerEntersNewUnbookedDateToReplaceOldDatebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		//when(scannermock.nextLine()).thenReturn("").thenReturn("unbookeddate");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes Date successfullyb by mocking")
	public void providerChangesDateSuccessfullybByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		//e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new booked Date to replace old Dateb by mocking")
	public void providerEntersNewBookedDateToReplaceOldDatebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		//when(scannermock.nextLine()).thenReturn("").thenReturn("1/2/2024");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider doesnt changes Dateb by mocking")
	public void providerDoesntChangesDatebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		//e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Provider chooses to change themeb by mocking")
	public void providerChoosesToChangeThemebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(3);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new theme to replace old themeb by mocking")
	public void providerEntersNewThemeToReplaceOldThemebByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextLine()).thenReturn("").thenReturn("newTheme");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes theme successfullyb by mocking")
	public void providerChangesThemeSuccessfullybByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider chooses to change descriptionb by mocking")
	public void providerChoosesToChangeDescriptionbByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(4);		
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new description to replace old descriptionb by mocking")
	public void providerEntersNewDescriptionToReplaceOldDescriptionbByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextLine()).thenReturn("").thenReturn("newDesc");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes description successfullyb by mocking")
	public void providerChangesDescriptionSuccessfullybByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider chooses to change attendee countb by mocking")
	public void providerChoosesToChangeAttendeeCountbByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(5).thenReturn(10);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new attendee count to replace old attendee countb by mocking")
	public void providerEntersNewAttendeeCountToReplaceOldAttendeeCountbByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes attendee count successfullyb by mocking")
	public void providerChangesAttendeeCountSuccessfullybByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	   // throw new io.cucumber.java.PendingException();
	}
	@Given("Provider chooses to change age by mocking")
	public void providerChoosesToChangeAgeByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(6).thenReturn(10);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new age to replace old age by mocking")
	public void providerEntersNewAgeToReplaceOldAgeByMocking() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes age successfully by mocking")
	public void providerChangesAgeSuccessfullyByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider chooses to change cake by mocking")
	public void providerChoosesToChangeCakeByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(7);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new cake to replace old cake by mocking")
	public void providerEntersNewCakeToReplaceOldCakeByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextLine()).thenReturn("").thenReturn("newCake");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes cake successfully by mocking")
	public void providerChangesCakeSuccessfullyByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider chooses to change Celibrant name by mocking")
	public void providerChoosesToChangeCelibrantNameByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextInt()).thenReturn(8);
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Provider enters new Celibrant name to replace old Celibrant name by mocking")
	public void providerEntersNewCelibrantNameToReplaceOldCelibrantNameByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		when(scannermock.nextLine()).thenReturn("").thenReturn("temp");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Provider changes Celibrant name successfully by mocking")
	public void providerChangesCelibrantNameSuccessfullyByMocking() {
	    // Write code here that turns the phrase above into concrete actions
		e.manageEvent(scannermock);
	    //throw new io.cucumber.java.PendingException();
	}






























	
}
