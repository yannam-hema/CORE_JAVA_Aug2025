package com.gqt.challenges.Interface;
interface runnable{
	void run();
}
interface walkable{
void walk();	
}
class Tortoise implements walkable{
	@Override
	public void walk() {
		System.out.println("Tortoise is walking");
	}
}
class Cheetah implements runnable{
	@Override
	public void run() {
		System.out.println("Cheetah is running");
	}
}
public class Challenge18 {
public static void main(String[] args) {
	Tortoise t = new Tortoise();
	t.walk();
	Cheetah c = new Cheetah();
	c.run();
}
}
