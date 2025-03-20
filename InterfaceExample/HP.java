package com.InterfaceExample;

public class HP implements Laptop {

	@Override
	public void copy() {
		System.out.println("HP Copy");
	}

	@Override
	public void cut() {
		System.out.println("HP Cut");
	}

	@Override
	public void past() {
		System.out.println("HP Past");
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyboard");
	}
	
	public void printer() {
		System.out.println("HP Printer ");
	}
	
}
