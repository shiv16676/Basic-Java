package com.tcs.traf.abstractclass;

public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Starting Camera");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting Camera");
	}

}
