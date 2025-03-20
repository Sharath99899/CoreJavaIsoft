package com.InterfaceExample;

public class Apple implements Laptop {

	@Override
	public void copy() {
		System.out.println("Apple Copy");
	}

	@Override
	public void cut() {
		System.out.println("Apple Cut");
	}

	@Override
	public void past() {
		System.out.println("Apple Past");
	}

	@Override
	public void keyboard() {
		System.out.println("Apple keyboard");
	}
}
