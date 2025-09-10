package com.gqt.challenges.Interface;
interface drawable2{
	void draw();
}
interface printable2{
	void print();
}
class canvas implements drawable2{
	@Override
	public void draw() {
   System.out.println("Drawn");
	}
}
class printer implements printable2{
	@Override
	public void print() {
   System.out.println("Printed");
	}
}
public class challenge29 {
public static void main(String[] args) {
canvas c = new canvas();
c.draw();
printer p = new printer();
p.print();
}
}
