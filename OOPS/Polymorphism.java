package com.OOPS;

class MathOperations 
{
	// Overloaded method with two parameters
	int add(int a, int b) 
	{
		return a + b;
	}

	// Overloaded method with three parameters
	int add(int a, int b, int c)
	{
		return a + b + c;
	}
}

public class Polymorphism 
{
	public static void main(String[] args)
	{
		MathOperations math = new MathOperations();
		System.out.println(math.add(5, 10));       // Calls first method
		System.out.println(math.add(5, 10, 15));   // Calls second method
	}
}
