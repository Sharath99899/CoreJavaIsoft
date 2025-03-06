package com.StringPractice;

public class AllStringMethods 
{
	public static void main(String[] args) 
	{
		String str1 = "Sharath Reddy!";
		String str2 = "Balaiahgari Sharath Chandra Reddy!!";

		// Length of the string
		System.out.println("Length of str1: " + str1.length());
		System.out.println("Length of str2: " + str2.length());

		// Check if string is empty
		System.out.println("Is str1 empty? " + str1.isEmpty());
		System.out.println("Is str2 empty? " + str2.isEmpty());

		// Trim leading and trailing spaces (if any)
		System.out.println("Trimmed str1: '" + str1.trim() + "'");
		System.out.println("Trimmed str2: '" + str2.trim() + "'");

		// Convert to lowercase
		System.out.println("str1 in lowercase: " + str1.toLowerCase());
		System.out.println("str2 in lowercase: " + str2.toLowerCase());

		// Convert to uppercase
		System.out.println("str1 in uppercase: " + str1.toUpperCase());
		System.out.println("str2 in uppercase: " + str2.toUpperCase());

		// Check if one string contains another
		System.out.println("Does str2 contain str1? " + str2.contains(str1));

		// Equality checks
		System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
		System.out.println("Are str1 and str2 equal ignoring case? " + str1.equalsIgnoreCase(str2));

		// Find the index of a character or substring
		System.out.println("Index of 'R' in str1: " + str1.indexOf('R'));
		System.out.println("Index of 'Sharath' in str2: " + str2.indexOf("Sharath"));

		// Find the last index of a character or substring
		System.out.println("Last index of 'R' in str1: " + str1.lastIndexOf('R'));
		System.out.println("Last index of 'Reddy' in str2: " + str2.lastIndexOf("Reddy"));

		// Replace characters or substrings
		System.out.println("Replacing 'Sharath' with 'S.' in str2: " + str2.replace("Sharath", "S."));

		// Extract a substring
		System.out.println("Substring of str1 (from 0 to 7): " + str1.substring(0, 7));
		System.out.println("Substring of str2 (from 11): " + str2.substring(11));

		// Split the string
		System.out.println("Splitting str2 by spaces:");
		String[] parts = str2.split(" ");
		for (String part : parts) {
			System.out.println(part);
		}

		// Check if string starts or ends with specific characters
		System.out.println("Does str1 start with 'Sharath'? " + str1.startsWith("Sharath"));
		System.out.println("Does str2 end with '!!'? " + str2.endsWith("!!"));

		// Join strings
		System.out.println("Joining str1 and str2 with ' & ': " + String.join(" & ", str1, str2));

		// Convert to char array
		char[] charArray = str1.toCharArray();
		System.out.println("Char array of str1:");
		for (char c : charArray) {
			System.out.print(c +"");
		}
		System.out.println();

		// Get character at a specific index
		System.out.println("Character at index 5 in str1: " + str1.charAt(5));

		// Compare strings lexicographically
		System.out.println("Lexicographical comparison of str1 and str2: " + str1.compareTo(str2));

		// String concatenation
		System.out.println("Concatenation of str1 and str2: " + str1.concat(" ").concat(str2));

		// Interning a string
		String interned = str1.intern();
		System.out.println("Interned str1: " + interned);

		// Matches a regular expression
		System.out.println("Does str2 match '[A-Za-z,\\s!]+': " + str2.matches("[A-Za-z,\\s!]+"));

		// Repeat the string
		System.out.println("str1 repeated 2 times: " + str1.repeat(2));

		// Get bytes from the string
		byte[] byteArray = str1.getBytes();
		System.out.println("Byte array of str2:");
		for (byte b : byteArray) {
			System.out.print(b + " ");
		}
		
	}

}