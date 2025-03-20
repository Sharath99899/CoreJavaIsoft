package com.Constructors;
/*
 * Default Constructor (No parameters)
 * Parameterized Constructor (With parameters)
 * Copy Constructor (Copies values from another object)
 */
public class Student {
    int id;
    String name;

    // Default Constructor
    public Student() {
        System.out.println("Default Constructor Called!");
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized Constructor
    public Student(int id, String name) {
        System.out.println("Parameterized Constructor Called!");
        this.id = id;
        this.name = name;
    }

    // Display Method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
    	
        // Calling Default Constructor
        Student s1 = new Student();
        s1.display();

        // Calling Parameterized Constructor
        Student s2 = new Student(101, "Sharath");
        s2.display();
    }
}

