package Guest;

import java.util.Scanner;

import exception.PhoneFormatException;

public interface GuestInput {
	
	public int getRoomnum();
	
	public void setRoomnum(int roomnum);
	
	public String getName();
	
	public void setName(String name);
	
	public String getPhone();
	
	public void setPhone(String phone) throws PhoneFormatException;
	
	public int getHeadcount();
	
	public void setHeadcount(int headcount);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setGuestRoomnum(Scanner input);
	
	public void setGuestName(Scanner input);
	
	public void setGuestPhone(Scanner input);
	
	public void setGuestHeadcount(Scanner input);

}
