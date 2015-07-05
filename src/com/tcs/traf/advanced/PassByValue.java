package com.tcs.traf.advanced;

public class PassByValue {
	public static void main(String[] args) {
		PassByValue pbv = new PassByValue();
		
		int value =7;
		System.out.println("1. Value is:" + value);
		pbv.show(value);
		
		System.out.println("4. Value is:" + value);
	}
	
	public void show(int value){
		System.out.println("2. Value is:" + value);
		
		value =8;
		
		System.out.println("3. Value is:" + value);
	}
}

//variable "value" is limited to the scope of the method where it is getting used.