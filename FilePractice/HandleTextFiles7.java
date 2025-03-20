package com.FilePractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandleTextFiles7 
{
	public static void main(String[] args) throws IOException 
	{
		//BufferedWriter

		// how to Create File
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./BufferedWriter.txt");

		// How to New Create a Text file in java
		if(!file.exists())
		{
			file.createNewFile();
		}
		//How to Delete a text file in java
		//file.delete();
		String b="Sharath Chandra Reddy lkjhgfdfghjopojhgfghj";

		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		bw.write(b);
		System.out.println("Successfully inserted the data in to the file");
		bw.flush();
		bw.close();

	}
}
