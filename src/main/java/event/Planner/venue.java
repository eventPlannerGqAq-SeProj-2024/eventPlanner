package event.Planner;
import java.util.*;

import javax.swing.JOptionPane;

public class venue {
  private String Name,location,ID;
  private Provider provider;
  private ArrayList<String> Amenities = new ArrayList<String>();
  private int Capacity =100, Price= 100,Area =1000;
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
  public venue(String n,String l,int c,int a, int p,Provider pr)
  {
	  Name =n;
	  location =l;
	  Capacity =c;
	  Price =p;	
	  Area =a;
	  provider=pr;
  }
  public venue()
  {
	    ID = "000";
		Name = "000";
		location= "000";
		provider=null;
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
  public void setAmenities(String a)
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
  public void viewAmenities()
	{
		System.out.printf("{");
		for(int i=Amenities.size();i>0;i--)
		{	
			 System.out.printf("%s",Amenities.get(i-1));
			 if(i-1==0)
		         System.out.printf("}\n");
			 else
				 System.out.printf(",");
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
	  
	  for(int i=Booked.size();i>0;i--)
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
}
