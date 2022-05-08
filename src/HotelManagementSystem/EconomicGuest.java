package HotelManagementSystem;

import java.util.Scanner;

public class EconomicGuest extends Guest {
	
	protected String homephone;
	protected int night;
	
	public EconomicGuest(GuestKind kind) {
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
			
			System.out.println("Do you have a Mibilephone number? (Y/N)");
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
		
		answer = 'X';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			
			System.out.println("Do you have a Home phone number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Guest's Home phone number: ");
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
	
	public void printInfo() {
		String skind = "None";
		switch(this.kind) {
		case Master:
			skind = "Mas.";
			break;
		case Advanced:
			skind = "Adv.";
			break;
		case Middle:
			skind = "Mid.";
			break;
		default:
		}
		System.out.println("Kind: "+skind+"Name: "+name+"Room Number: "+roomnum+"Phone Number: "+phone+"Headcount: "+headcount);
	}

}
