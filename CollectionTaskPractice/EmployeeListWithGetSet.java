package com.CollectionTaskPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListWithGetSet 
{
	public static void main(String[] args) 
	{
		
		
		List<EmployeeDetails> employees = new ArrayList<EmployeeDetails>();

		// Ask for the number of employees
		Scanner scanner = new Scanner(System.in);   
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = scanner.nextInt();
		scanner.nextLine(); // the newline character enter

		// Loop to get employee details
		for (int i = 0; i < numberOfEmployees; i++) 
		{
			System.out.println("\nEnter details for Employee " + (i + 1) + ":");
			EmployeeDetails EM = new EmployeeDetails();

			System.out.print("Enter Employee ID: ");
			EM.setEmpId(scanner.nextInt());
			scanner.nextLine(); 

			System.out.print("Enter Employee Name: ");
			EM.setEmpName(scanner.nextLine());

			System.out.print("Enter Employee Age: ");
			EM.setAge(scanner.nextInt());
			scanner.nextLine(); 

			employees.add(EM);
		}

		// Display all employees
		System.out.println("\nYou Entered " + numberOfEmployees + " Employee Details:\n");
		
		for (EmployeeDetails emp : employees) 
		{
			System.out.println(emp);
		}

		scanner.close();
	}
}
