package com.OOPS;

class BankAccount 
{
	private double balance; 

	// Constructor
	public BankAccount(double balance) 
	{
		this.balance = balance;
	}

	// Getter Method
	public double getBalance()
	{
		return balance;
	}

	// Setter Method
	public void deposit(double amount) 
	{
		if (amount > 0) 
		{
			balance += amount;
			System.out.println("Deposited: " + amount);
		} 
		else 
		{
			System.out.println("Invalid deposit amount!");
		}
	}
}

public class Encapsulation1 
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount(1000);
		account.deposit(500);
		System.out.println("Current Balance: " + account.getBalance());
	}
}

