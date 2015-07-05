package com.tcs.traf.abstractclass;

public class Test {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(1);
		cam1.start();
		cam1.shutdown();
		cam1.run();
		
		Car car1 = new Car();
		car1.setId(2);
		car1.start();
		car1.shutdown();
		car1.run();
		
		
		//Machine mac1 = new Machine();   after creating it abstract class , we cannot instantiate it
	}
}
