package com.gqt.challenges.Abstraction;

abstract class Shape2{
	abstract void calculatePerimeter();
	abstract void calculateArea();
}
class square extends Shape2{
	int s;
	square(int s){
		this.s=s;
	}
	@Override
	void calculateArea() {
		double area=s*s;
		System.out.println(area);
	}
	@Override
	void calculatePerimeter() {
		double perimeter=4*s;
		System.out.println(perimeter);
	}
}

class Rectangle4 extends  Shape{
	int l;
	int b;
	Rectangle4(int l , int b){
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
public class Challenge23 {
public static void main(String[] args) {
	Rectangle4 r = new Rectangle4(9,5);
	r.calculateArea();
	r.calculatePerimeter();
	square s = new square(4);
	s.calculateArea();
	s.calculatePerimeter();
}
}
