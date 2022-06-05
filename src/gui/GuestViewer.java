package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Guest.GuestInput;
import HotelManagementSystem.GuestManager;

public class GuestViewer extends JPanel {
	
	WindowFrame frame;
	
	GuestManager guestManager;
	
	public GuestViewer(WindowFrame frame, GuestManager guestManager) {
		this.frame = frame;
		this.guestManager = guestManager;
		
		System.out.println("***" + guestManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Room Number");
		model.addColumn("Name");
		model.addColumn("Phone");
		model.addColumn("Headcount");
		
		for (int i = 0; i < guestManager.size(); i++) {
			Vector row = new Vector();
			GuestInput si = guestManager.get(i);
			row.add(si.getRoomnum());
			row.add(si.getName());
			row.add(si.getPhone());
			row.add(si.getHeadcount());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
	
}
