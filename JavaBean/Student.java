package com.JavaBean;


import java.io.Serializable;

public class Student implements Serializable { // Implements Serializable interface
    private static final long serialVersionUID = 1L; // Recommended for serialization
    
    private int id;
    private String name;
    private int marks;

    // No-args constructor (Required for Java Beans)
    public Student() {
    }

    // Parameterized constructor (Optional)
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters (Encapsulation)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // toString() Method (For easy object representation)
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
    }
}



/*
 * 1)What is a Java Bean class?
 * -> Java Bean class is an extended version of a POJO class.
 *-> It is also referred as a serializable POJO class.
 * 
 * 2)Rules for a class to be called as a Java Bean class
 * 
 *→It should implement serializable interface.
 *→It should have a no-args constructor.
 *→ All the properties (instance variables) should be private.
 *→It should have Getters & Setters (public) in order to access the properties.
 * 
 * 
 * 
 * 3)Serialization and Deserialization in Java?
 * 
 * ->Serialization: Converting a Java object into a byte stream to save it to a 
      file, database, or send it over a network.
 * 
 * ->Deserialization: Converting the byte stream back into a Java object.
 * 
 * 
 * 4)toString() Method in Java?
 * ->The toString() method converts an object into a String representation.
 * ->
 * ->By default, it returns: ClassName@HexadecimalHashCode.
 * 
 * 
 * 
 */
