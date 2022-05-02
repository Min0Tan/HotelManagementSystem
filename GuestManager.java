package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestManager {
	ArrayList<Guest> guests = new ArrayList<Guest>();
	Scanner input;
	GuestManager(Scanner input) {
		this.input = input;
	}
	
	public void addGuest() {
		int kind = 0;
		Guest guest;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Economic");
			System.out.println("2 for Advanced");
			System.out.println("Select Number for Member Kind between 1 and 2: ");
			
			kind = input.nextInt();
			
			if (kind == 1) {
				guest = new Guest(GuestKind.Economic);
				guest.getGuestInput(input);
				guests.add(guest);
				break;
			}
			else if (kind == 2) {
				guest = new AdvancedGuest(GuestKind.Advanced);
				guest.getGuestInput(input);
				guests.add(guest);
				break;
			}
			else {
				    System.out.println("Select Number for Member Kind between 1 and 2");
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
				    Guest guest = guests.get(i);
				    if (guest.getRoomnum() == roomNumber) {
				    	    int num = -1;
				    	    while (num != 7) {
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
				    	    	    	    guest.setRoomnum(roomnum);
				    	    	    }
				    	    	    else if (num == 2) {
				    	    	    	    System.out.println("Guest Name: ");
				    	    	    	    String name = input.next();
				    	    	    	    guest.setName(name);
				    	    	    }
				    	    	    
				    	            else if (num == 3) {
				    	            	System.out.println("Guest's Phone Number: ");
				    	            	String phone = input.next();
				    	            	guest.setPhone(phone);
				    	            }
				    	    	    
				    	            else if (num == 4) {
			    	    	    	    System.out.println("Headcount: ");
			    	    	            int headcount = input.nextInt();
			    	    	            guest.setHeadcount(headcount);
			    	    	            
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
