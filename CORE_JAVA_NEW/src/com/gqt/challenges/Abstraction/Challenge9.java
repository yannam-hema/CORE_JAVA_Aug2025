package com.gqt.challenges.Abstraction;

abstract class vehicle{
	abstract void start();
	abstract void stop();
}

class Car extends vehicle{
	Car(){
		System.out.println("Car's constructor");
	}
	@Override
	void start() {
	  System.out.println("Car has started");
	}
	void run() {
		System.out.println("Car is running");
	}
	@Override
	void stop() {
	System.out.println("Car has stopped");
	}
}
class MotorCycle extends vehicle{
	MotorCycle(){
		System.out.println("Motor Cycle 's constructor");
	}
	@Override
	void start() {
	  System.out.println("Motor Cycle has started");
	}
	void run() {
		System.out.println("Motor Cycle is running");
	}
	@Override
	void stop() {
	System.out.println("Mototr cycle has stopped");
	}
}

public class Challenge9 {
public static void main(String[] args) {
	Car c = new Car();
	c.start();
	c.run();
	c.stop();
	MotorCycle m = new MotorCycle();
	m.start();
	m.run();
	m.stop();
}
}
