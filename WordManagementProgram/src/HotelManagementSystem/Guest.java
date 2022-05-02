package HotelManagementSystem;

import java.util.Scanner;

public class Guest {
	    protected GuestKind kind = GuestKind.Master;
	    protected String name;
	    protected int roomnum;
	    protected int headcount;
	    protected String email;
	    protected int phone;
	
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
	
	    public GuestKind getKind() {
	    	return kind;
	    }
	    
	    public void setKind(GuestKind kind) {
	    	this.kind = kind;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    
	    public void setName(String name) {
	    	this.name = name;
	    }
	    
	    public int getRoomnum() {
	    	return roomnum;
	    }
	    
	    public void setRoomnum(int roomnum) {
	    	this.roomnum = roomnum;
	    }
	    
	    public int getHeadcount() {
	    	return headcount;
	    }
	    
	    public void setHeadcount(int headcount) {
	    	this.headcount = headcount;
	    }
	    
	    public String getEmail() {
	    	return email;
	    }
	    
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	    
	    public int getPhone() {
	    	return phone;
	    }
	    
	    public void setPhone(int phone) {
	    	this.phone = phone;
	    }
	    
	    public void printInfo() {
	    	System.out.println("Name: "+name+"Room Number: "+roomnum+"Headcount: "+headcount+"E-mail: "+email+"Phone number: "+phone);
	    }
	    
	    public void getGuestInput(Scanner input) {
	    	System.out.print("Room Number: ");
	    	int roomnum = input.nextInt();
	    	this.setRoomnum(roomnum);
	    	
	    	System.out.print("Guest Name: ");
	    	String name = input.next();
	    	this.setName(name);
	    	
	    	System.out.print("Guest Headcount: ");
	    	int headcount = input.nextInt();
	    	this.setHeadcount(headcount);
	    	
	    	System.out.print("Guest's E-mail address: ");
	    	String email = input.next();
	    	this.setEmail(email);
	    	
	    	System.out.print("Guest's Phone number: ");
	    	int phone = input.nextInt();
	    	this.setPhone(phone);
	    }

}
