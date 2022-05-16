package Guest;

import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class TeenageGuest extends Guest {
	
	public TeenageGuest(GuestKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: "+skind+"Name: "+name+"Room Number: "+roomnum+"Phone Number: "+phone+"Headcount: "+headcount);
	}
	
	public void setGuestPhonewithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
			
			System.out.println("Do you have a Mobile phone number? (Y/N)");
			answer = input.next().charAt(0);
			try {
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
			catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Format, put the phone number that contains 010");	
			}
		}
	}

}
