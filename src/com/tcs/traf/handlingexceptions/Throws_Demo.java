package com.tcs.traf.handlingexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Demo {
	
	//By Adding throws , when the exception is occured , then Program will get out of main method and next lines of Program will not execute.
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("Test.txt");
		
		FileReader fr = new FileReader(file);
		
		//This will not be executed
		System.out.println("This line is after the exception is occured");
	}
}

//But , if we try-catch instead of throws, then it will allow program to execute the next lines after catching the exception