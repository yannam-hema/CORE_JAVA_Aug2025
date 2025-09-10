package com.gqt.challenges.Interface;
interface Flyable{
void fly();	
}
interface Swimable{
void swim();	
}
class Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
}
class Fish implements Swimable{
	@Override
	public void swim() {
		System.out.println("Fish is swimmimg");
	}
}
public class Challenge3 {
public static void main(String[] args) {
Bird b = new Bird();
Fish f = new Fish();
b.fly();
f.swim();

}
}
