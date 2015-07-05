package com.tcs.traf.throwingexceptions;

import java.io.IOException;

public class TestClass {
	public static void main(String[] args) {
		
		ExceptionGenerator eg = new ExceptionGenerator();
		try {
			eg.run();
		} catch (CustomException e) {
			//getMessage() method will return message that was passed in the constructor of calling method from where the error is thrown
			System.out.println(e.getMessage());
		}
	}
}
