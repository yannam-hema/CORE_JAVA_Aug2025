package com.gqt.challenges.Inheritance;
class Fruit{
	String name;
	String color;
}
class Banana extends Fruit{
	String taste;
	int size;
	Banana(String taste , int size){
		this.taste=taste;
		this.size=size;
	}
}
public class Challenge17 {
public static void main(String[] args) {
	Banana b = new Banana("sweet",12);
	b.name="Chekkara keli";
	b.color="yellow";
	System.out.println(b.name);
	System.out.println(b.color);
	System.out.println(b.taste);
	System.out.println(b.size);
}
}
