package event.Planner;

import java.util.Scanner;

public class wedding extends event {
	
	private String Bride,Groom,Officiant,Wedding_type,DJ,Cake;
	public wedding(String name,venue venue,String date,String theme,String description,int attendee_count,String bride, String groom,String officiant,String wedding_type, String dj,String cake)
	{
		super(name,venue,date,theme,description,attendee_count);		
		Officiant = officiant;
		Wedding_type = wedding_type;
		DJ = dj;
		Bride = bride;
		Groom=groom;
		Cake = cake;
	}
	public void setBride(String n)
	{
		Bride =n;
	};
	public void setGroom(String n)
	{
		Groom =n;
	};
	public void setOfficiant(String n)
	{
		Officiant =n;
	};
	public void setWedding_type(String n)
	{
		Wedding_type =n;
	};
	public void setDJ(String n)
	{
		DJ =n;
	};
	public void setCake(String n)
	{
		Cake =n;
	};
	public String getBride()
	{
		return Bride;
	};
	public String getGroom()
	{
		return Groom;
	};
	public String getOfficiant()
	{
		return Officiant;
	};
	public String getWedding_type()
	{
		return Wedding_type;
	};
	public String getDJ()
	{
		return DJ;
	};
	public String getCake()
	{
		return Cake;
	};
	/*
	public void manageEvent()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("choose what detail you want to change:");
		System.out.println("1.name");
		System.out.println("2.date");
		System.out.println("3.theme");
		System.out.println("4.description");
		System.out.println("5.attendee count");
		System.out.println("6.Officiant");
		System.out.println("7.Cake");
		System.out.println("8.Wedding_type");
		System.out.println("9.DJ");
		System.out.println("10.Bride");
		System.out.println("11.Groom");
		int cases= scan.nextInt();
		String edit;
		final String successful = "change successful!";
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
			System.out.println(successful);
			}
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
			System.out.println("enter new Officiant:");
			Officiant =scan.next();
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
			System.out.println("enter new Wedding type:");
			Wedding_type=scan.next();
			System.out.println(successful);
			break;
		}
		case 9:
		{
			System.out.println("enter new DJ:");
			DJ=scan.next();
			System.out.println(successful);
			break;
		}
		case 10:
		{
			System.out.println("enter new Bride:");
			Bride=scan.next();
			System.out.println(successful);
			break;
		}
		case 11:
		{
			System.out.println("enter new Groom:");
			Groom=scan.next();
			System.out.println(successful);
			break;
		}
		default:
		{
			System.out.println("\nPlease try agian\n");
			manageEvent();
			break;
		}
		}
	}
	*/
	public void manageEventTest(int cases,String edit,int count)
	{
	//	Scanner scan = new Scanner (System.in);
		System.out.println("choose what detail you want to change:");
		System.out.println("1.name");
		System.out.println("2.date");
		System.out.println("3.theme");
		System.out.println("4.description");
		System.out.println("5.attendee count");
		System.out.println("6.Officiant");
		System.out.println("7.Cake");
		System.out.println("8.Wedding_type");
		System.out.println("9.DJ");
		System.out.println("10.Bride");
		System.out.println("11.Groom");
		
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
			}
			break;
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
			System.out.println("enter new Officiant:");
			Officiant =edit;
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
			System.out.println("enter new Wedding type:");
			Wedding_type=edit;
			System.out.println(successful);
			break;
		}
		case 9:
		{
			System.out.println("enter new DJ:");
			DJ=edit;
			System.out.println(successful);
			break;
		}
		case 10:
		{
			System.out.println("enter new Bride:");
			Bride=edit;
			System.out.println(successful);
			break;
		}
		case 11:
		{
			System.out.println("enter new Groom:");
			Groom=edit;
			System.out.println(successful);
			break;
		}
		default:
		{
			System.out.println("\nPlease try agian\n");
			//manageEvent();
			break;
		}
		}
	}

}
