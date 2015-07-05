package com.tcs.traf.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	public static void main(String[] args) {
		
		ExceptionGenerator eg = new ExceptionGenerator();
		try {
			eg.run();
			//multi-catch block - Java7
		} catch (IOException | ParseException e) {
			System.out.println(e.getMessage());
		}
		
		//We should never do below code , because FileNotFoundException was caught by the IOException so the catch block of FileNotFoundException
		//is not reachable because of polymorphism
		
		/*try {
			eg.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
