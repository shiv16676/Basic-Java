package com.tcs.traf.advanced;

public class Strings_demo {
	public static void main(String[] args) {
		
		//Inefficient as Strings are Immutable and every time a new object is getting created here which can eat lot of memory in big program 
		String info = " ";
	    info += "My name is Shiv";
	    info += " ";
	    info += "I am a Software engineer";
	    System.out.println(info);
	    
	    //StringBuilder is more efficient than Strings
	    StringBuilder sb = new StringBuilder("");
	    sb.append("My name is Sue.");
	    sb.append("");
	    sb.append("i am a technician");
	    System.out.println(sb.toString());
	    
	    //or we can also chain this append method like below
	    StringBuilder s = new StringBuilder(" ");
	    s.append("My Name is Mike").append(" ").append("I am an Architect");
	    System.out.println(s.toString());
	    
	    //StringBuffer- we can use this since it is thread safe otherwise it's just same as StringBuilder
	    StringBuffer sbf = new StringBuffer();
	    sbf.append("My Name is Akshay").append(" ").append("I am a Actor");
	    System.out.println(sbf.toString());
	    
	}
}
