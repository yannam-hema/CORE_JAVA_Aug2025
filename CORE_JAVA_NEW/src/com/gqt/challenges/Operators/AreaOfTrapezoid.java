package com.gqt.challenges.Operators;
class Trapezoid{
	void area(int a,int b, int h) {
		System.out.println((0.5*(a+b))*h);
	}
	void area(int a,int b, float h) {
		System.out.println((0.5*(a+b))*h);
	}
	void area(float a,float b, float h) {
		System.out.println((0.5*(a+b))*h);
	}

}
public class AreaOfTrapezoid {
public static void main(String[] args) {
	Trapezoid obj = new Trapezoid();
	obj.area(4, 5, 6);
	obj.area(2, 3, (float)5.6);
	obj.area((float)3.5,(float)4.6,(float)7.8);
}
}
