package com.gqt.challenges.Abstraction;

abstract class Shape{
	abstract void calculatePerimeter();
	abstract void calculateArea();
}
class Circle extends Shape{
	final double pi= Math.PI;
	int radius;
	Circle(int radius){
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

class Rectangle extends  Shape{
	int l;
	int b;
	Rectangle(int l , int b){
		this.l=l;
		this.b=b;
	}
	@Override
	void calculateArea() {
		int area=1*b;
		System.out.println(area);
	}
	@Override
	void calculatePerimeter() {
		int perimeter=2*(l+b);
		System.out.println(perimeter);
	}
}
public class Challenge1 {
public static void main(String[] args) {
Circle c = new Circle(9);
Rectangle r = new Rectangle(2,3);
c.calculateArea();
c.calculatePerimeter();
r.calculateArea();
r.calculatePerimeter();
}
}
