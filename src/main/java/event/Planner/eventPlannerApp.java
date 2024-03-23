package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class eventPlannerApp {
	private Scanner scan = new Scanner(System.in);
	
	public  ArrayList<Admin> Admins = new ArrayList<Admin>();
	public  ArrayList<User> Users = new ArrayList<User>();
	public  ArrayList<Provider> Providers = new ArrayList<Provider>();
	
	//new
	public  ArrayList<event> events = new ArrayList<event>();
	public  ArrayList<venue> venues = new ArrayList<venue>();
	//new
	public static eventPlannerApp app;
	
	public static eventPlannerApp createApp() {
		if(app == null)app = new eventPlannerApp();
		return app;
	}
	
	public int getMaxSize() {
		int size = Users.size();
		if(Users.size() > Admins.size() && Users.size() > Providers.size())return Users.size();
		else if(Admins.size() > Users.size() && Admins.size() > Providers.size())return Admins.size();
		else if(Providers.size() > Admins.size() && Providers.size() > Admins.size())return Providers.size();
		return size;
	}
	
	public void setLists() {
		for(int i=0;i<6;i++) {
			Admins.add(new Admin());
			Users.add(new User());
			Providers.add(new Provider());
			venues.add(new venue());
			events.add(new event());
		}
		/*
		Admins.get(0).setUsername("1A");
		Admins.get(1).setUsername("2A");
		Admins.get(2).setUsername("3A");
		Admins.get(3).setUsername("user name");
		
		Users.get(0).setUsername("1U");
		Users.get(1).setUsername("2U");
		Users.get(2).setUsername("3U");
		
		Providers.get(0).setUsername("1P");
		Providers.get(1).setUsername("2P");
		Providers.get(2).setUsername("3P");
		
		Admins.get(0).setPassword("admin1");
		Admins.get(1).setPassword("admin2");
		Admins.get(2).setPassword("admin3");
		Admins.get(3).setPassword("password");
		
		Users.get(0).setPassword("user1");
		Users.get(1).setPassword("user2");
		Users.get(2).setPassword("user3");
		
		Providers.get(0).setPassword("provider1");
		Providers.get(1).setPassword("provider2");
		Providers.get(2).setPassword("provider3");
		*/
		 
		  
		for (int i=0;i<6;i++)
		{
			Admins.get(i).setUsername(Integer.toString(i+1)+"A");
			Admins.get(i).setPassword("admin"+Integer.toString(i+1));
			
			Providers.get(i).setUsername(Integer.toString(i+1)+"P");
			Providers.get(i).setPassword("provider"+Integer.toString(i+1));
			
			Users.get(i).setUsername(Integer.toString(i+1)+"U");
			Users.get(i).setPassword("users"+Integer.toString(i+1));
			
			venues.get(i).setName("venue"+Integer.toString(i+1));
			venues.get(i).setID(Integer.toString(i+1));
			venues.get(i).setlocation("location"+Integer.toString(i+1));
			
			events.get(i).setID(Integer.toString(i+1));
			events.get(i).setName("event"+Integer.toString(i+1));
			events.get(i).setProvider(Providers.get(i));
			events.get(i).setVenue(venues.get(i));
			venues.get(i).setBooked(true);
		}

	}
	
	public boolean checkPass(String username,String pass) {
		
		for(int i=0;i<getMaxSize();i++) {
			if(Admins.get(i).getUsername().equals(username) && Admins.get(i).getPass().equals(pass)) {
				Admins.get(i).setLogged(true);
				return true;
			}
			else if(Users.get(i).getUsername().equals(username) && Users.get(i).getPass().equals(pass)) {
				Users.get(i).setLogged(true);
				return true;
			}
			else if(Providers.get(i).getUsername().equals(username) && Providers.get(i).getPass().equals(pass)) {
				Providers.get(i).setLogged(true);
				return true;
			}
		}
		return false;
	}
	
}
