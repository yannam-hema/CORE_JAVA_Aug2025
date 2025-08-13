package com.gqt.common;

class Plane1{
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

class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	
	void carryGoods() {
		System.out.println("Plane is carrying goods ");
	}
}
class PassengerPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger plane is flying");
	}
	
	void carryPassengers() {
		System.out.println("Plane is carrying Passengers");
	}
}
class FighterPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter plane is flying");
	}
	
	void carryWeapons() {
		System.out.println("Plane is carrying weapons ");
	}

}
public class PolymorphisimExample1 {

	public static void main(String[] args) {
		
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane Fp = new FighterPlane();
		Plane1 ref;
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryPassengers();
		
		ref=Fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		Fp.carryWeapons();
	}

}
