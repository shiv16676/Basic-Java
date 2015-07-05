package com.tcs.traf.interface1;

public class Vehicle implements Nature{
	private int linceseNo;
	
	public int getLinceseNo() {
		return linceseNo;
	}

	public void setLinceseNo(int linceseNo) {
		this.linceseNo = linceseNo;
	}

	public void displayName(){
		System.out.println("linceseNo is" + " "  + linceseNo);
	}

	@Override
	public void natureType() {
		System.out.println("Vehicle nature depends on the type of care you are giving them");
		
	}

	@Override
	public void natureCauses() {
		System.out.println("If bad - Accident");
		
	}
}
