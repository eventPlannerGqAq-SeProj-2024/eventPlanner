package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class manageWeddingSteps {
	dataBase app;
	int cases,count=1;
	String edit="";
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	wedding e = new wedding("event1",v1,"1/1/2024","theme1","desc1",100,"bride","groom","officiant","wedding_type","dj","cake");	
	event e2 = new event("event2",v1,"1/2/2024","theme2","desc2",100);;
	public manageWeddingSteps() {
		app = dataBase.createApp();
		
	}

	@Given("Provider chooses to change namew")
	public void ProviderChoosesToChangeNamew() {
		cases =1;		
	}
	@Given("Provider enters new name to replace old namew")
	public void ProviderEntersNewNameToReplaceOldNamew() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		edit="new data";
	}
	@Then("Provider changes name successfullyw")
	public void ProviderChangesNameSuccessfullyw() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}
	
	//Scenario 2  
	@Given("Provider chooses to change Datew")
	public void ProviderChoosesToChangeDatew() {
		cases =2;		
	}
	@Given("Provider enters new unbooked Date to replace old Datew")
	public void ProviderEntersNewUnbookedDateToReplaceOldDatew() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		edit="unbookeddate";
	}
	@Then("Provider changes Date successfullyw")
	public void ProviderChangesDateSuccessfullyw() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit,count);
	}

	//Scenario 3
		@Given("Provider enters new booked Date to replace old Datew")
		public void ProviderEntersNewDateToReplaceOldDatew() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			edit="1/2/2024";
		}
		@Then("Provider doesnt changes Datew")
		public void ProviderDoesntChangesDatew() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			e.manageEventTest(cases, edit,count);
		}
		
		//Scenario 5
		@Given("Provider chooses to change descriptionw")
		public void ProviderChoosesToChangeDescriptionw() {
			cases =4;		
		}
		@Given("Provider enters new description to replace old descriptionw")
		public void ProviderEntersNewDescriptionToReplaceOldDescriptionw() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			edit="new data";
		}
		@Then("Provider changes description successfullyw")
		public void ProviderChangesDescriptionSuccessfullyw() {
		    // Write code here that turns the phrase above into concrete actions
			//throw new io.cucumber.java.PendingException();
			e.manageEventTest(cases, edit,count);
		}
		
		//Scenario 6
				@Given("Provider chooses to change attendee countw")
				public void ProviderChoosesToChangeAttendeeCountw() {
					cases =5;		
				}
				@Given("Provider enters new attendee count to replace old attendee countw")
				public void ProviderEntersNewAttendeeCountToReplaceOldAttendeeCountw() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					count=10;
				}
				@Then("Provider changes attendee count successfullyw")
				public void ProviderChangesAttendeeCountSuccessfullyw() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					e.manageEventTest(cases, edit,count);
				}

     
				//Scenario 4
				@Given("Provider chooses to change themew")
				public void ProviderChoosesToChangeThemew() {
					cases =3;		
				}
				@Given("Provider enters new theme to replace old themew")
				public void ProviderEntersNewThemeToReplaceOldThemew() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					edit="new data";
				}
				@Then("Provider changes theme successfullyw")
				public void ProviderChangesThemeSuccessfullyw() {
				    // Write code here that turns the phrase above into concrete actions
					//throw new io.cucumber.java.PendingException();
					e.manageEventTest(cases, edit,count);
				}
	@Given("Provider chooses to change Officiant")
	public void provider_chooses_to_change_officiant() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		cases=6;
	}

	@Given("Provider enters new Officiant to replace old Officiant")
	public void provider_enters_new_officiant_to_replace_old_officiant() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new  officiant";
	}

	@Then("Provider changes Officiant successfully")
	public void provider_changes_officiant_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}

	@Given("Provider chooses to change Cake")
	public void provider_chooses_to_change_cake() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		cases=7;
	}
/*
 * "5.attendee count");
		System.out.println("6.Officiant");
		System.out.println("7.Cake");
		System.out.println("8.Wedding_type");
		System.out.println("9.DJ");
		System.out.println("10.Bride");
		System.out.println("11.Groom");
 */
	@Given("Provider enters new Cake to replace old Cake")
	public void provider_enters_new_cake_to_replace_old_cake() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new cake";
	}

	@Then("Provider changes Cake successfully")
	public void provider_changes_cake_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}

	@Given("Provider chooses to change Wedding_type")
	public void provider_chooses_to_change_wedding_type() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		cases =8;
	}

	@Given("Provider enters new Wedding_type to replace old Wedding_type")
	public void provider_enters_new_wedding_type_to_replace_old_wedding_type() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		edit ="new Wedding_type";
	}

	@Then("Provider changes Wedding_type successfully")
	public void provider_changes_wedding_type_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}

	@Given("Provider chooses to change DJ")
	public void provider_chooses_to_change_dj() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		cases =9;
	}

	@Given("Provider enters new DJ to replace old DJ")
	public void provider_enters_new_dj_to_replace_old_dj() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit ="new dj";
	}

	@Then("Provider changes DJ successfully")
	public void provider_changes_dj_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}

	@Given("Provider chooses to change Bride")
	public void provider_chooses_to_change_bride() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		cases=10;
	}

	@Given("Provider enters new Bride to replace old Bride")
	public void provider_enters_new_bride_to_replace_old_bride() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit ="new Bride";
	}

	@Then("Provider changes Bride successfully")
	public void provider_changes_bride_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}

	@Given("Provider chooses to change groom")
	public void provider_chooses_to_change_groom() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		cases=11;
	}

	@Given("Provider enters new groom to replace old groom")
	public void provider_enters_new_groom_to_replace_old_groom() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit ="new groom";
	}

	@Then("Provider changes groom successfully")
	public void provider_changes_groom_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.manageEventTest(cases, edit, count);
	}



}