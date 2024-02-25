package event.Planner;

import java.util.*;

public class adminLoginMain {
		
	public static ArrayList<String> adminNames = new ArrayList<String>();
	public static ArrayList<String> adminIDs = new ArrayList<String>();
	public static ArrayList<String> adminPasswords = new ArrayList<String>();
	
	public static boolean checkAdminPass(String ID,String pass) {
		
		for(int i=0;i<adminPasswords.size();i++) {
			if(pass.equals(adminPasswords.get(i)) && (adminIDs.indexOf(ID) == adminPasswords.indexOf(pass))) {
				return true;
			}
		}
		return false;
	}
	
	public static String getName(String ID) {
			
			for(int i=0;i<adminIDs.size();i++) {
				if(adminIDs.indexOf(ID) == i) {
					return adminNames.get(i);
				}
			}
			
			return "NaN";
	}
	
	public static void setIDs() {
		adminIDs.add("0001");
		adminIDs.add("0010");
		adminIDs.add("0011");
		adminIDs.add("0100");
		adminIDs.add("0101");
		adminIDs.add("0110");
		adminIDs.add("0111");
	}
	
	public static void setNames() {
		adminNames.add("Ali");
		adminNames.add("Ahmad");
		adminNames.add("Ruba");
		adminNames.add("Ghassan");
		adminNames.add("Adel");
		adminNames.add("Malak");
		adminNames.add("Toqa");	
	}
	
	public static void setPasswords() {
		adminPasswords.add("admin1111");
		adminPasswords.add("admin2222");
		adminPasswords.add("admin3333");
		adminPasswords.add("admin4444");
		adminPasswords.add("admin5555");
		adminPasswords.add("admin6666");
		adminPasswords.add("admin7777");
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		setIDs();
		setPasswords();
		setNames();
		
		System.out.print("Please enter your ID here: ");
		
		
		String ID = scan.nextLine();
		
		while(!adminIDs.contains(ID)) {
			System.out.print("No such ID, please try again: ");
			ID = scan.nextLine();
		}
		
		System.out.print("Please enter your password here: ");
		
		String pass = scan.nextLine();

		while(!checkAdminPass(ID,pass)) {
			System.out.print("Wrong password, please try again: ");
			pass = scan.nextLine();
		}
		
		System.out.println("\nWelcome home " + getName(ID));
		
	}
}
