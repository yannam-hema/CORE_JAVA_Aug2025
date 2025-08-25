package com.gqt.challenges.Inheritance;

class Shape{
	void area() {
	System.out.println("Area of the shape");	
	}
	void perimeter() {
	System.out.println("Perimeter of the shape");	
	}
}
class Circle extends Shape{
	final double pi= Math.PI;
	int r;
	Circle(int r){
		this.r=r;
	}
	void area() {
		System.out.println(pi*r*r);
	}
	void perimeter() {
		System.out.println(2*pi*r);
	}
}
class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(int l , int b){
		this.l=l;
		this.b=b;
	}
	void area() {
		System.out.println(l*b);
	}
	void perimeter() {
		System.out.println(2*(l+b));
	}
}
public class Challenge2 {
public static void main(String[] args) {
  Circle c = new Circle(4);
  c.area();
  c.perimeter();
  Rectangle r = new Rectangle(4,7);
  r.area();
  r.perimeter();
}
}
