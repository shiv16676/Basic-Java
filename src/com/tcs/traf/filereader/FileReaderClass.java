package com.tcs.traf.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) {

		File file = new File("test.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found " + ":" + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read the File" + ":"
					+ file.toString());
		}

		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file:" + file.toString());
			} catch (NullPointerException ex) {
				// Reason could be that File never opened
			}
		}
	}
}
