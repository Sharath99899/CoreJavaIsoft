package com.JavaBean;

import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "Sharath", 70);
        
        // File where the object will be saved
        String filename = "student.ser";

        // Serialization (Saving object to file)
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
             
            out.writeObject(student);
            System.out.println("Serialization Successful! Object saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization (Reading object from file)
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
             
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Deserialization Successful! Object Data:");
            System.out.println(deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
