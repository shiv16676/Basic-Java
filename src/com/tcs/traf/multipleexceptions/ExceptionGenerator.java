package com.tcs.traf.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionGenerator {
	
	public void run() throws IOException, ParseException{
		
		//throw new IOException();
		
		throw new ParseException("Error in command list", 2);
	}
	
	//Define a exception and it's child class exception
	public void input() throws IOException , FileNotFoundException{
		System.out.println("****");
	}
}
