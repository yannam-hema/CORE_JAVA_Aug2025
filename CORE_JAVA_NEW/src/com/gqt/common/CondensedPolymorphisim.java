package com.gqt.common;


class Plane2{
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

class CargoPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	
	void carryGoods() {
		System.out.println("Plane is carrying goods ");
	}
}
class PassengerPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Passenger plane is flying");
	}
	
	void carryPassengers() {
		System.out.println("Plane is carrying Passengers");
	}
}
class FighterPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Fighter plane is flying");
	}
	
	void carryWeapons() {
		System.out.println("Plane is carrying weapons ");
	}

}

class Airport{
	void permit(Plane2 ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class CondensedPolymorphisim {

	public static void main(String[] args) {
		Airport ap = new Airport();
		CargoPlane2 cp = new CargoPlane2();
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 Fp = new FighterPlane2();
		
		Plane2 ref;
		ref=cp;
		ap.permit(ref);
		cp.carryGoods();
		
		ref=pp;
		ap.permit(ref);
		pp.carryPassengers();
		
		ref=Fp;
		ap.permit(ref);
		Fp.carryWeapons();
	}

}


