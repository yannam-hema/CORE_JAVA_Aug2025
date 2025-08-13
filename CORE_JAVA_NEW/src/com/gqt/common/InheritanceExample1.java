package com.gqt.common;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal Zero parameterized constructor is Invoked");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal parameterized constructor is invoked");
		System.out.println("The Animal constructor has received the message as : "+ message);
	}
}

class Elephant extends Animal{
	String name;
	int weight;
	Elephant(){
		super("Message from Elephant");
		System.out.println("Hi!! From Elephant constructor");
	}
	Elephant(String name, int weight){
		//super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name + " "+ this.weight);
	}
}
public class InheritanceExample1 {

	public static void main(String[] args) {
		 Elephant e= new Elephant();
		 Elephant ee= new Elephant("Arjunaaa",400);
	}
}
