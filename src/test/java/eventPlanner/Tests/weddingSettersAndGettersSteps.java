package eventPlanner.Tests;

import event.Planner.*;


import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class weddingSettersAndGettersSteps {
	
	int count=1;
	String edit="";
	venue v2;
	Provider p= new Provider("user","pass","prov", "email", "1/1/2000",'m',true,"type");
	venue v1 = new venue("010","venue1","nablus",100,100, 100, p);
	wedding e = new wedding("event1",v1,"1/1/2024","theme1","desc1",100,"bride","groom","officiant","wedding_type","dj","cake");	
	public weddingSettersAndGettersSteps() {		
	}
	@Given("Officiant setter is used to change Officiant")
	public void officiant_setter_is_used_to_change_officiant() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit= "new Officiant";
	}

	@Then("Officiant is changed")
	public void officiant_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.setOfficiant(edit);
	}

	@Then("Officiant getter shows the new Officiant")
	public void officiant_getter_shows_the_new_officiant() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getOfficiant());
	}

	@Given("Cake setter is used to change Cake")
	public void cake_setter_is_used_to_change_cake() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		edit="new cake";
	}

	@Then("Cake is changed")
	public void cake_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setCake(edit);
	}

	@Then("Cake getter shows the new Cake")
	public void cake_getter_shows_the_new_cake() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println(e.getCake());
	}

	@Given("Wedding_type setter is used to change Wedding_type")
	public void wedding_type_setter_is_used_to_change_wedding_type() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		edit = "new Wedding_type";
	}

	@Then("Wedding_type is changed")
	public void wedding_type_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setWedding_type(edit);
	}

	@Then("Wedding_type getter shows the new Wedding_type")
	public void wedding_type_getter_shows_the_new_wedding_type() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println(e.getWedding_type());
	}

	@Given("DJ setter is used to change DJ")
	public void dj_setter_is_used_to_change_dj() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new dj";
	}

	@Then("DJ is changed")
	public void dj_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setDJ(edit);
	}

	@Then("DJ getter shows the new DJ")
	public void dj_getter_shows_the_new_dj() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		System.out.println(e.getDJ());
	}

	@Given("Bride setter is used to change Bride")
	public void bride_setter_is_used_to_change_bride() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new DJ";
	}

	@Then("Bride is changed")
	public void bride_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		e.setBride(edit);
	}

	@Then("Bride getter shows the new Bride")
	public void bride_getter_shows_the_new_bride() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getBride());
	}

	@Given("Groom setter is used to change Groom")
	public void groom_setter_is_used_to_change_groom() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		edit="new groom";
	}

	@Then("Groom is changed")
	public void groom_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		e.setGroom(edit);
	}

	@Then("Groom getter shows the new Groom")
	public void groom_getter_shows_the_new_groom() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(e.getGroom());
	}

	
}
