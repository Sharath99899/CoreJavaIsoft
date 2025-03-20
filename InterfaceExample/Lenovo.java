package com.InterfaceExample;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenovo Copy");
	}

	@Override
	public void cut() {
		System.out.println("Lenovo Cut");
	}

	@Override
	public void past() {
		System.out.println("Lenovo Past");
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard");
	}

	public void camera() {
		System.out.println("Lenovo Camera ");
	}

	public void security(){
		System.out.println("laptop security code");
	}
}
