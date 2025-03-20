package com.FilePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandleTextFiles4 
{
	public static void main(String[] args) throws IOException 
	{
		//BufferedReader
		// how to Create File
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./sample.txt");

		// How to New Create a Text file in java
		if(!file.exists())
			file.createNewFile();

		//How to Delete a text file in java
		//file.delete();

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine())!= null)
		{
			System.out.println(line);
		}
		br.close();
	    fr.close();
	}
}
