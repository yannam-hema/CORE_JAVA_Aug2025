package com.gqt.challenges.Encapsulation;
class Rectangle{
	private int length;
	private int width;
	private long area;
	public Rectangle(int length , int width){
		this.length=length;
		this.width=width;
	}
	public void calcArea() {
		System.out.println("Area = " + 2*length*width);
	}
}
public class challenge25 {
public static void main(String[] args) {
	Rectangle r = new Rectangle(12,6);
	r.calcArea();
	Rectangle r1= new Rectangle(24,12);
	r1.calcArea();
}
}
