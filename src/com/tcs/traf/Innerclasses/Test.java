package com.tcs.traf.Innerclasses;


public class Test {
	public static void main(String[] args) {
		
		Robot robot = new Robot(2);
		robot.start();
		
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
		
	}
}
