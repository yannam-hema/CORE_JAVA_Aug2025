package com.gqt.challenges.Interface;
interface Printable{
	void print();
}
interface Scannable{
	void scan();
}
class Printer implements Printable{
	@Override
	public void print() {
    System.out.println("printed");
	}
}
class Scanner implements Scannable{
	@Override
	public void scan() {
    System.out.println("scaned");
	}
}
public class Challenge9 {
public static void main(String[] args) {
	Printer p = new Printer();
	p.print();
	Scanner s = new Scanner();
	s.scan();
}
}
