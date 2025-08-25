package com.gqt.challenges.Inheritance;

class Shape2{
	String type;
	String color;
}
class Rectangle3 extends Shape2{
	int l;
	int w;
	Rectangle3(int l , int w){
		this.l=l;
		this.w=w;
	}
    void display() {
    	System.out.println("Area = "+(l*w));
    }
}
public class Challenge23 {
public static void main(String[] args) {
	Rectangle3 r = new Rectangle3(6, 3);
	r.color="Yellow";
	r.type="2-D";
	System.out.println(r.color);
	System.out.println(r.type);
	r.display();
}
}
