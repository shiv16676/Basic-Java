package com.tcs.traf.Interface;

public class Machine implements Information{

	private int id =4;
	public void start(){
		System.out.println("Machine Started.");
	}
	
	@Override
	public void showInfo() {
		System.out.println("Machine ID is:" + id);
	}
}


//A class can extend only one class but can implements as many interfaces as u want.