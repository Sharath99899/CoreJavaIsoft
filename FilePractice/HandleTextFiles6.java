package com.FilePractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandleTextFiles6 
{
	public static void main(String[] args) throws IOException 
	{  
		//FileWriter
		
		// how to Create File
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./FileWriter.txt");

		// How to New Create a Text file in java
		if(!file.exists())
			file.createNewFile();

		//How to Delete a text file in java
		//file.delete();
		String s = "MINI COPPER";
		FileWriter fw = new FileWriter(file);
		//fw.write(s);     // one way
		fw.write(s.toCharArray());  // second way
		System.out.println("Successfully inserted the data in to the file");
		fw.flush();
		fw.close();	
	}
}
