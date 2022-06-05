package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import HotelManagementSystem.GuestManager;

public class WindowFrame extends JFrame {

	GuestManager guestManager;
	MenuSelection menuselection;
	GuestAdder guestadder;
	GuestViewer guestviewer;

	public WindowFrame(GuestManager guestManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.guestManager = guestManager;
		menuselection = new MenuSelection(this);
		guestadder = new GuestAdder(this);
		guestviewer = new GuestViewer(this, this.guestManager);

		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public GuestAdder getGuestadder() {
		return guestadder;
	}

	public void setGuestadder(GuestAdder guestadder) {
		this.guestadder = guestadder;
	}

	public GuestViewer getGuestviewer() {
		return guestviewer;
	}

	public void setGuestviewer(GuestViewer guestviewer) {
		this.guestviewer = guestviewer;
	}

}
