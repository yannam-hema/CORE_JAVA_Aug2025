package com.gqt.challenges.Abstraction;

abstract class Vehicle{
	abstract void drive();
	abstract void stop();
}

class Car1 extends Vehicle{
	Car1(){
		System.out.println("Car's constructor");
	}
	@Override
	void drive() {
	  System.out.println("Driving the car");
	}
	void run() {
		System.out.println("Car is running");
	}
	@Override
	void stop() {
	System.out.println("Car has stopped");
	}
}
class Truck extends Vehicle{
	Truck(){
		System.out.println("Truck's constructor");
	}
	@Override
	void drive() {
	  System.out.println("Driving Truck");
	}
	void run() {
		System.out.println("Truck is running");
	}
	@Override
	void stop() {
	System.out.println("Truck has stopped");
	}
}

public class Challenge17 {
public static void main(String[] args) {
	Car1 c = new Car1();
	c.drive();
	c.run();
	c.stop();
	Truck t = new Truck();
	t.drive();
	t.run();
	t.stop();
}
}
