package com.tcs.traf.abstractclass;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Starting Car");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting Car");
	}
	
}
