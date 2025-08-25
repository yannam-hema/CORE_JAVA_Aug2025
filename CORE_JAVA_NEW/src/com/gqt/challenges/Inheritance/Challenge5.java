package com.gqt.challenges.Inheritance;

class Animal{
	String name;
	int age;
}
class Dog extends Animal{
	String breed;
	String color;
	Dog(String breed , String color){
		this.breed=breed;
		this.color=color;
	}
	void display() {
		System.out.print(name+" 's "+ " age is "+age+" and it is in "+color+" color"+" It is from " +breed+" breed");
		System.out.println();
	}
}
class Cat extends Animal{
	String breed;
	String color;
	Cat(String breed , String color){
		this.breed=breed;
		this.color=color;
	}
	void display() {
		System.out.print(name+" 's "+ " age is "+age+" and it is in "+color+" color"+" It is from " +breed+" breed");

	}
}
public class Challenge5 {
public static void main(String[] args) {
	Dog d = new Dog("Husky","black");
	d.name="Strom";
	d.age=7;
	d.display();
	Cat c = new Cat("special-1","grey");
	c.name="cutie";
	c.age=3;
	c.display();
}
}
