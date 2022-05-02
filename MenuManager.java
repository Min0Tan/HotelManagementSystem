package HotelManagementSystem;

import java.util.Scanner;

public class MenuManager {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GuestManager guestmanager = new GuestManager(input);
			
			int num = 0;
			
			while (num != 6) {
				System.out.println("1. Add guest");
				System.out.println("2. Delete Guest");
				System.out.println("3. Edit Guest");
				System.out.println("4. View Guest");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.println("Select one number 1-6: ");
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
				}
			}
		}
}
