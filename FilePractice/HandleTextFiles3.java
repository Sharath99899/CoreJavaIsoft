package com.FilePractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandleTextFiles3 
{

	public static void main(String[] args) throws IOException 
	{
		//FileReader
		// how to Create File
	
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./sample.txt");

		// How to New Create a Text file in java
		if(!file.exists())
			file.createNewFile();

		//How to Delete a text file in java
		//file.delete();
		
		FileReader fr = new FileReader(file); 
		
		int asciiCode;
		//String text="";
		while((asciiCode=fr.read()) != -1)
		{
			//text+=String.valueOf((char)asciiCode);
			System.out.print((char)asciiCode);
		}
		//System.out.print(text);
		
		fr.close();

	}

}
