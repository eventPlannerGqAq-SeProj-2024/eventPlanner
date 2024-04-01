package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class manageEventSteps {
	dataBase app;
	int cases,count=1;
	String edit="";
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	event e = new event("event1",v1,"1/1/2024","theme1","desc1",100);	
	event e2 = new event("event2",v1,"1/2/2024","theme2","desc2",100);;
	public manageEventSteps() {
		app = dataBase.createApp();
		
	}

	//Scenario 1
	@Given("Provider chooses to change name")
	public void ProviderChoosesToChangeName() {
		cases =1;		
	}
	@Given("Provider enters new name to replace old name")
	public void ProviderEntersNewNameToReplaceOldName() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		edit="new data";
	}
	@Then("Provider changes name successfully")
	public void ProviderChangesNameSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}
	
	//Scenario 2  
	@Given("Provider chooses to change Date")
	public void ProviderChoosesToChangeDate() {
		cases =2;		
	}
	@Given("Provider enters new unbooked Date to replace old Date")
	public void ProviderEntersNewUnbookedDateToReplaceOldDate() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		edit="unbookeddate";
	}
	@Then("Provider changes Date successfully")
	public void ProviderChangesDateSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}

	//Scenario 3
		@Given("Provider enters new booked Date to replace old Date")
		public void ProviderEntersNewDateToReplaceOldDate() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			edit="1/2/2024";
		}
		@Then("Provider doesnt changes Date")
		public void ProviderDoesntChangesDate() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			e.manageEventTest(cases, edit,count);
		}
		
		//Scenario 5
		@Given("Provider chooses to change description")
		public void ProviderChoosesToChangeDescription() {
			cases =4;		
		}
		@Given("Provider enters new description to replace old description")
		public void ProviderEntersNewDescriptionToReplaceOldDescription() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			edit="new data";
		}
		@Then("Provider changes description successfully")
		public void ProviderChangesDescriptionSuccessfully() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			e.manageEventTest(cases, edit,count);
		}
		
		//Scenario 6
				@Given("Provider chooses to change attendee count")
				public void ProviderChoosesToChangeAttendeeCount() {
					cases =3;		
				}
				@Given("Provider enters new attendee count to replace old attendee count")
				public void ProviderEntersNewAttendeeCountToReplaceOldAttendeeCount() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					count=10;
				}
				@Then("Provider changes attendee count successfully")
				public void ProviderChangesAttendeeCountSuccessfully() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					e.manageEventTest(cases, edit,count);
				}

     
				//Scenario 4
				@Given("Provider chooses to change theme")
				public void ProviderChoosesToChangeTheme() {
					cases =3;		
				}
				@Given("Provider enters new theme to replace old theme")
				public void ProviderEntersNewThemeToReplaceOldTheme() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					edit="new data";
				}
				@Then("Provider changes theme successfully")
				public void ProviderChangesThemeSuccessfully() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					e.manageEventTest(cases, edit,count);
				}
	
	
}
