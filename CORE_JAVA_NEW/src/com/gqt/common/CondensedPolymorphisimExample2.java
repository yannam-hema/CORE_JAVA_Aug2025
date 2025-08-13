package com.gqt.common;

class Animal2{
	void eat() {
		System.out.println("Animal is eating Food");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Rabbit{
	//@override
	void eat() {
		System.out.println("Rabbit is eating carrot");
	}
	void qualityOfRabbit() {
		System.out.println("Rabbit doesn't have ");
	}
	void type() {
		System.out.println("Rabbit is herbivore");
	}
}

class elephant{
	void eat() {
		System.out.println("Elephant is eating banana");
	}
	
	void qualityOfElephant() {
		System.out.println("Elephant is one of the strongest Animal");
	}
	void type() {
		System.out.println("Elephant is herbivore");
	}
}

class Lion{
	void eat() {
		System.out.println("Lion eats Meat");
	}
	void qualityOfLion() {
	   System.out.println("Lion is the King of the Forest");
	}
	void type() {
		System.out.println("Lion is a carnivore");
	}
}
class Forest{
	void permit(Animal2 ref) {
		ref.sleep();	
	}
}
public class CondensedPolymorphisimExample2 {

	public static void main(String[] args) {
		
		Animal2 a2;
		
		Rabbit r= new Rabbit();
		elephant e = new elephant();
		Lion l = new Lion();
		Forest ff= new Forest();
		a2=r;
		ff.permit(a2);
		r.eat();
		r.qualityOfRabbit();
		r.type();
		System.out.println("-----------");
		a2=e;
		ff.permit(a2);
		e.eat();
		e.qualityOfElephant();
		e.type();
		System.out.println("-----------");
		a2=l;
		ff.permit(a2);
		e.eat();
		e.qualityOfElephant();
		e.type();
	}

}
