package com.FilePractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HandleTextFiles2 
{
	public static void main(String[] args) throws IOException 
	{
		//Scanner
		// how to Create File
	
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./sample.txt");

		// How to New Create a Text file in java
		if(!file.exists())
			file.createNewFile();

		//How to Delete a text file in java
		//file.delete();

		//Read text from a text file in java
		//TYPE-2 [Scanner].
		Scanner sc = new Scanner(file);
		             //or
		//Scanner sc = new Scanner(new FileInputStream(file));
		//String text ="";
		while(sc.hasNext())// we can also use hasNextLine method also
		{
			// text += sc.nextLine() + "\n";
			System.out.println(sc.nextLine());
		}
		//System.out.println(text);

		sc.close();		


	}
}
