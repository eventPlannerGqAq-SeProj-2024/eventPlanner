package event.Planner;

public class Hall {
	private String id;
	private String name;
	private float area;
	private boolean booked;
	private int maxAttendantsCount;
	
	public Hall(){
		id = "000";
		name = "000";
		area = 0;
		booked = false;
		maxAttendantsCount = 100;
	}
	
	public Hall(String id,String n,float a,boolean b,int m){
		this.id = id;
		name = n;
		area = a;
		booked = b;
		maxAttendantsCount = m;
	}
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public float getArea() {
		return area;
	}
	
	public boolean isBooked() {
		return booked;
	}
	
	public int getMaxAttendanceCount() {
		return maxAttendantsCount;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setArea(float a) {
		area = a;
	}
	
	public void setBooked(boolean b) {
		booked = b;
	}
	public void setMaxAttendanceCount(int m ){
		maxAttendantsCount = m;
	}
	
	
}
