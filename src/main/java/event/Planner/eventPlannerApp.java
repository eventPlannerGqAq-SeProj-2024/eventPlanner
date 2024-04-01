package event.Planner;

import java.util.ArrayList;
import java.util.Scanner;

public class eventPlannerApp {
	public Scanner scan = new Scanner(System.in);
	public static dataBase app;
	
	
	public static void showMainMenu() {
		
		System.out.println("==============================================================================");
		System.out.println("welcome to the event planner application");
		System.out.println("==============================================================================");
		
		System.out.println("Please choose an option (Enter the corresponding letter (capital or small)\nto excute the selected operation):\n\n[A] Login\n[B] Sign up\n[Any other character] Exit\n");
	}
	
	public static void main(String args[]) {
		app = dataBase.createApp();
		app.setLists();
		Scanner scan1 = new Scanner(System.in);
		
		String username = "";
		String pass = "";
		char choice = '\0';
		char choice1 = '\0';
		boolean noLoop = false;
		
		do {
			showMainMenu();
			
			choice = scan1.next().charAt(0);
			scan1.nextLine(); // to consume left over line
			
			System.out.println("======================================================");
			
			if(choice == 'A' || choice == 'a') {
				do {
					
					System.out.print("Please enter your username here: ");		
					username =scan1.nextLine();
					
					System.out.print("now please enter your password here: ");
					pass =scan1.nextLine();
					System.out.println();
					
					if(app.checkPass(username,pass)) {
						noLoop = true;
						System.out.println("======================================================");
						System.out.println("Welcome " + app.getLoggedRoleName() + ", nice to meet you again");
						System.out.println("======================================================");
						
						
						
					}
					else {
						System.out.println("Wrong username or password, would you like to try again? (enter [Y/y] for yes)");
						choice1 = scan1.next().charAt(0);
						scan1.nextLine();
						
					}
				}while(!app.checkPass(username, pass) && (choice1 =='Y' || choice1 == 'y'));
			}
			else if(choice == 'B' || choice == 'b') {
				noLoop = true;
				
				//To be implemented
				char c0 = '\0';
				char c1 = '\0';
				System.out.println("Please select your role here:\n[U] User\n[A] Admin\n[P] Provider");
						
					c0 = scan1.nextLine().charAt(0);
					
					switch(c0) {
						case 'U':
						case 'u':System.out.println("User");
							break;
							
						case 'A':
						case 'a':System.out.println("Admin");
							break;	
							
						case 'P':
						case 'p':System.out.println("Provider");
							break;
							
						default:System.out.println("None");
					}
				
			}
			else {
				System.out.println("Thanks for using our application, have a nice day!");
				System.exit(0);				
			}
		}while((choice1  != 'Y' || choice1 != 'y') && noLoop == false);
		
		scan1.close();
		
	}	
}
