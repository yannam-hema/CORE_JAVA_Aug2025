package com.gqt.challenges.OverLoading;

class Rhombus{
	void area(int d1 , int d2) {
		System.out.println("Area of Rhombus (integers) ="+(0.5)*(d1*d2));
	}
	void area(float d1 , float d2) {
		System.out.println("Area of Rhombus (float) ="+(0.5)*(d1*d2));
	}
	void area(int d1 , float d2) {
		System.out.println("Area of Rhombus (integer , float) ="+(0.5)*(d1*d2));
	}
}
public class AreaOfRhombus {
public static void main(String[] args) {
Rhombus rb = new Rhombus();
rb.area(12,23);
rb.area((float)6, (float)9);
rb.area(5, (float)7.5);
}
}
