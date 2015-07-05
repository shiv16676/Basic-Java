package com.tcs.traf.Innerclasses;

public class Robot {
	private int id;

	public Robot(int id) {
		this.id = id;
	}
	public void start(){
		System.out.println("Starting Robot" + " : "+id);
	}
	public class Brain{
		public void think(){
			System.out.println("Robot " + id + " : "+"is thinking");
				start();
			}
		}
	}


//Nested classes are used to develop more readable and maintainable code ,
//because it logically group classes and interfaces in one place only.
