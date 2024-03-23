package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class venue {
  private String Name,location,ID;
  private ArrayList<String> Amenities = new ArrayList<String>();
  private int Capacity =100, Price= 100,Area =1000;
  private boolean Booked =false;
  public venue(String i,String n,String l,int c,int a, int p, boolean b)
  {
	  ID =i;
	  Name =n;
	  location =l;
	  Capacity =c;
	  Price =p;	
	  Booked =b;
	  Area =a;
  }
  public venue()
  {
	    ID = "000";
		Name = "000";
		location= "000";
	//	Area = 1000;
	//	Booked = false;
	//	Price = 100;
	//	Capacity = 100;	
  }
  public void setName(String p) 
  {
	  Name =p;
  }
  public void setID(String p) 
  {
	  ID =p;
  }
  public void setArea(int p) 
  {
	  Area =p;
  }
  public void setBooked(boolean p) 
  {
	  Booked =p;
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
  public boolean getBooked()
  {
	  return Booked;
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
}
