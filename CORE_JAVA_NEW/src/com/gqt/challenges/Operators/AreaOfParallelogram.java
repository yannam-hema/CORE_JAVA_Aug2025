package com.gqt.challenges.Operators;

class Area{
	void area(int b, int h) {
		System.out.println(b*h);
	}
	void area(int b, float h) {
		System.out.println(b*h);
	}
	void area(float b, float h) {
		System.out.println(b*h);
	}
}
public class AreaOfParallelogram {
public static void main(String[] args) {
	Area a = new Area();
	a.area(3, 6);
	a.area((float)3.67, (float)8.78);
}
}
