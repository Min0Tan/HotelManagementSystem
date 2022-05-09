package HotelManagementSystem;

import java.util.ArrayList;
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
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Master");
			System.out.println("2 for Advanced");
			System.out.println("3 for Economic");
			System.out.println("Select Number 1~3 for Member Kind: ");
			
			kind = input.nextInt();
			
			if (kind == 1) {
				guestInput = new MasterGuest(GuestKind.Master);
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
	}
		
	public void deleteGuest() {
			System.out.print("Room Number: ");
			int roomnum = input.nextInt();
			int index = -1;
			for (int i = 0; i<guests.size(); i++) {
				    if (guests.get(i).getRoomnum() == roomnum) {
				    	index = i;
				    	break;
				    }
			}
			
			if (index >= 0) {
				    guests.remove(index);
				    System.out.println("The Room Number "+roomnum+"is deleted");
			}
			else {
				    System.out.println("The Room has not been registered");
				    return;
			}
		}
		
		public void editGuest() {
			System.out.print("Guest's Room Number: ");
			int roomNumber = input.nextInt();
			for (int i = 0; i < guests.size(); i++) {
				    GuestInput guestInput = guests.get(i);
				    if (guestInput.getRoomnum() == roomNumber) {
				    	    int num = -1;
				    	    while (num != 5) {
				    	    	    System.out.println("***Guest Info Edit Menu***");
				    	    	    System.out.println(" 1. Edit Room Number");
				    	    	    System.out.println(" 2. Edit Name");
				    	    	    System.out.println(" 3. Edit Phone Number");
				    	    	    System.out.println(" 4. Edit Headcount");
				    	    	    System.out.println(" 5. Exit");
				    	    	    System.out.println("Select A Number between 1 to 5");
				    	    	    
				    	    	    num = input.nextInt();
				    	    	    if (num == 1) {
				    	    	    	    System.out.println("Guest's Room Number: ");
				    	    	    	    int roomnum = input.nextInt();
				    	    	    	    guestInput.setRoomnum(roomnum);
				    	    	    }
				    	    	    else if (num == 2) {
				    	    	    	    System.out.println("Guest Name: ");
				    	    	    	    String name = input.next();
				    	    	    	    guestInput.setName(name);
				    	    	    }
				    	    	    
				    	            else if (num == 3) {
				    	            	System.out.println("Guest's Phone Number: ");
				    	            	String phone = input.next();
				    	            	guestInput.setPhone(phone);
				    	            }
				    	    	    
				    	            else if (num == 4) {
			    	    	    	    System.out.println("Headcount: ");
			    	    	            int headcount = input.nextInt();
			    	    	            guestInput.setHeadcount(headcount);
			    	    	            
				    	            }
				    	            else {
				    	            	    continue;
				    	            }
				    }
				    break;
			}
		}
	
	}
	
	public void viewGuests() {
//		System.out.print("Guest's Room Number: ");
		System.out.println("# of registered Guests: "+guests.size());
		for (int i = 0; i < guests.size(); i++) {
			guests.get(i).printInfo();
		}
	}

}
