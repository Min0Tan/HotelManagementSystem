package Guest;

import java.util.Scanner;

public class MasterGuest extends Guest implements GuestInput {
	
	public MasterGuest(GuestKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Guest's Room Number: ");
		int roomnum = input.nextInt();
		this.setRoomnum(roomnum);
		
		System.out.print("Guest Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Guest's Phone Number: ");
		String phone = input.next();
		this.setPhone(phone);
		
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
		case Economic:
			skind = "Eco.";
			break;
		default:
		}
		System.out.println("Kind: "+skind+"Name: "+name+"Room Number: "+roomnum+"Phone Number: "+phone+"Headcount: "+headcount);
	}

}
