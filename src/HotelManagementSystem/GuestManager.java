package HotelManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Guest.MasterGuest;
import Guest.AdvancedGuest;
import Guest.EconomicGuest;
import Guest.GuestInput;
import Guest.GuestKind;

public class GuestManager {
	ArrayList<GuestInput> guests = new ArrayList<GuestInput>();
	Scanner input;
	GuestManager(Scanner input) {
		this.input = input;
	}
	
	public void addGuest() {
		int kind = 0;
		GuestInput guestInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Master");
				System.out.println("2 for Advanced");
				System.out.println("3 for Economic");
				System.out.println("Select Number 1~3 for Member Kind: ");
				
				kind = input.nextInt();
				
				if (kind == 1) {
					guestInput = new MasterGuest(GuestKind.Advanced);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else if (kind == 2) {
					guestInput = new AdvancedGuest(GuestKind.Advanced);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else if (kind == 3) {
					guestInput = new EconomicGuest(GuestKind.Economic);
					guestInput.getUserInput(input);
					guests.add(guestInput);
					break;
				}
				else {
					    System.out.println("Select Number 1~3 for Member Kind: ");
				}
		
			}
			catch(InputMismatchException e) {
				System.out.println("Plaease put an integer between 1 to 3");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteGuest() {
			System.out.print("Room Number: ");
			int roomnum = input.nextInt();
			int index = findIndex(roomnum);
			removefromGuests(index, roomnum);

		}
	
	public int findIndex(int roomnum) {
		int index = -1;
		for (int i = 0; i<guests.size(); i++) {
			    if (guests.get(i).getRoomnum() == roomnum) {
			    	index = i;
			    	break;
			    }
		}
		return index;
		
	}
	
	public int removefromGuests(int index, int roomnum) {
		if (index >= 0) {
			guests.remove(index);
			System.out.println("The Room Number " + roomnum + "is deleted");
			return 1;
		}
		else {
			System.out.println("The Room has not been registered");
			return -1;
		}
		
	}
		
		public void editGuest() {
			System.out.print("Guest's Room Number: ");
			int roomNumber = input.nextInt();
			for (int i = 0; i < guests.size(); i++) {
				    GuestInput guest = guests.get(i);
				    if (guest.getRoomnum() == roomNumber) {
				    	    int num = -1;
				    	    while (num != 5) {
				    	    	showEditMenu();
				    	    	num = input.nextInt();
				    	    	switch(num) {
				    	    	case 1:
				    	    		guest.setGuestRoomnum(input);
				    	    		break;
				    	    	case 2:
				    	    		guest.setGuestName(input);
				    	    		break;
				    	    	case 3:
				    	    		guest.setGuestPhone(input);
				    	    		break;
				    	    	case 4:
				    	    		guest.setGuestHeadcount(input);
				    	    		break;
				    	    	default:
				    	    		continue;
				    	    	}
				    } //while
				    break;
			}//if
		}//for
	
	}
	
	public void viewGuests() {
		System.out.println("# of registered Guests: " + guests.size());
		for (int i = 0; i < guests.size(); i++) {
			guests.get(i).printInfo();
		}
	}
	

	
	public void showEditMenu() {
		System.out.println("***Guest Info Edit Menu***");
	    System.out.println(" 1. Edit Room Number");
	    System.out.println(" 2. Edit Name");
	    System.out.println(" 3. Edit Phone Number");
	    System.out.println(" 4. Edit Headcount");
	    System.out.println(" 5. Exit");
	    System.out.println("Select A Number between 1 to 5");
		
	}

}
