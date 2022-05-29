package HotelManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			GuestManager guestManager = getObject("guestmanager.ser");
			if (guestManager == null) {
				guestManager = new GuestManager(input);
			}
			
			selectMenu(input, guestManager);
			putObject(guestManager, "guestmanager.ser");
		}
		
		public static void selectMenu(Scanner input, GuestManager guestmanager) {
			int num = -1;
			
			while (num != 5) {
				try {
					showMenu();
					
					num = input.nextInt();
					
					switch (num) {
					
					case 1:
						guestmanager.addGuest();
						logger.log("add a guest");
						break;
						
					case 2:
						guestmanager.deleteGuest();
						logger.log("delete a guest");
						break;
						
					case 3:
						guestmanager.editGuest();
						logger.log("edit a guest");
						break;
						
					case 4:
						guestmanager.viewGuests();
						logger.log("edit a list of guest");
						break;
					default:
						continue;
					}
				
				}
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 to 5");
					if (input.hasNext()) {
						input.next();
					}
					num = -1;
				}
			}
			
		}
		
		public static void showMenu() {
			System.out.println("*** Hotel Management System Menu ***");
			System.out.println("1. Add guest");
			System.out.println("2. Delete Guest");
			System.out.println("3. Edit Guest");
			System.out.println("4. View Guest");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
		}
		
		public static GuestManager getObject(String filename) {
			GuestManager guestManager = null;

			try {
				FileInputStream file = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(file);
				
				guestManager = (GuestManager) in.readObject();
				
				in.close();
				file.close();
				
			} catch (FileNotFoundException e) {
				return guestManager;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return guestManager;
		}
		
		public static void putObject(GuestManager guestManager, String filename) {
			try {
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out =new ObjectOutputStream(file);
				
				out.writeObject(guestManager);
				
				out.close();
				file.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
