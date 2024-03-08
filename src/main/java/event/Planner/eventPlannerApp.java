package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class eventPlannerApp {
	private Scanner scan = new Scanner(System.in);
	
	public  ArrayList<Admin> Admins = new ArrayList<Admin>();
	public  ArrayList<User> Users = new ArrayList<User>();
	public  ArrayList<Provider> Providers = new ArrayList<Provider>();
	
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
		for(int i=0;i<4;i++) {
			Admins.add(new Admin());
			Users.add(new User());
			Providers.add(new Provider());
		}
		
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
		
	}
	
	public boolean checkPass(String username,String pass) {
		
		for(int i=0;i<getMaxSize();i++) {
			if(Admins.get(i).getUsername().equals(username) && Admins.get(i).getPass().equals(pass))return true;
			else if(Users.get(i).getUsername().equals(username) && Users.get(i).getPass().equals(pass))return true;
			else if(Providers.get(i).getUsername().equals(username) && Providers.get(i).getPass().equals(pass))return true;
		}
		return false;
	}
	
}
