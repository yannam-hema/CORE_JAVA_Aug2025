package com.gqt.common;

class Plane{
	void fly() {
		System.out.println("Plane is flying");
	}
	void takeoff() {
		System.out.println("Plan took off");
	}
	void land() {
		System.out.println("Plan has landed");
	}
}

class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	
	void carryGoods() {
		System.out.println("Plane is carrying goods ");
	}
}
public class InheritaceExample2 {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.takeoff();
		cp.fly();
		cp.carryGoods();
		cp.land();
	
	}

}
