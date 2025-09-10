package com.gqt.challenges.Abstraction;

abstract class Figure1{
	abstract void draw();
	abstract void erase();
}
class Rectangle3 extends Figure1{
	Rectangle3(){
		System.out.println("Rectangle");
	}
	@Override
	void draw() {
		System.out.println("Rectangle is drawn");
	}
	@Override
	void erase() {
		System.out.println("Rectangle is erased");
	}
}
class circle1 extends Figure1{
	circle1(){
		System.out.println("Circle");
	}
	@Override
	void draw() {
		System.out.println("circle is drawn");
	}
	@Override
	void erase() {
		System.out.println("circle is erased");
	}
}

public class Challenge15_ {
	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3();
		r.draw();
		r.erase();
		circle1 c = new circle1();
		c.draw();
		c.erase();
}
}