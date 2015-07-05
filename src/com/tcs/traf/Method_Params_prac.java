package com.tcs.traf;

class shape{
	public void circle(double radius){
		System.out.println("Area of circle is:"+ " "+3.14 * radius);
	}
	public void square(double side){
		System.out.println("Area of circle is:"+ " "+ side * side);
	}
	public void reactangle(double length, double width){
		System.out.println("Area of circle is:"+ " "+ length * width);
	}
}

public class Method_Params_prac {
	public static void main(String[] args) {
		shape sh = new shape();
		sh.circle(2);
		sh.square(7);
		sh.reactangle(3.2, 5.8);
	}
}
