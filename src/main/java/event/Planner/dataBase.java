package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class dataBase {
	private Scanner scan = new Scanner(System.in);
	
	public  ArrayList<Admin> Admins = new ArrayList<Admin>();
	public  ArrayList<User> Users = new ArrayList<User>();
	public  ArrayList<Provider> Providers = new ArrayList<Provider>();
	
	public User newU = new User();
	public Admin newA = new Admin();
	public Provider newP = new Provider();
	
	//new
	public  ArrayList<event> events = new ArrayList<event>();
	public  ArrayList<venue> venues = new ArrayList<venue>();
	//new
	public static dataBase app;
	boolean done = false;
	
	public char whoLogged = '\0';
	
	public static dataBase createApp() {
		if(app == null)app = new dataBase();
		return app;
	}
		
	public void setLists() {
		if(done) {
			return;
		}
		
		done = true;
		
		for(int i=0;i<6;i++) {
			Admins.add(new Admin());
			Users.add(new User());
			Providers.add(new Provider());
			venues.add(new venue());
		}
		
		Users.get(0).setName("Ahmad");
		Users.get(1).setName("Ali");
		Users.get(2).setName("Tuqa");
		Users.get(3).setName("Khaled");
		Users.get(4).setName("Jana");
		Users.get(5).setName("Sara");
		
		Admins.get(0).setName("Yahya");
		Admins.get(1).setName("Jameel");
		Admins.get(2).setName("Tuqa");
		Admins.get(3).setName("Yasmeen");
		Admins.get(4).setName("Adel");
		Admins.get(5).setName("Nora");
		
		Providers.get(0).setName("Hamed");
		Providers.get(1).setName("Anwar");
		Providers.get(2).setName("Mohammad");
		Providers.get(3).setName("Fatemah");
		Providers.get(4).setName("Sohair");
		Providers.get(5).setName("Isa");
				  
		for (int i=0;i<6;i++)
		{
			Admins.get(i).setUsername(Integer.toString(i+1)+"A");
			Admins.get(i).setPassword("admin"+Integer.toString(i+1));
			
			Providers.get(i).setUsername(Integer.toString(i+1)+"P");
			Providers.get(i).setPassword("provider"+Integer.toString(i+1));
		
			Users.get(i).setUsername(Integer.toString(i+1)+"U");
			Users.get(i).setPassword("user"+Integer.toString(i+1));
		
			venues.get(i).setName("venue"+Integer.toString(i+1));
			venues.get(i).setProvider(Providers.get(i));
			venues.get(i).setID(Integer.toString(i+1));
			venues.get(i).setlocation("location"+Integer.toString(i+1));
		
			events.add(new event("event"+Integer.toString(i+1),venues.get(i),Integer.toString(i+1)+"/"+Integer.toString(i+1)+"/2024","00","00",100));
			
		}
	}
	
	public void userAddEvent()
	{
		int i=venues.size();
		String date;
		for(int j=i;j>0;j--)
		{
			System.out.println("j"+app.venues.get(j).getName());
		}
		event n = new event();
		
		System.out.println("enter event name:");
		n.setID(scan.next());
		
		n.failed=false;
		while(!n.failed) {
		System.out.println("\nenter event date: (example 1/1/2024)");
		date=scan.next();
		n.setDate(date);
		
		System.out.println("enter venue number:");
		n.setVenue(app.venues.get(scan.nextInt()),date);
		}
		
		
		System.out.println("enter event theme");
		n.setTheme(scan.next());

		System.out.println("enter event description");
		n.setDescription(scan.next());
		
		System.out.println("enter attendee count");
		n.setAttendee_count(scan.nextInt());
		
		events.add(n);
	}
	public boolean checkPass(String username,String pass) {
		
		for(int i=0;i<Admins.size();i++) {
			if(Admins.get(i).getUsername().equals(username) && Admins.get(i).getPass().equals(pass)) {
				Admins.get(i).setLogged(true);
				whoLogged = 'A';
				return true;
			}
		}
		
		for(int i=0;i<Users.size();i++) {
			if(Users.get(i).getUsername().equals(username) && Users.get(i).getPass().equals(pass)) {
				Users.get(i).setLogged(true);
				whoLogged = 'U';
				return true;
			}
				}
		for(int i=0;i<Providers.size();i++) {
			if(Providers.get(i).getUsername().equals(username) && Providers.get(i).getPass().equals(pass)) {
				Providers.get(i).setLogged(true);
				whoLogged = 'P';
				return true;
			}
		}
		return false;
	}
	
	public User getLoggedUser() {
		for(int i=0;i<app.Users.size();i++) {
			if(app.Users.get(i).isLogged()) {
				return app.Users.get(i);
			}
		}
			return null;
	}
	
	public Admin getLoggedAdmin() {
		for(int i=0;i<app.Admins.size();i++) {
			if(app.Admins.get(i).isLogged()) {
				return app.Admins.get(i);
			}
		}
			return null;
	}
	
	public Provider getLoggedProvider() {
		for(int i=0;i<app.Providers.size();i++) {
			if(app.Providers.get(i).isLogged()) {
				return app.Providers.get(i);
			}
		}
			return null;
	}
	
	public ArrayList<String> getLoggedDetails() {
		ArrayList <String> d = new ArrayList<String>();
		
		for(int i=0;i<app.Users.size();i++) {
			if(app.Users.get(i).isLogged()) {
				d.add(app.Users.get(i).getName());
				d.add(app.Users.get(i).getUsername());
				d.add(app.Users.get(i).getEmail());
				d.add(app.Users.get(i).getBday());
				d.add(Character.toString(app.Users.get(i).getGender()));
				d.add(app.Users.get(i).getPass());
			}
		}
		for(int i=0;i<app.Admins.size();i++) {
			if(app.Admins.get(i).isLogged()) {
				d.add(app.Admins.get(i).getName());
				d.add(app.Admins.get(i).getUsername());
				d.add(app.Admins.get(i).getEmail());
				d.add(app.Admins.get(i).getBday());
				d.add(Character.toString(app.Admins.get(i).getGender()));
				d.add(app.Admins.get(i).getPass());
			}
				}
		for(int i=0;i<app.Providers.size();i++) {
			if(app.Providers.get(i).isLogged()) {
				d.add(app.Providers.get(i).getName());
				d.add(app.Providers.get(i).getUsername());
				d.add(app.Providers.get(i).getEmail());
				d.add(app.Providers.get(i).getBday());
				d.add(Character.toString(app.Providers.get(i).getGender()));
				d.add(app.Providers.get(i).getPass());
			}	
		}		
	
		return d;
	}
	
	public String getLoggedRoleName() {
		String name = "";
		
		for(int i=0;i<app.Users.size();i++) {
			if(app.Users.get(i).isLogged()) {
				name = app.Users.get(i).getName();
			}
		}
		for(int i=0;i<app.Admins.size();i++) {
			if(app.Admins.get(i).isLogged()) {
				name = app.Admins.get(i).getName();
			}
				}
		for(int i=0;i<app.Providers.size();i++) {
			if(app.Providers.get(i).isLogged()) {
				name = app.Providers.get(i).getName();
			}	
		}			
			
		return name;
	}	
	public void deleteUserAccount(User u) 
	{
		Users.remove(u);
	}
	public void filterVenuesByPrice(int p)
	{
		for(int i=venues.size()-1;i>0;i--)
		  {
			 if(venues.get(i).getPrice()>=p)
				 venues.get(i).viewVenue();
		  }
	};
	public void filterVenuesByArea(int p)
	{
		for(int i=venues.size()-1;i>0;i--)
		  {
			 if(venues.get(i).getArea()<=p)
				 venues.get(i).viewVenue();
		  }
	};
	public void filterVenuesByCapacity(int p)
	{
		for(int i=venues.size()-1;i>0;i--)
		  {
			 if(venues.get(i).getCapacity()<=p)
				 venues.get(i).viewVenue();
		  }
	};
	public void filterVenuesByUnbookedDate(String d)
	{
		for(int i=venues.size()-1;i>0;i--)
		  {
			 if(!venues.get(i).checkIfDateIsBooked(d))
				 venues.get(i).viewVenue();
		  }
	};
}
