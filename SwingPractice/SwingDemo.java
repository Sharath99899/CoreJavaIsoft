package com.SwingPractice;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo 
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("User Form");
		f.setSize(800, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		JLabel l1 = new JLabel("User Name:");
		JTextField t1 = new JTextField(20);
		JLabel l2 = new JLabel("Password:");
		JTextField t2 = new JTextField(20);
		JButton b = new JButton("Submit");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b);
		// Center the frame on the screen
		f.setLocationRelativeTo(null);
		// Set the JFrame visible
		f.setVisible(true);
	}
}





