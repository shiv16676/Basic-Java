package com.tcs.traf.enums;

//Enum's Available from JDK-1.5
public enum Days{
	SUNDAY("Sunday value"), MONDAY("Monday value"), TUESDAY("Tuesday value"), WEDNESDAY("Wednesday value"), 
	THURSDAY("Thursday value"), FRIDAY("Friday value"), SATURDAY("Saturday value");
	
	private String name;
	Days(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString(){
		return "Day of the week is" +" : " + name;
	}
}
