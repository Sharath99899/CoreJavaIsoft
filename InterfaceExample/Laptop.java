package com.InterfaceExample;

/*An interface in Java is a blueprint for a class that defines a set of abstract methods which the implementing class must provide.
 * Interfaces are used for achieving abstraction and multiple inheritance in Java.
 * It contains only abstract methods before java 8 version
 * In java 8 version we have default and Static.
 * In java 9 version we have private keyword(Staic and Non Staic also use in pravite) also for the Interface Code Reusability. 
 */

public interface Laptop {

	// in java 7 version we have abstract methods
	public void copy();

	public void cut();

	public void past();

	public void keyboard();

	
	// In java 8 version we have default and Static
	//default we can use by implemetation by class only.
	//staic we can use directly.
	default  void security() {
		 audio();
		 commonCode();
		System.out.println("Please implement");
	}
	static  void audio() {
		 commonCode();
		System.out.println("audio code");
	}
	
	//In java 9 version we have private keyword also for the Interface Code Reusability. 
	//In Private we have Staic And Non Static methods we have.
	
	private static void commonCode() {
		System.out.println("commonCode code");
	}

}



