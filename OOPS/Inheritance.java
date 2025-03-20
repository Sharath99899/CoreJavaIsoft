package com.OOPS;

//Parent Class
class Animal 
{
	void eat() 
	{
		System.out.println("This animal eats food.");
	}
}

//Child Class (Inheriting from Animal)
class Dog extends Animal
{
	void bark() 
	{
		System.out.println("Dog barks");
	}
}

public class Inheritance 
{
	public static void main(String[] args)
	{
		Dog myDog = new Dog();
		myDog.eat(); // Inherited method
		myDog.bark(); // Child class method
	}
}
