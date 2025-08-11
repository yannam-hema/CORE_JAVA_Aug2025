package com.gqt.common;

class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	//Zero parameterized
	Dog(){
	super();
	System.out.println("ZERO parameterized  Constructor");
	this.name="Luna";
	this.color="White";
	this.cost=5000;
	this.age=4;
	this.breed="Husky";
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.cost);
	System.out.println(this.age);
	System.out.println(this.breed);
	System.out.println("...........................................");
	}
	
	
	//one Parameterized
	
	Dog(String name){
		this();
		System.out.println("ONE parameterized  Constructor");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("...........................................");
	}
	
	//TWO parameterized
	
	Dog(String name, String color){
		this("laxman");
		System.out.println("TWO parameterized  Constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("...........................................");
	}
	
	//Three Parameterized constructor
	
	Dog(String name,String color,int cost){
		this("hanu","grey");
		System.out.println("THREE parameterized  Constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("...........................................");
	}
	
	//Four Parameterized constructor
	
	Dog(String name,String color,int cost,int age){
		this("kridh","GREY",5000);
		System.out.println("FOURR parameterized  Constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("...........................................");
	}
	
	//Five Parameterized constructor
	
		Dog(String name,String color,int cost,int age,String breed){
			this("abhi","DARK GREY",50000,8);
			System.out.println("FIVE parameterized  Constructor");
			this.name=name;
			this.color=color;
			this.cost=cost;
			this.age=age;
			this.breed=breed;
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.cost);
			System.out.println(this.age);
			System.out.println(this.breed);
			
			System.out.println("...........................................");
		}
}

public class LocalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog d = new Dog("arjun","BLACK",7,7000,"Husky");
       
	}

}
