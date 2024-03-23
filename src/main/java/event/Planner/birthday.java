package event.Planner;

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
	
	public void setAge(int n)
	{
		Age=n;
	}
	
	public void setCelibrant_name(String n)
	{
		Celibrant_name=n;
	}
	
	public void setCake(String n)
	{
		Cake=n;
	}
	
}
