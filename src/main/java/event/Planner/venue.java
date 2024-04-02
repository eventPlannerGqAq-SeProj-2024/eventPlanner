package event.Planner;
import java.util.*;

import javax.swing.JOptionPane;

public class venue {
  private String Name,location,ID;
  private Provider provider;
  private ArrayList<String> Amenities = new ArrayList<String>();
  private int Capacity =100, Price= 100,Area =1000;
  //private double Rating =0;
  private ArrayList<String> Booked = new ArrayList<String>();
  public venue(String i,String n,String l,int c,int a, int p,Provider pr)
  {
	
	  ID =i;
	  Name =n;
	  location =l;
	  Capacity =c;
	  Price =p;	
	  Area =a;
	  provider=pr;
  }
  /*public venue(String n,String l,int c,int a, int p,Provider pr)
  {
	  Name =n;
	  location =l;
	  Capacity =c;
	  Price =p;	
	  Area =a;
	  provider=pr;
  }*/
  public venue()
  {
	    ID = "000";
		Name = "000";
		location= "000";
		provider= new Provider();
	//	Area = 1000;
	//	Booked = false;
	//	Price = 100;
	//	Capacity = 100;	
  }
  public void setName(String p) 
  {
	  Name =p;
  }
  public void setProvider(Provider p) 
  {
	  provider =p;
  }
  public void setID(String p) 
  {
	  ID =p;
  }
  public void setArea(int p) 
  {
	  Area =p;
  }
  public void addBookedDate(String p) 
  {
	  Booked.add(p);
  }
  public void setlocation(String p) 
  {
	  location =p;
  }
  public void setPrice(int p) 
  {
	  Price =p;
  }
  public void setCapacity(int c)
  {
	  Capacity =c;
  }
  public void setAmenities(String provname)
  {
	    if(provname.equals(provider.getName()))
	    {
	    String Amenity;
		Scanner input = new Scanner(System.in);
		System.out.println("enter Amenity names:(type 'done' to finish)");
		while(true){
			Amenity= input.nextLine();
			if(Amenity.equals("done"))
				break;
			Amenities.add(Amenity);
		}
	    }
	    else {
	    	System.out.println("you dont have permission to edit this venue");
	    }
  }
  public void setAmenitiesTest(String provname,String[]  Amenity)
  {
	    if(provname.equals(provider.getName()))
	    {
	   // String Amenity;
		//Scanner input = new Scanner(System.in);
		System.out.println("enter Amenity names:(type 'done' to finish)");
		int i=0;
		while(true){
			//Amenity= input.nextLine();
			if(Amenity[i].equals("done"))
				break;
			Amenities.add(Amenity[i]);
			i++;
		}
	    }
	    else {
	    	System.out.println("you dont have permission to edit this venue");
	    }
  }
  public void viewAmenities()
	{
	  System.out.printf("%s","{");
		for(int i=Amenities.size();i>0;i--)
		{	
			 System.out.printf("%s",Amenities.get(i-1));
			 if(i-1==0)
		         System.out.printf("}\n");
			 else
				 System.out.printf(",");
		 }
	}
  
  public void viewcalendar()
 	{
 	  System.out.println("Booked dates:");
 		for(int i=Booked.size();i>0;i--)
 		{	
 			 System.out.println(Booked.get(i-1));
 		}
 	}
  public ArrayList<String> getAmenities() {
		return Amenities;
	};
  public String getName() 
  {
	  return Name;
  }
  public String getID() 
  {
	  return ID;
  }
  public int getArea() 
  {
	  return Area;
  }
  
  //returns true if booked and false if free
  public boolean checkIfDateIsBooked(String date)
  {
	  if(Booked.isEmpty())
	  return false;
	  
	  boolean booked=false;
	  
	  for(int i=Booked.size()-1;i>0;i--)
	  {
		  if(date.equals(Booked.get(i)))
		  booked=true;
	  }
	  return booked;
  }
  public String getlocation() 
  {
	  return location;
  }
  public int getCapacity() 
  {
	  return Capacity;
  }
  public int getPrice() 
  {
	  return Price;
  }
  public Provider getProvider() 
  {
	  return provider;
  }
  public void addEvent()//String name,String date,String theme,String description,int attendee_count)
  {
	  int attendee_count=1;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("enter event name:");
	   String name = scan.next();
	   System.out.println("enter event date:");
	   String date = scan.next();
	   System.out.println("enter event theme:");
	   String theme = scan.next();
	   System.out.println("enter event description:");
	   String description = scan.next();
	   System.out.println("enter attendee count:");
	   boolean a = true;
	
	   try {
	   attendee_count = scan.nextInt();
	   }
	   catch(InputMismatchException ex) {
		   System.out.println("please enter a number for attendee count:");
		   Scanner bb = new Scanner(System.in);
		   attendee_count = bb.nextInt();
		   
	   }
	 
	  new event(name,this,date,theme,description,attendee_count);
  	
  	}
  public void addEvent(String name,String date,String theme,String description,int attendee_count)
  {
	   new event(name,this,date,theme,description,attendee_count);
  	
  	}
  public void viewVenue()
  { 
	  System.out.printf("%n{ID: %s,",ID);
	  System.out.printf("name: %s,",Name);
	  System.out.printf("provider: %s,",provider.getName());
	  System.out.printf("capacity: %d,",Capacity);
	  System.out.printf("price: %d,",Price);
	  System.out.printf("area: %d}",Area);
		
  }
}

