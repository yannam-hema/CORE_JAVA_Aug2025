package com.gqt.challenges.OverLoading;
class triangle{
	void area(int b, int h) {
		System.out.println((0.5*(b*h)));
	}
	void area(int b, float h) {
		System.out.println((0.5*(b*h)));
	}
	void area(float b, float h) {
		System.out.println((0.5*(b*h)));
	}
}
public class AreaOfTriangle {
public static void main(String[] args) {
triangle t = new triangle();
t.area((float)4.5, (float)8.45);
t.area(9, (float)14.567);
t.area(14, 34);
}
}