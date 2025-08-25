package com.gqt.challenges.OverLoading;

class SquareArea{
	void area(int s) {
		System.out.println("Area of Square (integer) ="+(s*s));
	}
	void area(float s) {
		System.out.println("Area of Square (float) ="+(s*s));
	}
	void area(double s) {
		System.out.println("Area of Square (double) ="+(s*s));
	}
}
public class AreaOfSquare {
public static void main(String[] args) {
	SquareArea obj = new SquareArea();
	obj.area(2);
	obj.area((float)4.5);
	obj.area(6.789234);
}
}
