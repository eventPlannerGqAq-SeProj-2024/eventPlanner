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
	
	public int getMaxSizeList() {
		int size = Users.size();
		if(Users.size() > Admins.size() && Users.size() > Providers.size())return Users.size();
		else if(Admins.size() > Users.size() && Admins.size() > Providers.size())return Admins.size();
		else if(Providers.size() > Users.size() && Providers.size() > Admins.size())return Providers.size();
		return size;
	}
		
	public void setLists() {
		for(int i=0;i<6;i++) {
			Admins.add(new Admin());
			Users.add(new User());
			Providers.add(new Provider());
			venues.add(new venue());
		}
		/*
		Admins.get(0).setUsername("1A");
		Admins.get(1).setUsername("2A");
		Admins.get(2).setUsername("3A");
		Admins.get(3).setUsername("user name");
		*/
		
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
		/*
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
		 //String name,venue venue,String date,String theme,String description,int attendee_count
		  
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
		
		for(int i=0;i<getMaxSizeList();i++) {
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
	
	public String getLoggedRoleName() {
		String name = "";
		for(int i=0;i<app.getMaxSizeList();i++) {
			if(app.Users.get(i).isLogged())name = app.Users.get(i).getName();
			if(app.Admins.get(i).isLogged())name = app.Admins.get(i).getName();
			if(app.Providers.get(i).isLogged())name = app.Providers.get(i).getName();
		}
		return name;
	}	
	
	public void showMainMenu() {
		
		System.out.println("==============================================================================");
		System.out.println("welcome to the event planner application");
		System.out.println("==============================================================================");
		
		System.out.println("Please choose an option (Enter the corresponding letter (capital or small)\nto excute the selected operation):\n\n[A] Login\n[B] Sign up\n[Any other character] Exit\n");
	}
	
	public static void main(String args[]) {
		app = eventPlannerApp.createApp();
		app.setLists();
		Scanner scan1 = new Scanner(System.in);
		
		String username = "";
		String pass = "";
		char choice = '\0';
		char choice1 = '\0';
		boolean noLoop = false;
		
		do {
			app.showMainMenu();
			
			choice = scan1.next().charAt(0);
			
			scan1.nextLine(); // to consume left over line
			
			System.out.println("======================================================");
			
			if(choice == 'A' || choice == 'a') {
				do {
					
					System.out.print("Please enter your username here: ");		
					username =scan1.nextLine();
					System.out.println();
					
					System.out.print("now please enter your password here: ");
					pass =scan1.nextLine();
					System.out.println();
					
					if(app.checkPass(username,pass)) {
						noLoop = true;
						System.out.println("======================================================");
						System.out.println("Welcome " + app.getLoggedRoleName() + ", nice to meet you again");
						System.out.println("======================================================");
					}
					else {
						System.out.println("Wrong username or password, would you like to try again? (enter [Y/y] for yes)");
						choice1 = scan1.next().charAt(0);
						scan1.nextLine();
						
					}
				}while(!app.checkPass(username, pass) && (choice1 =='Y' || choice1 == 'y'));
			}
			else if(choice == 'B' || choice == 'b') {
				noLoop = true;
				
				//To be implemented
				char c0 = '\0';
				char c1 = '\0';
				System.out.println("Please select your role here:\n[U] User\n[A] Admin\n[P] Provider");
						
					c0 = scan1.nextLine().charAt(0);
					
					switch(c0) {
						case 'U':
						case 'u':System.out.println("User");
							break;
							
						case 'A':
						case 'a':System.out.println("Admin");
							break;	
							
						case 'P':
						case 'p':System.out.println("Provider");
							break;
							
						default:System.out.println("None");
					}
				
			}
			else {
				System.out.println("Thanks for using our application, have a nice day!");
				System.exit(0);				
			}
		}while((choice1  != 'Y' || choice1 != 'y') && noLoop == false);
		
		
	}	
}
