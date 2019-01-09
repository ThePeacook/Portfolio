package xanderpeacockportfolio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	JButton button;
	JButton button1;
	
	public static void main(String[] args) {
		
		new GUI();

	}

	public GUI() {
		
		JButton button = null;
		JButton button1 = null;
		// Title Name
		JFrame frame = new JFrame();
				
		// Object
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
				
		frame.setTitle("Free Fortnite Hacks no Virus");
		// Size
		frame.setSize(600, 300);
		// X, Y Axis
		frame.setLocation(200, 300);
		// Exits on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JLabel label = new JLabel("Get 1Mil VBucks now");
		frame.add(label);
				
		button = new JButton("Try it now!");
		button1 = new JButton("Yeet");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.add(button);
				
		// Make Visible
		frame.setVisible(true);		
	}
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();

		if (control == button) {
			JOptionPane.showMessageDialog(null, "You dun goofed");
		}
		if (control == button1) {
			JOptionPane.showMessageDialog(null, "You dun goofed it good");
		}
	}
	
}
