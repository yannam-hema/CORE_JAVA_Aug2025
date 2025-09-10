package com.gqt.challenges.Interface;
interface Drawable1{
	void draw();
}
interface erasable{
	void erase();
}
class whiteBoard implements Drawable1 ,erasable{
	@Override
	public void draw() {
	System.out.println("drawn a picture on black board");	
	}
	@Override
	public void erase() {
		System.out.println("on black board:erased");
	}
}
class chalkBoard implements Drawable1 , erasable{
	@Override
	public void draw() {
	System.out.println("drawn a picture on chalk board");	
	}@Override
	public void erase() {
		System.out.println("on chalk board:erased");
	}
}
public class Challenge21 {
public static void main(String[] args) {
whiteBoard wb = new whiteBoard();
wb.draw();
wb.erase();
chalkBoard cb = new chalkBoard();
cb.draw();
cb.erase();

}
}
