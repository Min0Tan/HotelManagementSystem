package Guest;

import java.util.Scanner;

import exception.PhoneFormatException;

public class MasterGuest extends TeenageGuest {
	
	public MasterGuest(GuestKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGuestRoomnum(input);
		setGuestName(input);
		setGuestPhonewithYN(input);
		setGuestHeadcount(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + "Name: " + name + "Room Number: " + roomnum + "Phone Number: " + phone+"Headcount: " + headcount);
	}

	@Override
	public void setGuestPhone(Scanner input){
		// TODO Auto-generated method stub
		
	}

}
