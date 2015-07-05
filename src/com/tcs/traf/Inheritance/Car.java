package com.tcs.traf.Inheritance;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Car started");
	}
	
	@Override
	public void stop(){
		System.out.println("Car Stopped");
	}
	public void frontGlassCleaner(){
		System.out.println("Glasses are cleaned..!!");
	}
	public void showInfo(){
		System.out.println("Car name:" + name);
	}
}





// Please keep in mind that the @Override annotation is useful to check if the method actually exists in the parent class or not.
// So, if u will not mention this annotation then it would create a separate method in child class which may not be in the parent class.