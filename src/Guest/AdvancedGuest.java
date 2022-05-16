package Guest;

import java.util.Scanner;

public class AdvancedGuest extends TeenageGuest {
	
	public AdvancedGuest(GuestKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGuestRoomnum(input);
		setGuestName(input);
		setGuestPhonewithYN(input);		
		setGuestHeadcount(input);
	}

	@Override
	public void setGuestPhone(Scanner input) {
		// TODO Auto-generated method stub
		
	}

}
