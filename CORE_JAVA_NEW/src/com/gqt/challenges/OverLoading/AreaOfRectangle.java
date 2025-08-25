package com.gqt.challenges.OverLoading;

class RectangleArea{
	void area(int l , int b) {
		System.out.println("Area of Rectangle (integers) ="+(l*b));
	}
	void area(float l , float b) {
		System.out.println("Area of Rectangle (float) ="+(l*b));
	}
	void area(int l , float b) {
		System.out.println("Area of Rectangle (integer , float) ="+(l*b));
	}
}
public class AreaOfRectangle {
public static void main(String[] args) {
RectangleArea r = new RectangleArea();
r.area(25,6);
r.area((float)7.8, (float)10.76);
r.area(33,(float)8.654);
}
}
