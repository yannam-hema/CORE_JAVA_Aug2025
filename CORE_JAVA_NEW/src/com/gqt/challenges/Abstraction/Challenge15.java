package com.gqt.challenges.Abstraction;
abstract class Figure{
	abstract void draw();
	abstract void erase();
}
class Rectangle2 extends Figure{
	Rectangle2(){
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
class circle extends Figure{
	circle(){
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
public class Challenge15 {
public static void main(String[] args) {
	Rectangle2 r = new Rectangle2();
	r.draw();
	r.erase();
	circle c = new circle();
	c.draw();
	c.erase();
}
}
