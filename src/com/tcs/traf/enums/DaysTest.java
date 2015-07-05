package com.tcs.traf.enums;

public class DaysTest {
	public static void main(String[] args) {
		Days days = Days.SATURDAY;
		
		//Using Switch
		switch(days){
		case FRIDAY:
			System.out.println("Friday");
			break;
		case MONDAY:
			System.out.println("Monday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		case SUNDAY:
			System.out.println("Sunday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		default:
			break;
		
		}
		System.out.println(Days.THURSDAY.toString());
		System.out.println("Enum name as a String" + ": "+Days.THURSDAY.name());
		
		//Using For loop
		for (Days d : Days.values()){
			System.out.println("For Loop " + "--> "+d);
		}
	}

}
