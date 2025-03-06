package com.Practice;

public class EMPConstructor 
{
	private String empName;
	private int age;

	public EMPConstructor(String empName, int age)
	{
		this.empName=empName;
		this.age=age;
	}
	public static void main(String[] args) 
	{
		EMPConstructor c = new EMPConstructor("Billa", 35);
		
		System.out.println("Employee Name is: " + c.empName);
		System.out.println("Employee Age is: " + c.age);
	}

}
