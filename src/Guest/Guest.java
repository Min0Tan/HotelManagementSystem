package Guest;

import java.io.Serializable;
import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class Guest implements GuestInput, Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 3271095467179597493L;
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
	    
	    public void setPhone(String phone) throws PhoneFormatException {
	    	if (!phone.contains("010") || phone.equals("")) {
	    		throw new PhoneFormatException();
	    	}
	    	
	    	this.phone = phone;
	    }
	    
	    public int getHeadcount() {
	    	return headcount;
	    }
	    
	    public void setHeadcount(int headcount) {
	    	this.headcount = headcount;
	    }
	    
	    
	    public abstract void printInfo();
	    
		public void setGuestRoomnum(Scanner input) {
			System.out.println("Guest's Room Number: ");
		    int roomnum = input.nextInt();
		    this.setRoomnum(roomnum);
			
		}
		
		public void setGuestName(Scanner input) {
			System.out.println("Guest Name: ");
		    String name = input.next();
		    this.setName(name);
			
		}
		
		public void setPhone(Scanner input) {
			String phone = "";
			while (phone.contains("010")) {
				System.out.println("Guest's Phone Number: ");
				phone = input.next();
				try {
					this.setPhone(phone);
					} catch (PhoneFormatException e) {
						System.out.println("Incorrect Phone Format, put the phone number that contains 010");
						}
				}
		}
		
		public void setGuestHeadcount(Scanner input) {
			System.out.println("Headcount: ");
	        int headcount = input.nextInt();
	        this.setHeadcount(headcount);
			
		}
		
		public String getKindString() {
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
			return skind;
			
		}

}
