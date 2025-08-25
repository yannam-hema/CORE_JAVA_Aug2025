package com.gqt.challenges.OverLoading;

class RectanglePerimeter{
	void perimeter(int l , int b) {
		System.out.println("Area of Rectangle (integers) ="+(2*(l+b)));
	}
	void perimeter(float l , float b) {
		System.out.println("Area of Rectangle (float) ="+(2*(l+b)));
	}
	void perimeter(int l , float b) {
		System.out.println("Area of Rectangle (integer , float) ="+(2*(l+b)));
	}
}
public class PerimeterOfRectangle {
	public static void main(String[] args) {
RectanglePerimeter obj = new RectanglePerimeter();
obj.perimeter(25,6);
obj.perimeter((float)7.8, (float)10.76);
obj.perimeter(33,(float)8.654);
	}
}
