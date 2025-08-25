package com.gqt.challenges.OverLoading;
class circleArea{
	static final float pi=(float)Math.PI;
	double area(int r) {
		return pi*r*r;
	}
	double area(float r) {
		return pi*r*r;
	}
	double area(double r) {
		return pi*r*r;
	}
}
public class AreaOfCircle {
public static void main(String[] args) {
	circleArea cr = new circleArea();
System.out.println(cr.area(8.123456789));	
System.out.println(cr.area(8));	
System.out.println(cr.area((float)56.67));	
}
}
