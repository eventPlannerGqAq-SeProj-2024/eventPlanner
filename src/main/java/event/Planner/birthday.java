package event.Planner;

import java.util.Scanner;

public class birthday extends event {
	
	private int Age;
	private String Cake,Celibrant_name;
	public birthday(String name,venue venue,String date,String theme,String description,int attendee_count,int age,	String celibrant_name,String cake)
	{
		
		super(name,venue,date,theme,description,attendee_count);	
		Age=age;
	    Cake= cake;
	    Celibrant_name = celibrant_name;
	}
	public birthday()
	{
		super();
		Age=10;
		Cake="temp";
		Celibrant_name="temp";
	}
	
	public void setAge(int n)
	{
		Age=n;
	}
	
	public void setCelibrant_name(String n)
	{
		Celibrant_name=n;
	}
	
	public String getCake()
	{
		return Cake;
	}
	
	public int getAge()
	{
		return Age;
	}
	
	public String getCelibrant_name()
	{
		return Celibrant_name;
	}
	
	public void setCake(String n)
	{
		Cake=n;
	}
	
	
	public void manageEvent()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("choose what detail you want to change:");
		System.out.println("1.name");
		System.out.println("2.date");
		System.out.println("3.theme");
		System.out.println("4.description");
		System.out.println("5.attendee count");
		System.out.println("6.Age");
		System.out.println("7.Cake");
		System.out.println("8.Celibrant name");
		int cases= scan.nextInt();
		final String successful = "change successful";
		String edit;
		switch(cases)
		{
		case 1:
		{
			System.out.println("enter new name:");
			super.setName(scan.next());
			System.out.println(successful);
			break;
		}
		case 2:
		{
			System.out.println("enter new date:");
			edit=scan.next();
			if(super.getVenue().checkIfDateIsBooked(edit))
			{
				System.out.println("that date is booked");
			}
			else {super.setDate(edit);
			}
			System.out.println(successful);
			break;
		}
		case 3:
		{
			System.out.println("enter new theme:");
			super.setTheme(scan.next());
			System.out.println(successful);
			break;
		}
		case 4:
		{
			System.out.println("enter new description:");
			super.setDescription(scan.next());
			System.out.println(successful);
			break;
		}
		case 5:
		{
			System.out.println("enter new attendee count:");
			super.setAttendee_count(scan.nextInt());
			System.out.println(successful);
			break;
		}
		case 6:
		{
			System.out.println("enter new age:");
			Age =scan.nextInt();
			System.out.println(successful);
			break;
		}
		case 7:
		{
			System.out.println("enter new Cake:");
			Cake=scan.next();
			System.out.println(successful);
			break;
		}
		case 8:
		{
			System.out.println("enter new Celibrant name:");
			Celibrant_name=scan.next();
			System.out.println(successful);
			break;
		}
		default:
		{
			System.out.println("\nPlease try again\n");
			manageEvent();
			break;
		}
		}
	}
	public void manageEventTest(int cases,String edit,int count)
	{
	//	Scanner scan = new Scanner (System.in);
		System.out.println("choose what detail you want to change:");
		System.out.println("1.name");
		System.out.println("2.date");
		System.out.println("3.theme");
		System.out.println("4.description");
		System.out.println("5.attendee count");
		System.out.println("6.Age");
		System.out.println("7.Cake");
		System.out.println("8.Celibrant name");
		
	//	String edit;
		final String successful = "change successful!";
		switch(cases)
		{
		case 1:
		{
			System.out.println("enter new name:");
			super.setName(edit);
			System.out.println(successful);
			break;
		}
		case 2:
		{
			System.out.println("enter new date:");
			//edit=edit;
			if(super.getVenue().checkIfDateIsBooked(edit))
			{
				System.out.println("that date is booked");
			}
			else {super.setDate(edit);
			System.out.println(successful);
			break;
			}
		}
		case 3:
		{
			System.out.println("enter new theme:");
			super.setTheme(edit);
			System.out.println(successful);
			break;
		}
		case 4:
		{
			System.out.println("enter new description:");
			super.setDescription(edit);
			System.out.println(successful);
			break;
		}
		case 5:
		{
			System.out.println("enter new attendee count:");
			super.setAttendee_count(count);
			System.out.println(successful);
			break;
		}
		case 6:
		{
			System.out.println("enter new age:");
			Age =count;
			System.out.println(successful);
			break;
		}
		case 7:
		{
			System.out.println("enter new Cake:");
			Cake=edit;
			System.out.println(successful);
			break;
		}
		case 8:
		{
			System.out.println("enter new Celibrant name:");
			Celibrant_name=edit;
			System.out.println(successful);
			break;
		}
		default:
		{
			System.out.println("\nPlease try again\n");
			manageEvent();
			break;
		}
		}
	}
}
