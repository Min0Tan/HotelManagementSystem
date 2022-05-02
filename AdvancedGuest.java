package HotelManagementSystem;

import java.util.Scanner;

public class AdvancedGuest extends Guest {
	
	public AdvancedGuest(GuestKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Guest's Room Number: ");
		int roomnum = input.nextInt();
		this.setRoomnum(roomnum);
		
		System.out.print("Guest Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'X';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			
			System.out.println("Do you have a Mobile phone number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Guest's Phone Number: ");
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.setPhone("");
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Headcount: ");
		int headcount = input.nextInt();
		this.setHeadcount(headcount);
	}

}
