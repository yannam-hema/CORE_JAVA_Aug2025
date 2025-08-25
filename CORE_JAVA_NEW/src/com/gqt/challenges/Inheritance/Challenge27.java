package com.gqt.challenges.Inheritance;

class Animal1{
	String name;
	String type;
}
class Bird extends Animal{
	String color;
    int wingspan;
	public String type;
    Bird(String color , int wingspan){
    	this.color=color;
    	this.wingspan=wingspan;
    }
    void display() {
     System.out.println("Bird color = "+color);	
     System.out.println("Bird wingspan = "+wingspan);	
    }
}
public class Challenge27 {
public static void main(String[] args) {
Bird b = new Bird("green",12);
b.name="parrot";
b.type="type-1";
System.out.println(b.name);
System.out.println(b.type);
b.display();
}
}
