package HotelManagementSystem;

import java.util.Scanner;

public class GuestManager {
	Guest guest;
	Scanner input;
	GuestManager(Scanner input) {
		this.input = input;
	}
	
	public void addGuest() {
		guest = new Guest();
		System.out.print("Room Number: ");
		guest.roomnum = input.nextInt();
		
		System.out.print("Guest Name: ");
		guest.name = input.next();
		
		System.out.print("Headcount: ");
		guest.headcount = input.nextInt();
		
		System.out.print("E-mail Address: ");
		guest.email = input.next();
		
		System.out.print("Phone Number(Only enter NUMBERS): ");
		guest.phone = input.nextInt();
	}
	
	public void deleteRoom() {
			System.out.print("Enter the Room Number to delete: ");
			int guestroomnum = input.nextInt();
			if (guest == null) {
				System.out.println("The room is deleted.");
				return;
		}
		
		if (guest.roomnum == guestroomnum) {
				guest = null;
				System.out.println("The Room is deleted");
		}
	}
	
	public void editRoom() {
			System.out.print("Enter the Room Number to edit");
			int guestroomnum = input.nextInt();
			if (guest.roomnum == guestroomnum) {
				System.out.println("The room to be edited is " + guestroomnum);
		}
	}
	
	public void viewGuest() {
			System.out.print("The Guest's Room Number: ");
			int guestroomnum = input.nextInt();
			if (guest.roomnum == guestroomnum) {
					guest.printInfo();
			}
	}

}
