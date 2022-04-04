package HotelManagementSystem;

import java.util.Scanner;

public class MenuManager {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GuestManager guestmanager = new GuestManager(input);
			
			int num = 0;
			
			while (num != 5) {
				System.out.println("1. Add guest");
				System.out.println("2. Delete Room");
				System.out.println("3. Edit Room");
				System.out.println("4. View Room");
				System.out.println("5. Exit");
				System.out.println("Select one number 1~5");
				num = input.nextInt();
				
				switch (num) {
				
				case 1:
					guestmanager.addGuest();
					break;
					
				case 2:
					guestmanager.deleteRoom();
					break;
					
				case 3:
					guestmanager.editRoom();
					break;
					
				case 4:
					guestmanager.viewGuest();
					break;
				}
			}
		}
}
