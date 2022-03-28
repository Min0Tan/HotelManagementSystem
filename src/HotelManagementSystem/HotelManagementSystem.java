package HotelManagementSystem;

import java.util.Scanner;

public class HotelManagementSystem {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int num = 0;
			
			while (num != 5) {
				System.out.println("1. Select Room to use");
				System.out.println("2. Delete Room");
				System.out.println("3. Edit Room");
				System.out.println("4. View Room");
				System.out.println("5. Exit");
				System.out.println("Select one number 1~5");
				num = input.nextInt();
				
				switch (num) {
				
				case 1:
					System.out.println("Input your room number that you want to use: ");
					String room = input.next();
					for (int i = 1; i < 100; i++) {
						System.out.println("Enter your additional options without any spaces(ex: singlebed): ");
						System.out.println("If there's no more additional option, enter '/' to end the input"); 
						String option = input.next();
						if (option.equals("/")) {
							break;
						}
					}
					break;
					
				case 2:
					deleteRoom();
					break;
					
				case 3:
					editRoom();
					break;
					
				case 4:
					viewRooms();
					break;
				}
			}
		}
		
		public static void deleteRoom() {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the Room number to Delete: ");
				int delroom = input.nextInt();
		}
		
		public static void editRoom() {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Room number to Edit: ");
			int editroom = input.nextInt();
		}
		
		public static void viewRooms() {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Room number to View: ");
			int viewroom = input.nextInt();
		}
		
}