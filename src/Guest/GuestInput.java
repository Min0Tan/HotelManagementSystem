package Guest;

import java.util.Scanner;

public interface GuestInput {
	
	public int getRoomnum();
	
	public void setRoomnum(int roomnum);
	
	public void setName(String name);
	
	public void setPhone(String phone);
	
	public void setHeadcount(int headcount);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
