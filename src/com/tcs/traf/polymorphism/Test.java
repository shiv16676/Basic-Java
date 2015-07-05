package com.tcs.traf.polymorphism;

public class Test {
	public static void main(String[] args) {
		Plant plant1  = new Plant();
		Tree tree1 = new Tree();
		
		//This is called Polymorphism
		Plant plant2 = tree1;
		
		plant2.grow();
		
		doGrow(tree1);
		
		Plant tree2 = new Tree();
		((Tree)tree2).leavesShedding();  //Casting in action

	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}
}

//Polymorphism guarentees that wherever u are expected to use the parent class u can always use the child class.