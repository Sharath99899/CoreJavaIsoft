package com.SwingPractice;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SwingLogInReister 
{
	    public static void main(String[] args) 
	    {
	        // Create frame
	        JFrame frame = new JFrame("LogIn Panel & Register Panel");
	        frame.setSize(600, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());

	        // Create tabs
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Login Panel
	        JPanel loginPanel = new JPanel();
	        loginPanel.setLayout(null);

	        JLabel loginTitle = new JLabel("Admin Log In", JLabel.CENTER);
	        loginTitle.setBounds(200, 20, 200, 30);
	        loginTitle.setFont(new Font("Arial", Font.BOLD, 20));

	        JLabel emailLabel = new JLabel("Email:");
	        emailLabel.setBounds(150, 80, 80, 25);
	        JTextField emailField = new JTextField();
	        emailField.setBounds(240, 80, 200, 25);

	        JLabel passwordLabel = new JLabel("Password:");
	        passwordLabel.setBounds(150, 120, 80, 25);
	        JPasswordField passwordField = new JPasswordField();
	        passwordField.setBounds(240, 120, 200, 25);

	        JCheckBox rememberMe = new JCheckBox("Remember me");
	        rememberMe.setBounds(240, 150, 120, 25);

	        JButton loginButton = new JButton("Log In");
	        loginButton.setBounds(240, 190, 100, 30);

	        JLabel forgotPassword = new JLabel("Forgot Password?");
	        forgotPassword.setBounds(360, 150, 120, 25);

	        // Add to login panel
	        loginPanel.add(loginTitle);
	        loginPanel.add(emailLabel);
	        loginPanel.add(emailField);
	        loginPanel.add(passwordLabel);
	        loginPanel.add(passwordField);
	        loginPanel.add(rememberMe);
	        loginPanel.add(loginButton);
	        loginPanel.add(forgotPassword);

	        // Register Panel
	        JPanel registerPanel = new JPanel();
	        registerPanel.setLayout(null);

	        JLabel registerTitle = new JLabel("Admin Register", JLabel.CENTER);
	        registerTitle.setBounds(200, 20, 200, 30);
	        registerTitle.setFont(new Font("Arial", Font.BOLD, 20));

	        JLabel nameLabel = new JLabel("Name:");
	        nameLabel.setBounds(150, 80, 80, 25);
	        JTextField nameField = new JTextField();
	        nameField.setBounds(240, 80, 200, 25);

	        JLabel regEmailLabel = new JLabel("Email:");
	        regEmailLabel.setBounds(150, 120, 80, 25);
	        JTextField regEmailField = new JTextField();
	        regEmailField.setBounds(240, 120, 200, 25);

	        JLabel regPasswordLabel = new JLabel("Password:");
	        regPasswordLabel.setBounds(150, 160, 80, 25);
	        JPasswordField regPasswordField = new JPasswordField();
	        regPasswordField.setBounds(240, 160, 200, 25);

	        JLabel genderLabel = new JLabel("Gender:");
	        genderLabel.setBounds(150, 240, 80, 25);

	        JRadioButton maleRadio = new JRadioButton("Male");
	        maleRadio.setBounds(240, 240, 80, 25);
	        JRadioButton femaleRadio = new JRadioButton("Female");
	        femaleRadio.setBounds(320, 240, 80, 25);

	        ButtonGroup genderGroup = new ButtonGroup();
	        genderGroup.add(maleRadio);
	        genderGroup.add(femaleRadio);

	        JButton registerButton = new JButton("Register");
	        registerButton.setBounds(240, 280, 100, 30);

	        // Add to register panel
	        registerPanel.add(registerTitle);
	        registerPanel.add(nameLabel);
	        registerPanel.add(nameField);
	        registerPanel.add(regEmailLabel);
	        registerPanel.add(regEmailField);
	        registerPanel.add(regPasswordLabel);
	        registerPanel.add(regPasswordField);
	        registerPanel.add(genderLabel);
	        registerPanel.add(maleRadio);
	        registerPanel.add(femaleRadio);
	        registerPanel.add(registerButton);

	        // Add panels to tabs
	        tabbedPane.addTab("Log In", loginPanel);
	        tabbedPane.addTab("Register", registerPanel);

	        // Add tabs to frame
	        frame.add(tabbedPane, BorderLayout.CENTER);	
	        
	        // Display frame
	        frame.setVisible(true);
	    }
	
}
