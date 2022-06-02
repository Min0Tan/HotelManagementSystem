package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GuestAdder extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GuestAdder() {
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelRoomNum = new JLabel("Room Number: ", JLabel.TRAILING);
		JTextField fieldRoomNum = new JTextField(10);
		labelRoomNum.setLabelFor(fieldRoomNum);
		panel.add(labelRoomNum);
		panel.add(fieldRoomNum);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone Number: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelHeadcount = new JLabel("Headcount: ", JLabel.TRAILING);
		JTextField fieldHeadcount = new JTextField(10);
		labelPhone.setLabelFor(fieldHeadcount);
		panel.add(labelHeadcount);
		panel.add(fieldHeadcount);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}