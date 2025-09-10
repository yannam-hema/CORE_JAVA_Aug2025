package com.gqt.challenges.Interface;
interface Drawable{
	void draw();
}
interface Resizable{
	void resize();
}
class Shape implements Drawable,Resizable{
	@Override
	public void draw() {
	System.out.println("draw a 2D shape");	
	}
	@Override
	public void resize() {
	System.out.println("resize the shape");	
	}
}
public class Challenge1 {
public static void main(String[] args) {
	Shape s = new Shape();
	s.draw();
	s.resize();
}
}
