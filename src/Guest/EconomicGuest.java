package Guest;

import java.util.Scanner;

import exception.PhoneFormatException;

public class EconomicGuest extends TeenageGuest {
	
	protected String mobilePhone;
	protected String homePhone;
	
	public EconomicGuest(GuestKind kind) {
		super(kind);
	}
	
	
	public void getUserInput(Scanner input) {
		setGuestRoomnum(input);
		setGuestName(input);
		setGuestPhonewithYN(input);
		setHomePhonewithYN(input);
		setGuestHeadcount(input);
	}
	
	public void setHomePhonewithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			System.out.println("Do you have a Home phone number? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					setGuestPhone(input);
					break;
				}
				else if (answer == 'N' || answer == 'n') {
					this.setPhone("");
					break;
				}
				else {
					
				}
			}
			catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Format, put the phone number that contains 010");	
				}
		}
		
	}
	
	public void printInfo() {
		String skind = getKindString();

		System.out.println("Kind: "+skind+"Name: "+name+"Room Number: "+roomnum+"Phone Number: "+phone+"Headcount: "+headcount);
	}


	@Override
	public void setGuestPhone(Scanner input) {
		// TODO Auto-generated method stub
		
	}
	


}
