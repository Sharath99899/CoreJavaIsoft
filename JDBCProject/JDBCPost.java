package com.JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class JDBCPost 
{
	public static void main(String[] args) {
	    String url = "jdbc:mysql://localhost:3306/JavaIsoft_DB";
	    String user = "root";
	    String password = "root";

	    try (Connection conn = DriverManager.getConnection(url, user, password);
	         Scanner scanner = new Scanner(System.in)) {

	        System.out.println("Connected to the database!");
	        
	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Age: ");
	        int age = scanner.nextInt();

	        String sql = "INSERT INTO DATATABLE (Name, Age) VALUES (?, ?)";
	        try (PreparedStatement ps = conn.prepareStatement(sql)) {
	            ps.setString(1, name);
	            ps.setInt(2, age);
	            ps.executeUpdate();
	            System.out.println("Record inserted.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
