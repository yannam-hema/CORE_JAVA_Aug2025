package com.gqt.common;

abstract class exp{
	void something() {
		System.out.println("something somemthing !!!!!");
	}
}
abstract class Plane3{
	abstract void fly();
	abstract void takeOff();
	void land() {
		System.out.println("Plan has landed");
	}
}

class CargoPlane3 extends Plane3{
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	@Override
	void takeOff() {
		System.out.println("Cargo Plane needs long run way to take off");
	}
	void carryGoods() {
		System.out.println("Plane is carrying goods ");
	}
}
class PassengerPlane3 extends Plane3{
	@Override
	void fly() {
		System.out.println("Passenger plane is flying");
	}
	@Override
	void takeOff() {
		System.out.println("Passenger Plane needs medium length run way to take off");
	}
	void carryPassengers() {
		System.out.println("Plane is carrying Passengers");
	}
}
class FighterPlane3 extends Plane3{
	@Override
	void fly() {
		System.out.println("Fighter plane is flying");
	}
	@Override
	void takeOff() {
		System.out.println("Fighter Plane needs long run way to take off");
	}
	void carryWeapons() {
		System.out.println("Plane is carrying weapons ");
	}

}

class Airport2{
	void permit(Plane3 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		Airport2 ap = new Airport2();
		CargoPlane3 cp = new CargoPlane3();
		PassengerPlane3 pp = new PassengerPlane3();
		FighterPlane3 Fp = new FighterPlane3();
		
		Plane3 ref;
		ref=cp;
		ap.permit(ref);
		cp.carryGoods();
		
		ref=pp;
		ap.permit(ref);
		pp.carryPassengers();
		
		ref=Fp;
		ap.permit(ref);
		Fp.carryWeapons();

	// creating a object for abstract class with anonymous inner types	
		 Plane3 p3= new Plane3() {
			@Override
			void fly() {
			System.out.println("flyingg !!!!!");
			}

			@Override
			void takeOff() {
			System.out.println("takingg offfffff");
			}
			 
		 };
		 p3.takeOff();
		 p3.fly();
		 p3.land();
		 
		// creating object for abstract class 
		//even if that class doesn't have any abstract methods
		 
		 exp obj = new exp() {};
		 obj.something();
	}

}
