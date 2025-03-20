package com.FilePractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HandleTextFiles1 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Isoft java./sample.txt");

		if(!file.exists())
			file.createNewFile();
		
		//file.delete();

		
		//TYPE-1 [FileInputStream].
		FileInputStream f = new   FileInputStream(file);
		int asciiCode = 0;
		//String text="";
		while((asciiCode=f.read()) != -1) //end of the file will return -1
		{
			//text +=String.valueOf((char)asciiCode);
			System.out.print((char)asciiCode);
		}
		//System.out.println(text);
		f.close();
	}
}

/*
 * 
 *What is a Text File?
 ->A Test file is a file used to store text content, and it is referred to as a test file.

 *Create a Text file in java?
 ->	File file = new File("C:\\Users\\shara\\OneDrive\\Desktop\\Isoft java./sample.txt");
 ->file.createNewFile();

 *Delete a text file in java?
 ->file.delete();

 *Read text from a text file in java?
 ->FileInputStream  [read() method will read each character in ascii value only.]
 ->Scanner
 ->FileReader
 ->BufferedReader

 *->FileInputStream->FileReader - this two will read in character by character only.
 *->Scanner->BufferedReader - this two will read line by line only.
 *
 *Writing the data into text files in java?
 ->FlieOutputStream
 ->FileWriter
 ->BufferedWriter
 
 
 *perform the read and write operations in multiple ways?
 *
 *
 *
 *
 *
 */