package com.CollectionTaskPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListWithGetSet1 
{
	public static void main(String[] args) 
	{
		List<EmployeeDetails> Totalemployees = new ArrayList<>();
		List<EmployeeDetails> minors = new ArrayList<>(); 
		List<EmployeeDetails> adults = new ArrayList<>(); 

		Scanner scanner = new Scanner(System.in);   
		System.out.print("Enter the number of employees you need to Enter: ");
		int numberOfEmployees = scanner.nextInt();
		scanner.nextLine();


		for (int i = 0; i < numberOfEmployees; i++) 
		{
			System.out.println("\nEnter The details for Employee " + (i + 1) + ":");

			EmployeeDetails ED = new EmployeeDetails(); //object

			System.out.print("Enter Employee ID: ");
			ED.setEmpId(scanner.nextInt());
			scanner.nextLine(); 

			System.out.print("Enter Employee Name: ");
			ED.setEmpName(scanner.nextLine());

			System.out.print("Enter Employee Age: ");
			ED.setAge(scanner.nextInt());
			scanner.nextLine(); 


			if (ED.getAge() > 18) 
			{
				adults.add(ED);
			} 
			else 
			{
				minors.add(ED);
			}

			Totalemployees.add(ED); 
		}


		System.out.println("\nYou Have Entered The Number of Employees is : " + numberOfEmployees + "\n");

		if (adults.isEmpty())
		{
			System.out.println("\nThere is No Adults Employees In this List");
		} 
		else 
		{

			System.out.println("\nEmployees GreaterThan 18 years old:");
			for (EmployeeDetails emp : adults ) 
			{
				System.out.println(emp);


			}
		}


		if (minors.isEmpty()) 
		{
			System.out.println("\nThere is No Minors Employees In this List.");
		} 
		else
		{
			System.out.println("\nEmployees LessThan 18 years old:");
			for (EmployeeDetails emp : minors) 
			{
				System.out.println(emp);
			}
		}


		System.out.println("\nYou Have Entered The Number of Employees is : " + numberOfEmployees + "\n");
		for (EmployeeDetails emp : Totalemployees) 
		{
			System.out.println(emp);
		}

		scanner.close();
	}
}
