package com.tcs.traf.Inheritance;

public class Test extends Object{
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		machine1.start();
		machine1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.frontGlassCleaner();
		car1.stop();
		car1.showInfo();
	}
}


//By default , all classes in java extends Object class or we can say that the Object class is the Super class of all java classes.