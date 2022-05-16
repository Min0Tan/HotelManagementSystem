package HotelManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GuestManager guestmanager = new GuestManager(input);
			
			selectMenu(input, guestmanager);
		}
		
		public static void selectMenu(Scanner input, GuestManager guestmanager) {
			int num = -1;
			
			while (num != 5) {
				try {
					showMenu();
					
					num = input.nextInt();
					
					switch (num) {
					
					case 1:
						guestmanager.addGuest();
						break;
						
					case 2:
						guestmanager.deleteGuest();
						break;
						
					case 3:
						guestmanager.editGuest();
						break;
						
					case 4:
						guestmanager.viewGuests();
						break;
					default:
						continue;
					}
				
				}
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 to 5");
					if (input.hasNext()) {
						input.next();
					}
					num = -1;
				}
			}
			
		}
		
		public static void showMenu() {
			System.out.println("*** Hotel Management System Menu ***");
			System.out.println("1. Add guest");
			System.out.println("2. Delete Guest");
			System.out.println("3. Edit Guest");
			System.out.println("4. View Guest");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
		}
}
