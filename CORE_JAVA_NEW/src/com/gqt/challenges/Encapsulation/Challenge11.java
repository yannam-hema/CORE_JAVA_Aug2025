package com.gqt.challenges.Encapsulation;

class Circle{
	private int radius;
	private double area;
	private double circumference;
	final static double pi= Math.PI;
	void calcArea() {
		System.out.println(pi*radius*radius);
	}
	void circumference() {
		System.out.println(2*pi*radius);
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
public class Challenge11 {
public static void main(String[] args) {
	Circle c= new Circle();
	c.setRadius(3);
	c.calcArea();
	c.circumference();
}
}
