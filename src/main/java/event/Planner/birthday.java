package event.Planner;

import java.util.Scanner;
import java.util.logging.*;

public class birthday extends event {
	Logger logger = Logger.getLogger(getClass().getName());
	
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
	
	//@Override
	public void manageEvent(Scanner scan)
	{
		//Scanner scan = new Scanner (System.in);
		logger.info("choose what detail you want to change:\n");
		logger.info("1.name\n");
		logger.info("2.date\n");
		logger.info("3.theme\n");
		logger.info("4.description\n");
		logger.info("5.attendee count\n");
		logger.info("6.Age\n");
		logger.info("7.Cake\n");
		logger.info("8.Celibrant name\n");
		int cases= scan.nextInt();
		final String successful = "change successful";
		String edit;
		switch(cases)
		{
		case 1:
		{
			logger.info("enter new name:\n");
			super.setName(scan.next());
			logger.info(successful + "\n");
			break;
		}
		case 2:
		{
			logger.info("enter new date:\n");
			edit=scan.next();
			if(super.getVenue().checkIfDateIsBooked(edit))
			{
				logger.info("that date is booked\n");
			}
			else {
				super.setDate(edit);
				logger.info(successful + "\n");
			}
			break;
			
		}
		case 3:
		{
			logger.info("enter new theme:\n");
			super.setTheme(scan.next());
			logger.info(successful + "\n");
			break;
		}
		case 4:
		{
			logger.info("enter new description:\n");
			super.setDescription(scan.next());
			logger.info(successful + "\n");
			break;
		}
		case 5:
		{
			logger.info("enter new attendee count:\n");
			super.setAttendee_count(scan.nextInt());
			logger.info(successful + "\n");
			break;
		}
		case 6:
		{
			logger.info("enter new age:\n");
			Age =scan.nextInt();
			logger.info(successful + "\n");
			break;
		}
		case 7:
		{
			logger.info("enter new Cake:\n");
			Cake=scan.next();
			logger.info(successful + "\n");
			break;
		}
		case 8:
		{
			logger.info("enter new Celibrant name:\n");
			Celibrant_name=scan.next();
			logger.info(successful + "\n");
			break;
		}
		default:
		{
			logger.info("\nPlease try again\n\n");
			manageEvent();
			break;
		}
		}
	}
	public void manageEventTest(int cases,String edit,int count)
	{
		logger.info("choose what detail you want to change:\n");
		logger.info("1.name\n");
		logger.info("2.date\n");
		logger.info("3.theme\n");
		logger.info("4.description\n");
		logger.info("5.attendee count\n");
		logger.info("6.Age\n");
		logger.info("7.Cake\n");
		logger.info("8.Celibrant name\n");
		
	//	String edit;
		final String successful = "change successful!";
		switch(cases)
		{
		case 1:
		{
			logger.info("enter new name:\n");
			super.setName(edit);
			logger.info(successful + "\n");
			break;
		}
		case 2:
		{
			logger.info("enter new date:\n");
			//edit=edit;
			if(super.getVenue().checkIfDateIsBooked(edit))
			{
				logger.info("that date is booked\n");
			}
			else {super.setDate(edit);
			logger.info(successful + "\n");
			}
			break;
		}
		case 3:
		{
			logger.info("enter new theme:\n");
			super.setTheme(edit);
			logger.info(successful + "\n");
			break;
		}
		case 4:
		{
			logger.info("enter new description:\n");
			super.setDescription(edit);
			logger.info(successful + "\n");
			break;
		}
		case 5:
		{
			logger.info("enter new attendee count:\n");
			super.setAttendee_count(count);
			logger.info(successful + "\n");
			break;
		}
		case 6:
		{
			logger.info("enter new age:\n");
			Age =count;
			logger.info(successful + "\n");
			break;
		}
		case 7:
		{
			logger.info("enter new Cake:\n");
			Cake=edit;
			logger.info(successful + "\n");
			break;
		}
		case 8:
		{
			logger.info("enter new Celibrant name:\n");
			Celibrant_name=edit;
			logger.info(successful + "\n");
			break;
		}
		default:
		{
			logger.info("\nPlease try again\n\n");
			manageEvent();
			break;
		}
		}
	}
}
