package com.OOPS;
/*
 * Abstraction is a process of hinding the implementation details and showing only functionality to the user.
 * In java before 8 we can achieve 100% abstraction in the interface.
 * In java after 8 we cannot achieve 100% abstraction due it complete depenent on the User.
 */
//Abstract class
abstract class Vehicle {
 abstract void start();  // Abstract method (must be implemented in subclasses)

 void stop() {  // Non-Abstract method (already implemented)
     System.out.println("Vehicle stopped.");
 }
}

//Subclass implementing abstract method
class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car is starting with key...");
 }
}

//Another subclass
class Bike extends Vehicle {
 @Override
 void start() {
     System.out.println("Bike is starting with self-start...");
 }
}

public class Abstraction {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     myCar.start();  
     myCar.stop();   

     Vehicle myBike = new Bike();
     myBike.start();  
     myBike.stop();  
 }
}
