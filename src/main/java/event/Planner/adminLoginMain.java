package event.Planner;

import java.util.*;

public class adminLoginMain {
		
	public static boolean checkAdminPass(String pass) {
		
		for(int i=0;i<passwords.size();i++) {
			if(pass.equals(passwords.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static ArrayList<String> passwords = new ArrayList<String>();
	
	public static void main(String args[]) {
		
		
		passwords.add("admin1");
		passwords.add("admin2");
		passwords.add("admin3");
		passwords.add("admin4");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hello, please enter your password here: ");
		
		String pass = scan.nextLine();

		while(!checkAdminPass(pass)) {
			System.out.print("Wrong password, please try again: ");
			pass = scan.nextLine();
		}
		
		System.out.println("\nWelcome home admin");
		
	}
}
