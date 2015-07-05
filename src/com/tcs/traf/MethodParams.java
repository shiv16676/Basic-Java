package com.tcs.traf;

class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("Jumping"+" "+height);
	}
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " "+"in direction-->" + direction);
	}
}

public class MethodParams {
	public static void main(String[] args) {
		Robot rbt = new Robot();
		String str = "Shiv";
		rbt.speak(str);
		rbt.jump(20);
		rbt.move("East", 1.2);
	}
}
