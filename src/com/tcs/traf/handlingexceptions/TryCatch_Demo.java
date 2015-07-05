package com.tcs.traf.handlingexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch_Demo {
	public static void main(String[] args) {
		
		File file = new File("Test.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found" + " : "+file.toString());
		}
		
		//This will be executed since program continues after catching the exception
		System.out.println("This line is after the exception is caught");
	}
}
