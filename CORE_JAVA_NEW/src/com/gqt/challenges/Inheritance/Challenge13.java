package com.gqt.challenges.Inheritance;
class Shape1{
	String type;
	String color;
}
class Triangle{
	int b;
	int h;
	Triangle(int b , int h){
		this.b=b;
		this.h=h;
	}
	void display() {
	System.out.println("Area "+((0.5)*b*h));
	}
}
public class Challenge13 {
public static void main(String[] args) {
	Triangle t = new Triangle(4,5);
	t.display();
}
}
