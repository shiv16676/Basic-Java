package com.tcs.traf.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFilesScanner {
	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "C:/Users/shiv/Desktop/setenv.txt";
		String fileName = "setenv.txt";
		
		//create a File Object and pass fineName to it.
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();
	}
}
