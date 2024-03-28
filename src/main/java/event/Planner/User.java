package event.Planner;

public class User {
	private String username;
	private String password;
	private String name;
	private String bday;
	private String email;
	private char gender;
	private boolean isLogged;
	
	
	public User() {
		username = "temp";
		password = "temp";
		name = "temp";
		email = "temp@temp.com";
		bday = "dd/mm/yy";
		gender = 'x';
		isLogged = false;		
	}
	
	public User(String u,String p,String n, String e, String b, char g,boolean l) {
		username = u;
		password = p;
		name = n;
		email = e;
		bday = b;
		gender = 'g';
		isLogged = l;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setUsername(String u) {
		username = u;
	}
	
	public void setPassword(String p) {
		password = p;
	}

	public void setEmail(String e) {
		email = e;
	}
	
	public void setBday(String bday) {
		this.bday = bday;
	}
	
	public void setGender(char g) {
		gender = g;
	}
	
	public void setLogged(boolean l) {
		isLogged = l;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPass() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getBday() {
		return bday;
	}
	
	public char getGender() {
		return gender;
	}	
	
	public boolean isLogged() {
		return isLogged;
	}
	
	public boolean isValidEmail() {
		if(email.contains("@") && email.contains(".com"))return true;
		return false;
	}
	
	
	
	
}
