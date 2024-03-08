package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class venue {
  private String Name,location;
  private ArrayList<String> Amenities = new ArrayList<String>();
  private int Capacity, Price;
  public venue(String n,String l,int c, int p)
  {
	  Name =n;
	  location =l;
	  Capacity =c;
	  Price =p;	
  }
  public void setName(String p) 
  {
	  Name =p;
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
