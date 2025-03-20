package com.AbstractClassExample;

public abstract class SampleAc implements Laptop {
	
	public void copy() {
		System.out.println(" Copy");
	}

	public void cut() {
		System.out.println(" Cut");
	}
	
	public abstract void past();
	
	public abstract void keyboard();
	

}
