package com.tcs.traf.filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	public static void main(String[] args) {
		File file = new File("WriteTest.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			
			br.write("This is the line One");
			br.newLine();
			br.write("This is the line two");
			br.newLine();
			br.write("This is the last line");
			
		} catch (IOException ioe) {
			System.out.println("Unable to read the file:" + file.toString());
		}

	}
}
