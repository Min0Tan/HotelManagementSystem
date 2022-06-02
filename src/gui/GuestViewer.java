package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GuestViewer extends JFrame {
	
	public GuestViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Room Number");
		model.addColumn("Name");
		model.addColumn("Phone");
		model.addColumn("Headcount");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}