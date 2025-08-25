package com.gqt.challenges.Inheritance;
class Vehicle1{
	String make = "In india";
	String model = "TATA";
	int year = 2019;
}
class Truck extends Vehicle{
	int capacity = 500;
	int mileage= 67;
}
public class Challenge15 {
public static void main(String[] args) {
Truck t = new Truck();
System.out.println(t.make);
System.out.println(t.model);
System.out.println(t.year);
System.out.println(t.capacity);
System.out.println(t.mileage);
}
}

