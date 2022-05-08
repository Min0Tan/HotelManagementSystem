package HotelManagementSystem;

import java.util.Scanner;

public class Guest {
	    protected GuestKind kind = GuestKind.Master;
	    protected String name;
	    protected int roomnum;
	    protected String phone;
	    protected int headcount;
	
	    public Guest() {
	    	
	    }
	    
	    public Guest(GuestKind kind) {
	    	this.kind = kind;
	    }
	
	    public Guest(String name, int roomnum) {
	    	this.name = name;
	    	this.roomnum = roomnum;
	    }
	    
	    public Guest(GuestKind kind, String name, int roomnum, String phone, int headcount) {
	    	this.kind = kind;
	    	this.name = name;
	    	this.roomnum = roomnum;
	    	this.phone = phone;
	    	this.headcount = headcount;
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
	    
	    public String getPhone() {
	    	return phone;
	    }
	    
	    public void setPhone(String phone) {
	    	this.phone = phone;
	    }
	    
	    public int getHeadcount() {
	    	return headcount;
	    }
	    
	    public void setHeadcount(int headcount) {
	    	this.headcount = headcount;
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
	    	System.out.println("Kind: "+skind+"Name: "+name+"Room Number: "+roomnum+"Phone number: "+phone+"Headcount: "+headcount);
	    }
	    
	    public void getGuestInput(Scanner input) {
	    	System.out.print("Room Number: ");
	    	int roomnum = input.nextInt();
	    	this.setRoomnum(roomnum);
	    	
	    	System.out.print("Guest Name: ");
	    	String name = input.next();
	    	this.setName(name);
	    	
	    	System.out.print("Guest's Phone number: ");
	    	String phone = input.next();
	    	this.setPhone(phone);
	    	
	    	System.out.print("Guest Headcount: ");
	    	int headcount = input.nextInt();
	    	this.setHeadcount(headcount);
	    }

}
