package com.AbstractClassExample;

public class User {
	public static void main(String[] args) {

		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.past();
		lenovo.keyboard();

		System.out.println("---------------------------------------------");

		HP hp = new HP();
		hp.copy();
		hp.cut();
		hp.past();
		hp.keyboard();

	}
}
