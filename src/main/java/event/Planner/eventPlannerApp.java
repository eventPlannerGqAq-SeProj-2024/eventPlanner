package event.Planner;

import java.util.Scanner;

public class eventPlannerApp {
	public static Scanner scan = new Scanner(System.in);
	public static dataBase app;
	
	public static void showAdminAccountDetails() throws InterruptedException {
		char c = '\0';
		System.out.println("\nChoose something to modify(Enter any other Character to go back:\n[1] Name: " + app.getLoggedDetails().get(0) + 
				"\n[2] Username: " + app.getLoggedDetails().get(1) + 
				"\n[3] Email: " + app.getLoggedDetails().get(2) + 
				"\n[4] Birthday date: " + app.getLoggedDetails().get(3) + 
				"\n[5] Gender: " + app.getLoggedDetails().get(4) + 
				"\n[6] Password: " + app.getLoggedDetails().get(5) + "\n");
		System.out.print("Enter option here: ");
		c = scan.nextLine().charAt(0);
		System.out.println();		
		
		if(c == '1') {
			System.out.print("New value: ");
			
			String newName = scan.nextLine();
			app.getLoggedAdmin().setName(newName);
			System.out.println("Name has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
		} else if(c == '2') {
			System.out.print("New value: ");
			
			String newUsername = scan.nextLine();
			app.getLoggedAdmin().setUsername(newUsername);
			System.out.println("Username has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
			
		} else if(c == '3') {
			System.out.print("New value: ");
			
			String newEmail= scan.nextLine();
			while(!app.Admins.get(0).isValidEmail(newEmail)) {
				System.out.print("\nNon-valid email, try agian: ");
				newEmail = scan.nextLine();
			}
			app.getLoggedAdmin().setEmail(newEmail);
			System.out.println("Email has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
			
		} else if(c == '4') {
			System.out.print("New value: ");
			
			String newbdate= scan.nextLine();
			while(!app.Admins.get(0).isValidDate(newbdate)) {
				System.out.print("\nNon-valid birthday date, try agian: ");
				newbdate = scan.nextLine();
			}
			app.getLoggedAdmin().setBday(newbdate);
			System.out.println("Birthday date has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
			
		} else if(c == '5') {
			System.out.print("New value: ");
			
			char newGen= scan.nextLine().charAt(0);
			app.getLoggedAdmin().setGender(newGen);
			System.out.println("Gender has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
		} else if(c == '6') {
			System.out.print("New value: ");
			
			String newPass= scan.nextLine();
			app.getLoggedAdmin().setPassword(newPass);
			System.out.println("Password has been changed, refreshing menu...");
			Thread.sleep(1500);
			showAdminAccountDetails();
			
		} else {
			System.out.print("Redirecting you to main admin menu...");
			Thread.sleep(1500);
			showAdminMenu();
		}
	}
	
	public static void showUserAccountDetails() throws InterruptedException {
		char c = '\0';
		System.out.println("\nChoose something to modify(Enter any other Character to go back:\n[1] Name: " + app.getLoggedDetails().get(0) + 
				"\n[2] Username: " + app.getLoggedDetails().get(1) + 
				"\n[3] Email: " + app.getLoggedDetails().get(2) + 
				"\n[4] Birthday date: " + app.getLoggedDetails().get(3) + 
				"\n[5] Gender: " + app.getLoggedDetails().get(4) + 
				"\n[6] Password: " + app.getLoggedDetails().get(5) + "\n");
		System.out.print("Enter option here: ");
		c = scan.nextLine().charAt(0);
		System.out.println();		
		
		if(c == '1') {
			System.out.print("New value: ");
			
			String newName = scan.nextLine();
			app.getLoggedUser().setName(newName);
			System.out.println("Name has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
		} else if(c == '2') {
			System.out.print("New value: ");
			
			String newUsername = scan.nextLine();
			app.getLoggedUser().setUsername(newUsername);
			System.out.println("Username has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
			
		} else if(c == '3') {
			System.out.print("New value: ");
			
			String newEmail= scan.nextLine();
			while(!app.Users.get(0).isValidEmail(newEmail)) {
				System.out.print("\nNon-valid email, try agian: ");
				newEmail = scan.nextLine();
			}
			app.getLoggedUser().setEmail(newEmail);
			
			System.out.println("Email has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
			
		} else if(c == '4') {
			System.out.print("New value: ");
			
			String newbdate= scan.nextLine();
			while(!app.Users.get(0).isValidDate(newbdate)) {
				System.out.print("\nNon-valid birthday date, try agian: ");
				newbdate = scan.nextLine();
			}
			app.getLoggedUser().setBday(newbdate);
			System.out.println("Birthday date has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
			
		} else if(c == '5') {
			System.out.print("New value: ");
			
			char newGen= scan.nextLine().charAt(0);
			app.getLoggedUser().setGender(newGen);
			System.out.println("Gender has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
		} else if(c == '6') {
			System.out.print("New value: ");
			
			String newPass= scan.nextLine();
			app.getLoggedUser().setPassword(newPass);
			System.out.println("Password has been changed, refreshing menu...");
			Thread.sleep(1500);
			showUserAccountDetails();
			
		} else {
			System.out.print("Redirecting you to main admin menu...");
			Thread.sleep(1500);
			showUserMenu();
		}
	}
	
	public static void showProviderAccountDetails() throws InterruptedException {
		char c = '\0';
		System.out.println("\nChoose something to modify (Enter any other Character to go back):\n[1] Name: " + app.getLoggedDetails().get(0) + 
				"\n[2] Username: " + app.getLoggedDetails().get(1) + 
				"\n[3] Email: " + app.getLoggedDetails().get(2) + 
				"\n[4] Birthday date: " + app.getLoggedDetails().get(3) + 
				"\n[5] Gender: " + app.getLoggedDetails().get(4) + 
				"\n[6] Password: " + app.getLoggedDetails().get(5) + "\n");
		System.out.print("Enter option here: ");
		c = scan.nextLine().charAt(0);
		System.out.println();		
		
		if(c == '1') {
			System.out.print("New value: ");
			
			String newName = scan.nextLine();
			app.getLoggedProvider().setName(newName);
			System.out.println("Name has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
		} else if(c == '2') {
			System.out.print("New value: ");
			
			String newUsername = scan.nextLine();
			app.getLoggedProvider().setUsername(newUsername);
			System.out.println("Username has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
			
		} else if(c == '3') {
			System.out.print("New value: ");
			
			String newEmail= scan.nextLine();
			while(!app.Providers.get(0).isValidEmail(newEmail)) {
				System.out.print("\nNon-valid email, try agian: ");
				newEmail = scan.nextLine();
			}
			app.getLoggedProvider().setEmail(newEmail);
			
			System.out.println("Email has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
			
		} else if(c == '4') {
			System.out.print("New value: ");
			
			String newbdate= scan.nextLine();
			while(!app.Admins.get(0).isValidDate(newbdate)) {
				System.out.print("\nNon-valid birthday date, try agian: ");
				newbdate = scan.nextLine();
			}
			app.getLoggedProvider().setBday(newbdate);
			System.out.println("Birthday date has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
			
		} else if(c == '5') {
			System.out.print("New value: ");
			
			char newGen= scan.nextLine().charAt(0);
			app.getLoggedProvider().setGender(newGen);
			System.out.println("Gender has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
		} else if(c == '6') {
			System.out.print("New value: ");
			
			String newPass= scan.nextLine();
			app.getLoggedProvider().setPassword(newPass);
			System.out.println("Password has been changed, refreshing menu...");
			Thread.sleep(1500);
			showProviderAccountDetails();
			
		} else {
			System.out.print("Redirecting you to main admin menu...");
			Thread.sleep(1500);
			showProviderMenu();
		}
	}
	
	public static void showUserMenu() throws InterruptedException {
		char c = '\0';
		char c1 = '\0';
		
		System.out.println("Role:User\nPlease choose one of the following options:\n\n[A] Request to add a new event\n[B] Manage existing events\n[C] Manage your account\n[D] Logout\n");
		System.out.print("\nEnter your choice here: ");
		c = scan.nextLine().charAt(0);
		
		
			if(c == 'A' || c == 'a') {
				
			} else if(c == 'B' || c == 'b') {
				
			} else if(c == 'C' || c == 'c') {
				showUserAccountDetails();
			} else if(c == 'D' || c == 'd') {
				System.out.println("Please wait a moment while we sign you out. ");
				Thread.sleep(1500);
				System.out.println("Signed out successfully, redirecting you to main menu. ");
				Thread.sleep(1500);
				System.out.println();
				showMainMenu();
			} else {
				System.out.print("Redirecting you to main user menu...\n");
				Thread.sleep(1500);
				showUserMenu();
			}
	}
	
	public static void showAdminMenu() throws InterruptedException {
		char c = '\0';
		char c1 = '\0';
		
		System.out.println("Role:Admin\nPlease choose one of the following options:\n\n[A] Manage users\n[B] Manage providers\n[C] Manage venues\n[D] Manage your account\n[E] Logout");
		System.out.print("\nEnter your choice here: ");
		c = scan.nextLine().charAt(0);
		
		
			if(c == 'A' || c == 'a') {
				
			} else if(c == 'B' || c == 'b') {
				
			} else if(c == 'C' || c == 'c') {
				showProviderAccountDetails();
			} else if(c == 'D' || c == 'd') {
				showAdminAccountDetails();
			}else if(c == 'E' || c == 'e') {
				System.out.println("Please wait a moment while we sign you out. ");
				Thread.sleep(1500);
				System.out.println("Signed out successfully, redirecting you to main menu. ");
				Thread.sleep(1500);
				System.out.println();
				showMainMenu();
			} else {
				System.out.print("Redirecting you to main admin menu...\n");
				Thread.sleep(1500);
				showAdminMenu();
			}
		
		}
	
	public static void showProviderMenu() throws InterruptedException {
		char c = '\0';
		char c1 = '\0';
		
		System.out.println("Role:Provider/Vendor\nPlease choose one of the following options:\n\n[A] Check and manage pending requests\n[B] Manage events\n[C] Delete an existing event\n[D] Manage your account\n[E] Logout");
		System.out.print("\nEnter your choice here: ");
		c = scan.nextLine().charAt(0);
		
		
			if(c == 'A' || c == 'a') {
				
			} else if(c == 'B' || c == 'b') {
				
			} else if(c == 'C' || c == 'c') {
				
			} else if(c == 'D' || c == 'd') {
				showProviderAccountDetails();
			}else if(c == 'E' || c == 'e') {
				System.out.println("Please wait a moment while we sign you out. ");
				Thread.sleep(1500);
				System.out.println("Signed out successfully, redirecting you to main menu. ");
				Thread.sleep(1500);
				System.out.println();
				showMainMenu();
			} else {
				System.out.print("Redirecting you to main admin menu...\n");
				Thread.sleep(1500);
				showAdminMenu();
			}
	}
	
	public static void showSignup() throws InterruptedException {
		char c0 = '\0';
		char c1 = '\0';
		
		do {
			
			System.out.println("Please select your role here(choose other characters to return to main menu):\n[U] User\n[A] Admin\n[P] Provider");
			
			c0 = scan.nextLine().charAt(0);
			
			if(c0 == 'U' || c0 == 'u') {
				scanUserSignupInfo(app.newU);
				app.Users.add(app.newU);
				System.out.println("\nUser created successfully, returning to main menu...");
				Thread.sleep(2000);
			}
			else if(c0 == 'A' || c0 == 'a') {
				scanAdminSignupInfo(app.newA);
				app.Admins.add(app.newA);
				System.out.println("\nAdmin created successfully, returning to main menu...");
				Thread.sleep(2000);
			}
			else if(c0 == 'P' || c0 == 'p') {
				scanProviderSignupInfo(app.newP);
				app.Providers.add(app.newP);
				System.out.println("\nProvider created successfully, returning to main menu...");
				Thread.sleep(2000);
			}
			else {
				System.out.println("Invalid input, do you want to try again? (enter Y\\y): ");
				c1 = scan.nextLine().charAt(0);
			}
		}while(c1 == 'Y' || c1 == 'y');
		
		if(c1 != 'Y' || c1 != 'y')showMainMenu();
	}
	
	public static void showLogin() throws InterruptedException {
		String username = "\0";
		String password = "\0";
		
		char c = '\0';
		
		do {
			System.out.print("Please enter your username here: ");		
			username =scan.nextLine();
			
			System.out.print("now please enter your password here: ");
			password =scan.nextLine();
			System.out.println();
			
			if(app.checkPass(username,password)) {
				
				System.out.println("======================================================");
				System.out.println("Welcome " + app.getLoggedRoleName() + ", nice to meet you again");
				System.out.println("======================================================");
				
				//Role menus:
				//User menu:
				if(dataBase.whoLogged == 'U') {
					//to be implemented
					showUserMenu();
				}
				//Administrator menu:
				else if(dataBase.whoLogged == 'A') {
					//to be implemented
					showAdminMenu();
				}
				//Provider menu:
				else if(dataBase.whoLogged == 'P') {
					//to be implemented
					showProviderMenu();
				}
				
				
			}
			else {
				System.out.println("Wrong username or password, would you like to try again? (enter [Y/y] for yes)");
				c = scan.next().charAt(0);
				scan.nextLine();
			}
		}while(!app.checkPass(username, password) && (c == 'Y' || c =='y'));	
		if((c != 'Y' || c != 'y') && (!app.checkPass(username, password)))showMainMenu();
		//continueChoice = c;
	}
	
	public static void showMainMenu() throws InterruptedException {
		System.out.println("==============================================================================");
		System.out.println("welcome to the event planner application");
		System.out.println("==============================================================================");
		
		System.out.println("Please choose an option (Enter the corresponding letter (capital or small)\nto excute the selected operation):\n\n[A] Login\n[B] Sign up\n[Any other character] Exit\n");
		char c0 = '\0';
		char c1 = '\0';
		
		System.out.print("Enter your choice here: ");
		c0 = scan.nextLine().charAt(0);
		System.out.println("======================================================");
		
		if(c0 == 'A' || c0 =='a') {
			showLogin();
		}
		else if(c0 == 'B' || c0 == 'b') {
			showSignup();
		}else {
			System.out.println("Thanks for using our application, have a nice day!");
			System.exit(0);	
		}
		
	}
	
	public static void scanUserSignupInfo(User u) {
		System.out.println();
		System.out.print("Name: ");
		String newname = scan.nextLine();
		u.setName(newname);
		
		System.out.print("User name: ");
		String newusername = scan.nextLine();
		u.setUsername(newusername);
		
		System.out.print("Email(atleast 15 characters): ");
		String newemail = scan.nextLine();
		newemail = newemail.toLowerCase();
		
		
		while(!app.Users.get(0).isValidEmail(newemail)) {
			System.out.print("re-enter a valid email here please: ");
			newemail = scan.nextLine();
		}
		u.setEmail(newemail);
		
		System.out.print("Birthday date (dd/mm/yyyy, example: 01/01/1995): ");
		String newbdate = scan.nextLine();
		
		while(!app.Users.get(0).isValidDate(newbdate)) {
			System.out.print("re-enter a valid birthday date here please: ");
			newbdate = scan.nextLine();
		}
		u.setBday(newbdate);
		
		System.out.print("Gender[M/F]: ");
		char newGen = scan.nextLine().charAt(0);
		
		while(newGen != 'M' && newGen != 'm' && newGen != 'F' && newGen != 'f') {
			System.out.print("Please re-enter a valid gender type (M \\ F): ");
			newGen = scan.nextLine().charAt(0);
		}
		u.setGender(newGen);
		
		System.out.print("Password: ");
		String newpass = scan.nextLine();
		u.setPassword(newpass);
	}
	
	public static void scanAdminSignupInfo(Admin u) {
		
		System.out.println();
		System.out.print("Name: ");
		String newname = scan.nextLine();
		u.setName(newname);
		
		System.out.print("User name: ");
		String newusername = scan.nextLine();
		u.setUsername(newusername);
		
		System.out.print("Email(atleast 15 characters): ");
		String newemail = scan.nextLine();
		newemail = newemail.toLowerCase();
		
		
		while(!app.Users.get(0).isValidEmail(newemail)) {
			System.out.print("re-enter a valid email here please: ");
			newemail = scan.nextLine();
		}
		u.setEmail(newemail);
		
		System.out.print("Birthday date (dd/mm/yyyy, example: 01/01/1995): ");
		String newbdate = scan.nextLine();
		
		while(!app.Users.get(0).isValidDate(newbdate)) {
			System.out.print("re-enter a valid birthday date here please: ");
			newbdate = scan.nextLine();
		}
		u.setBday(newbdate);
		
		System.out.print("Gender[M/F]: ");
		char newGen = scan.nextLine().charAt(0);
		
		while(newGen != 'M' && newGen != 'm' && newGen != 'F' && newGen != 'f') {
			System.out.print("Please re-enter a valid gender type (M \\ F): ");
			newGen = scan.nextLine().charAt(0);
		}
		u.setGender(newGen);
		
		System.out.print("Password: ");
		String newpass = scan.nextLine();
		u.setPassword(newpass);
	}
	
	public static void scanProviderSignupInfo(Provider u) {
		
		System.out.println();
		System.out.print("Name: ");
		String newname = scan.nextLine();
		u.setName(newname);
		
		System.out.print("User name: ");
		String newusername = scan.nextLine();
		u.setUsername(newusername);
		
		System.out.print("Email(at least 15 characters): ");
		String newemail = scan.nextLine();
		newemail = newemail.toLowerCase();
		
		
		while(!app.Users.get(0).isValidEmail(newemail)) {
			System.out.print("re-enter a valid email here please: ");
			newemail = scan.nextLine();
		}
		u.setEmail(newemail);
		
		System.out.print("Birthday date (dd/mm/yyyy, example: 01/01/1995): ");
		String newbdate = scan.nextLine();
		
		while(!app.Users.get(0).isValidDate(newbdate)) {
			System.out.print("re-enter a valid birthday date here please: ");
			newbdate = scan.nextLine();
		}
		u.setBday(newbdate);
		
		System.out.print("Gender[M/F]: ");
		char newGen = scan.nextLine().charAt(0);
		
		while(newGen != 'M' && newGen != 'm' && newGen != 'F' && newGen != 'f') {
			System.out.print("Please re-enter a valid gender type (M \\ F): ");
			newGen = scan.nextLine().charAt(0);
		}
		u.setGender(newGen);
		
		System.out.print("Password: ");
		String newpass = scan.nextLine();
		u.setPassword(newpass);
	}
	
	public static void main(String args[]) throws InterruptedException {
		app = dataBase.createApp();
		app.setLists();
		
		showMainMenu();
		
		
	}	
}
