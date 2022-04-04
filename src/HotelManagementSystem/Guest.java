package HotelManagementSystem;

public class Guest {
	
	String name;
	int roomnum;
	int headcount;
	String email;
	int phone;
	
	public Guest() {
	}
	
	public Guest(String name, int roomnum) {
		this.name = name;
		this.roomnum = roomnum;
	}
	
	public Guest(String name, int roomnum, int headcount, String email, int phone) {
		this.name = name;
		this.roomnum = roomnum;
		this.headcount = headcount;
		this.email = email;
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name + "Room Number: " + roomnum + "Headcount: " + headcount + "E-mail Address: " + email + "Phone Number: " + phone);
	}

}
