package com.tcs.traf.polymorphism;

public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing");
	}
	
	public void leavesShedding(){
		System.out.println("Leaves are falling");
	}
}
