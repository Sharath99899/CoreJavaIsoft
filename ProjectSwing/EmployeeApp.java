package com.ProjectSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmployeeApp 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Employee Details Entry Data");
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setLocationRelativeTo(null);

		JPanel formPanel = new JPanel(new GridLayout(10, 2, 10, 10));
		formPanel.setBorder(BorderFactory.createTitledBorder("Employee Details"));
		formPanel.setBackground(new Color(245, 245, 245));

		JTextField txtEmployeeID = new JTextField();
		JTextField txtEmployeeName = new JTextField();
		JTextField txtAge = new JTextField();
		JTextField txtGender = new JTextField();
		JTextField txtEmailID = new JTextField();
		JTextField txtMobileNumber = new JTextField();
		JTextField txtDeveloperType = new JTextField();
		JTextField txtState = new JTextField();
		JTextField txtCountry = new JTextField();
		JCheckBox chkActiveStatus = new JCheckBox("Active");

		formPanel.add(new JLabel("Employee ID:"));
		formPanel.add(txtEmployeeID);
		formPanel.add(new JLabel("Employee Name:"));
		formPanel.add(txtEmployeeName);
		formPanel.add(new JLabel("Age:"));
		formPanel.add(txtAge);
		formPanel.add(new JLabel("Gender:"));
		formPanel.add(txtGender);
		formPanel.add(new JLabel("Email ID:"));
		formPanel.add(txtEmailID);
		formPanel.add(new JLabel("Mobile Number:"));
		formPanel.add(txtMobileNumber);
		formPanel.add(new JLabel("Developer Type:"));
		formPanel.add(txtDeveloperType);
		formPanel.add(new JLabel("State:"));
		formPanel.add(txtState);
		formPanel.add(new JLabel("Country:"));
		formPanel.add(txtCountry);
		formPanel.add(new JLabel("Active Status:"));
		formPanel.add(chkActiveStatus);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
		buttonPanel.setBackground(new Color(245, 245, 245));

		JButton btnSubmit = new JButton("Submit");
		JButton btnReset = new JButton("Reset");
		JButton btnGetById = new JButton("Get By ID");

		buttonPanel.add(btnSubmit);
		buttonPanel.add(btnReset);
		buttonPanel.add(btnGetById);

		frame.add(formPanel, BorderLayout.CENTER);
		frame.add(buttonPanel, BorderLayout.SOUTH);

		frame.setVisible(true);

		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				try 
				{
					String EmpID = txtEmployeeID.getText();
					String EmpName = txtEmployeeName.getText();
					String EmpAge = txtAge.getText();
					String EmpGender = txtGender.getText();
					String EmpEmailID = txtEmailID.getText();
					String EmpMobileNumber = txtMobileNumber.getText();
					String EmpDeveloperType = txtDeveloperType.getText();
					String EmpState = txtState.getText();
					String EmpCountry = txtCountry.getText();
					boolean EmpActiveStatus = chkActiveStatus.isSelected();

					if (EmpID.isEmpty() || EmpName.isEmpty() || EmpAge.isEmpty() || EmpGender.isEmpty()
							|| EmpEmailID.isEmpty() || EmpMobileNumber.isEmpty() || EmpDeveloperType.isEmpty()
							|| EmpState.isEmpty() || EmpCountry.isEmpty()) 
					{
						JOptionPane.showMessageDialog(frame, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					int age = Integer.parseInt(EmpAge);
					if (age <= 0) 
					{
						JOptionPane.showMessageDialog(frame, "Age must be a positive number!", "Validation Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (!EmpEmailID.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) 
					{
						JOptionPane.showMessageDialog(frame, "Invalid email format!", "Validation Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (!EmpMobileNumber.matches("\\d{10}")) 
					{
						JOptionPane.showMessageDialog(frame, "Mobile number must be 10 digits!", "Validation Error", JOptionPane.ERROR_MESSAGE);
						return;
					}

					Employee ep = new Employee();
					ep.setEmployeeID(EmpID);
					ep.setEmployeeName(EmpName);
					ep.setAge(age);
					ep.setGender(EmpGender);
					ep.setEmailID(EmpEmailID);
					ep.setMobileNumber(EmpMobileNumber);
					ep.setDeveloperType(EmpDeveloperType);
					ep.setState(EmpState);
					ep.setCountry(EmpCountry);
					ep.setActiveStatus(EmpActiveStatus);

					try (FileWriter writer = new FileWriter("C:\\Users\\Administrator\\Desktop\\Isoft java\\EMPDATA.txt")) 
					{
						writer.write(ep.toString());
					}

					JOptionPane.showMessageDialog(frame, "Employee details saved successfully!");
				} 
				catch (NumberFormatException ex) 
				{
					JOptionPane.showMessageDialog(frame, "Invalid age. Please enter a valid number.");
				} 
				catch (IOException ex) 
				{
					JOptionPane.showMessageDialog(frame, "Error saving employee details. Please try again.");
				}
			}
		});

		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)  
			{
				txtEmployeeID.setText("");
				txtEmployeeName.setText("");
				txtAge.setText("");
				txtGender.setText("");
				txtEmailID.setText("");
				txtMobileNumber.setText("");
				txtDeveloperType.setText("");
				txtState.setText("");
				txtCountry.setText("");
				chkActiveStatus.setSelected(false);
			}
		});

		btnGetById.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)  
			{
				JFrame getByIdFrame = new JFrame("Retrieve Employee Details");
				getByIdFrame.setSize(400, 200);
				getByIdFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				getByIdFrame.setLayout(new GridLayout(3, 1, 10, 10));
				getByIdFrame.setLocationRelativeTo(null);

				JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
				JTextField txtSearchID = new JTextField(15);
				JButton btnSearch = new JButton("Search");

				inputPanel.add(new JLabel("Enter Employee ID:"));
				inputPanel.add(txtSearchID);
				inputPanel.add(btnSearch);

				getByIdFrame.add(inputPanel);

				btnSearch.addActionListener(new ActionListener() 
				{
					@Override
					public void actionPerformed(ActionEvent event) 
					{
						String searchID = txtSearchID.getText();
						boolean found = false;
						StringBuilder employeeDetails = new StringBuilder();

						try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Isoft java\\EMPDATA.txt"))) 
						{
							String line;
							while ((line = reader.readLine()) != null) 
							{
								if (line.startsWith("Employee ID: ") && line.contains(searchID)) 
								{
									found = true;
									employeeDetails.append(line).append("\n");

									while ((line = reader.readLine()) != null && !line.trim().isEmpty()) 
									{
										employeeDetails.append(line).append("\n");
									}
									break;
								}
							}
							if (found) 
							{
								JOptionPane.showMessageDialog(getByIdFrame, employeeDetails.toString(), "Employee Details", JOptionPane.INFORMATION_MESSAGE);
							} 
							else 
							{
								JOptionPane.showMessageDialog(getByIdFrame, "Employee not found!", "Error", JOptionPane.ERROR_MESSAGE);
							}
						} 
						catch (IOException ex) 
						{
							JOptionPane.showMessageDialog(getByIdFrame, "Error reading employee data!", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				getByIdFrame.setVisible(true);
			}
		});
	}
}
