package com.tcs.traf.advanced;

class Machines{
	public void start(){
		System.out.println("Starting Machine...");
	}
}

interface Plants{
	public void grow();
}

public class AnonymousClass {
	public static void main(String[] args) {
		
		//Anonymous class:-  It combines the class declaration and the creation of an instance of the class in one step. 
		//If you implement two anonymous classes in a class , then two classes other than AnonymousClass.class are created 
		// and their names will be like -  AnonymousClass$1.class,AnonymousClass$2.class
		Machines machine1 = new Machines(){
			@Override
			public void start(){
				System.out.println("Camera Snapping..");
			}
		};
		machine1.start();
		Plants plant1 = new Plants() {
			
			@Override
			public void grow() {
				System.out.println("Plants are growing...");
			}
		};
		plant1.grow();
	}
}

// you can take a look link:-   http://www.cs.rit.edu/~tmh/courses/allJava/Anonymous.html
