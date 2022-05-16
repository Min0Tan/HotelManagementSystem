package Guest;

import java.util.Scanner;

public class MasterGuest extends Guest {
	
	public MasterGuest(GuestKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGuestRoomnum(input);
		setGuestName(input);
		setGuestPhone(input);
		setGuestHeadcount(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + "Name: " + name + "Room Number: " + roomnum + "Phone Number: " + phone+"Headcount: " + headcount);
	}

	@Override
	public void setGuestPhone(Scanner input) {
		// TODO Auto-generated method stub
		
	}

}
