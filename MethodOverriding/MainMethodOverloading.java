package com.MethodOverriding;

public class MainMethodOverloading {
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Dog();  
        myAnimal.makeSound();  

        Animal myanimal = new Cat(); 
        myanimal.makeSound();
	}

}
