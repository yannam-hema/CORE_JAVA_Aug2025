package com.gqt.challenges.Abstraction;

abstract class Shape1{
	abstract void calculatePerimeter();
	abstract void calculateArea();
}
class Circle1 extends Shape1{
	final double pi= Math.PI;
	int radius;
	Circle1(int radius){
		this.radius=radius;
	}
	@Override
	void calculateArea() {
		double area=pi*radius*radius;
		System.out.println(area);
	}
	@Override
	void calculatePerimeter() {
		double perimeter=2*pi*radius;
		System.out.println(perimeter);
	}
}

class Triangle extends  Shape{
	int b;
	int h;
	int s;
	Triangle(int b , int h , int s){
		this.b=b;
		this.h=h;
		this.s=s;
	}
	@Override
	void calculateArea() {
		int area=(b*h)/2;
		System.out.println(area);
	}
	@Override
	void calculatePerimeter() {
		int perimeter=s+b+h;
		System.out.println(perimeter);
	}
}
public class Challenge11 {
public static void main(String[] args) {
Circle1 c = new Circle1(9);
Triangle t = new Triangle(2,3,5);
c.calculateArea();
c.calculatePerimeter();
t.calculateArea();
t.calculatePerimeter();
}
}
