package com.FilePractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HandleTextFiles5 
{
	public static void main(String[] args) throws IOException 
	{
		//FlieOutputStream
		
		// how to Create File 
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./TestJava.txt");

		// How to New Create a Text file in java
		if(!file.exists())
			file.createNewFile();

		//How to Delete a text file in java
		//file.delete();
		
		FileOutputStream fos = new FileOutputStream(file);
		//one way
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
		
		//second way
		String s= "Hello Sharath";
		for(char ch:s.toCharArray())
		{
			fos.write((int)ch);
		}
		System.out.println("Sucessfully  inserted the data on the File");
		
		fos.flush();
		fos.close();
	}
}
