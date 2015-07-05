package com.tcs.traf.advanced;

class Machine {
	public void start(){
		System.out.println("Machine Started");
	}
}

class Camera extends Machine{
	@Override
	public void start() {
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("Photo taken.");
	}
}


public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting(casting is always done on variables) "Safe"
		Machine machine2 = camera1;
		machine2.start();
		//machine2.snap();   will not work as only those methods from camera are allowed those Machine object can handle
		
		
		//Downcasting:- It is "not safe" as we might get Runtime errors
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.snap();
		camera2.start();
		
		//Don't work - runtime Error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera) machine4;
		//camera3.snap();
		//camera3.start();
		
		
	}
}
