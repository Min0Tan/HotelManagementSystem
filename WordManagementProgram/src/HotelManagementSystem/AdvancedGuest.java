package HotelManagementSystem;

import java.util.Scanner;

public class AdvancedGuest extends Guest {
	
	public void getUserInput(Scanner input) {
		System.out.print("Guest's Room Number: ");
		int roomnum = input.nextInt();
		this.setRoomnum(roomnum);
		
		System.out.print("Guest Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'X';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			
			System.out.println("Do you have a E-mail address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Guest's E-mail Address: ");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.setEmail("");
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Phone Number: ");
		int phone = input.nextInt();
		this.setPhone(phone);
	}

}
