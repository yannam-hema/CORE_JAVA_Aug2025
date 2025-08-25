package com.gqt.challenges.Abstraction;

abstract class Animal{
	abstract void eat();
	abstract void sleep();
}
class Dog extends Animal{
	Dog(){
		System.out.println("Dog's class");
	}
	@Override
	void eat() {
		System.out.println("Dog is eating chicken");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}
class Cat extends Animal{
	Cat(){
		System.out.println("Cat's class");
	}
	@Override
	void eat() {
		System.out.println("cat is eating curd rice");
	}
	void sleep() {
		System.out.println("cat is sleeping");
	}
}
public class Challenge3 {
public static void main(String[] args) {
Dog d = new Dog();
d.eat();
d.sleep();
Cat c = new Cat();
c.eat();
d.sleep();
}
}
