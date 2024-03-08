package event.Planner;

public class User {
	private String username;
	private String password;
	private String name;
	private String bday;
	private String email;
	private char gender;
	
	public User() {
		username = "temp";
		password = "temp";
		name = "temp";
		email = "temp@temp.com";
		bday = "tt/tt/tt";
		gender = 'x';
		
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
	
}
