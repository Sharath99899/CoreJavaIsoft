package com.InterfaceExample;

public class User {
	
	
	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.past();
		lenovo.keyboard();
		lenovo.camera();
		lenovo.security();
		Laptop.audio();  // Static method we can call  by with class.method name [Laptop.audio();]
		
		System.out.println("-----------------------------------");
		HP hp = new HP();
		hp.copy();
		hp.cut();
		hp.past();
		hp.keyboard();
		hp.printer();
		
		System.out.println("-----------------------------------");
		Apple apple = new Apple();
		apple.copy();
		apple.cut();
		apple.past();
		apple.keyboard();
		
		
		// untill java 7 version.
		
	}

}
