package com.StringPractice;

public class LStringPractice 
{
	String name="Sharath Reddy";
	String job="Java Full Stack Developer";

	public static void main(String[] args)
	{
		String name1="Karthick";
		String jobType="Java Developer";

		LStringPractice s = new LStringPractice();

		System.out.println("With Object call:");
		System.out.println(s.name);
		System.out.println(s.job);

		System.out.println("---------------------------------");

		System.out.println("WithOut Object call:");
		System.out.println(name1);
		System.out.println(jobType);	

	}
}

/*
 * What is String in Java?
 ->A String in Java is a sequence of characters enclosed in 
   double quotes, used to represent text.
 ->It is an object of the String class and is immutable.
 ->Java provides the String class in the java.lang package to represent strings.
 * 
-------------------------------------------------------------------------------------------
 * Characteristics of Strings in Java?
 ->Immutable: Once a string is created, it cannot be modified.
 ->Stored in String Pool: Strings are stored in a special memory 
   area called the String Pool for better performance.
 ->String Literal: Strings can be created directly using double quotes, e.g., "Hello".
 ->String Object: Strings can also be created using the new keyword.
 ------------------------------------------------------------------------------------------
 * String Methods in java?
->length(): Returns the number of characters in the string.
->toUpperCase(): Converts all characters to uppercase.
->toLowerCase(): Converts all characters to lowercase.
->substring(int beginIndex): Extracts part of the string from the given index.
->substring(int beginIndex, int endIndex): Extracts part of the string from beginIndex to endIndex (exclusive).
->replace(CharSequence old, CharSequence new): Replaces occurrences of a substring with another substring.
->replaceAll(String regex, String replacement): Replaces all occurrences matching a regex with a given string.
->contains(CharSequence sequence): Checks if the string contains a specified sequence.
->startsWith(String prefix): Checks if the string starts with a specified prefix.
->endsWith(String suffix): Checks if the string ends with a specified suffix.
->indexOf(String str): Finds the index of the first occurrence of a substring.
->lastIndexOf(String str): Finds the index of the last occurrence of a substring.
->equals(Object anotherString): Compares two strings for equality (case-sensitive).
->equalsIgnoreCase(String anotherString): Compares two strings for equality, ignoring case.
->compareTo(String anotherString): Compares two strings lexicographically.
->concat(String str): Appends the specified string to the end.
->trim(): Removes leading and trailing spaces.(Whitespace Handling).
->split(String regex): Splits the string into an array based on a regex.
->join(CharSequence delimiter, CharSequence... elements): Joins multiple strings with a specified delimiter.
->toCharArray(): Converts the string to a character array.
->isEmpty(): Checks if the string is empty.
->repeat(int count): Repeats the string multiple times.
->matches(String regex): Checks if the string matches a given regex.
->intern(): Returns the canonical representation of the string.
->
 * 
 */
