package event.Planner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class event {
	
	
	private String Name,Date,Theme,Description,ID;
	private venue Venue;
	//private Provider provider;
	private int Attendee_count;
	public boolean failed=false;
	private ArrayList<String> Guestlist = new ArrayList<String>();
	public event (String name,venue venue,String date,String theme,String description,int attendee_count)//,Provider p)
	{
		if(venue.checkIfDateIsBooked(date))
		{
		 System.out.println("date is already booked, choose another date or another venue");
		}
		else
		{
			Random r1 = new Random();
			char c1 = (char)(r1.nextInt(26) + 'a');
			Random r2 = new Random();
			char c2 = (char)(r2.nextInt(26) + 'a');
			Random r3 = new Random();
			char c3 = (char)(r3.nextInt(26) + 'a');
			
		ID=Character.toString(c1)+Character.toString(c2)+Character.toString(c3);
		Name=name;
		Venue= venue;
		Date = date;
		Theme = theme;
		Description = description;
	//	provider = p;
		Attendee_count = attendee_count;
		venue.addBookedDate(date);
		}
	}
	
	
	public event ()
	{
		failed =true;
		Name="000";
		ID="000";
		Venue= null;
		Date = "1/1/2024";
		Theme = "000";
		Description = "000";
//		provider = null;
		Attendee_count = 0;
	}
//	public void setProvider(Provider n)
//	{
//		provider =n;
//	};
	public void setID(String n)
	{
		ID =n;
	};
	public void setName(String n)
	{
		Name =n;
	};
	public void setVenue(venue n,String d)
	{
		if(n.checkIfDateIsBooked(d))			
		{
			System.out.println("date is booked try again");
			failed=true;
		}
		else
		{
			Venue=n;
			failed=false;
		}
		
	};
	public void setDate(String n)
	{
		Date =n;
	};
	public void setTheme(String n)
	{
		Theme =n;
	};
	public void setDescription(String n)
	{
		Description =n;
	};
	
	public void setAttendee_count(int n)
	{
		Attendee_count =n;
	};
	
	public String getName()
	{
		return Name;
	};
	public String getID()
	{
		return ID;
	};
	public venue getVenue()
	{
		return Venue;
	};
	public String getDate()
	{
		return Date;
	};
	public String getTheme()
	{
		return Theme;
	};
	public String getDescription()
	{
		return Description;
	};
	public int getAttendee_count()
	{
		return Attendee_count;
	};
//	public Provider getProvider()
//	{
//		return provider;
//	};

	public void setGuestlist()
	{
		String Guestname;
		Scanner input = new Scanner(System.in);
		System.out.println("enter guest names:");
		for(int i=Attendee_count;i>0;i--){
			Guestname= input.nextLine();
			Guestlist.add(Guestname);
		}; 
	}
	public void viewGuestlist()
	{
		System.out.printf("{");
		for(int i=Attendee_count;i>0;i--)
		{	
			 System.out.printf("%s",Guestlist.get(i-1));
			 if(i-1==0)
		         System.out.printf("}\n");
			 else
				 System.out.printf(",");
		 }
	}
	public ArrayList<String> getGuestlist() {
		return Guestlist;
	};
	
}
