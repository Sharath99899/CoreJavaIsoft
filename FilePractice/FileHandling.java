package com.FilePractice;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling 
{
	public static void main(String[] args) throws IOException  
	{
		//File f = new File("./resume.txt");
		//File f1 = new File("S:\\javaIsoft\\resume.txt");

		//		System.out.println(f.createNewFile());
		//		System.out.println(f.delete());
		//		System.out.println(f.exists());

		//		if(f.exists()) 
		//			f.delete();
		//		System.out.println(f.createNewFile());
		//
		//		System.out.println(f.isHidden());
		//		System.out.println(f.canWrite());
		//		System.out.println(f.setWritable(true));
		//		System.out.println(f.canWrite());

		System.out.println("------------------------------------------------------------");
		
        //How to create the folder
		File f = new File("./Shaarath/chandra/Reddy");
		System.out.println(f.mkdirs());
//		System.out.println(f.mkdir());
//		if(f.exists()) 
//			f.delete();
//		System.out.println(f.exists());
//		

		System.out.println("------------------------------------------------------------");
		// Any Folder we can access the folder path
		//		File f = new File("C:\\Users\\shara\\Documents\\GitHub\\CoreJava");
		//		System.out.println(Arrays.toString(f.list()));
		//		System.out.println(Arrays.toString(f.listFiles()));


	}
}


/* 
 * File this way we can create
 * file is an instance.
 -> f.createNewFile()-> it will create the file ,and it will return boolean only.
 -> f.delete()-> it will delete the file ,it will return boolean only.
 -> f.exists()-> file is there or not in the folder ,it will return boolean only.
 -> f.isHidden()-> if hided (true) or if not hided (false).
 -> f.canWrite()-> if we Read only can we write (false), if we not  Read only can we write(true)
 ->f.setWritable(true)->if true we can write,if false we can't write on file.

 * how to create the folders
 ->File f = new File("./Shaarath/chandra");
 ->f.mkdirs()- it will create the floder.it will written boolean {folders} multiple folders.
 f.mkdir()- folder single .
 * 
 * 
 *  
 * Absolute path (Full Path)
 * 
 * Relative path

 * Separators (/(back slash single) \(\\ double slash provide))
 * 
 */

