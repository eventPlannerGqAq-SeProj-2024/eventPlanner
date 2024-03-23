package event.Planner;

public class wedding extends event {
	
	private String Bride,Groom,Officiant,Wedding_type,DJ,Cake;
	public wedding(String id,String name,venue venue,String date,String theme,String description,int attendee_count,Provider provider,String bride, String groom,String officiant,String wedding_type, String dj,String cake)
	{
		super(id,name,venue,date,theme,description,attendee_count,provider);		
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
}
