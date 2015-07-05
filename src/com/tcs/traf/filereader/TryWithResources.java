package com.tcs.traf.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("test.txt");
		/*FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);*/  // these 2 line can be combined and written like below
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while( (line =br.readLine()) !=null){
				System.out.println(line);
			}
		}
		 catch (FileNotFoundException e) {
			System.out.println("Can't read the file:" + file.toString());
		} catch (IOException ioe) {
			System.out.println("Unable to read the file:" + file.toString());
		}
	}
}
