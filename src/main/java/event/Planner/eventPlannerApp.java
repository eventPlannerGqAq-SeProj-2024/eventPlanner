package event.Planner;

import java.util.ArrayList;

public class eventPlannerApp {
	
	public  ArrayList<String> adminNames = new ArrayList<String>();
	public  ArrayList<String> adminUsernames = new ArrayList<String>();
	public  ArrayList<String> adminPasswords = new ArrayList<String>();
	
	public  ArrayList<String> userNames = new ArrayList<String>();
	public  ArrayList<String> userUsernames = new ArrayList<String>();
	public  ArrayList<String> userPasswords = new ArrayList<String>();
	
	public  ArrayList<String> providerNames = new ArrayList<String>();
	public  ArrayList<String> providerUsernames = new ArrayList<String>();
	public  ArrayList<String> providerPasswords = new ArrayList<String>();
	
	public  boolean checkAdminPass(String username,String pass) {
		
		if(!(adminUsernames.contains(username) && adminPasswords.contains(pass)))return false;
		
		for(int i=0;i<adminPasswords.size();i++) {
			if((adminUsernames.indexOf(username) == adminPasswords.indexOf(pass)) && pass.equals(adminPasswords.get(i)) ) {
				return true;
			}
		}
		return false;
	}
	
	public void setUsernames() {
		adminUsernames.add("0001");
		adminUsernames.add("0010");
		adminUsernames.add("0011");
		adminUsernames.add("0100");
		adminUsernames.add("0101");
		adminUsernames.add("0110");
		adminUsernames.add("user name");
	}
	
	public void setNames() {
		adminNames.add("Ali");
		adminNames.add("Ahmad");
		adminNames.add("Ruba");
		adminNames.add("Ghassan");
		adminNames.add("Adel");
		adminNames.add("Malak");
		adminNames.add("Toqa");	
	}
	
	public void setPasswords() {
		adminPasswords.add("admin1111");
		adminPasswords.add("admin2222");
		adminPasswords.add("admin3333");
		adminPasswords.add("admin4444");
		adminPasswords.add("admin5555");
		adminPasswords.add("admin6666");
		adminPasswords.add("password");
	}
	
	
	
	
}
