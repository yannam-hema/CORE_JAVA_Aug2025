package com.gqt.challenges.Inheritance;

class Vehicle{
	String make = "In india";
	String model = "Mercedes";
	int year = 2019;
}
class car extends Vehicle{
	String color ="Black";
	int mileage= 67;
}
public class Challenge1 {
public static void main(String[] args) {
car c = new car();
System.out.println(c.make);
System.out.println(c.model);
System.out.println(c.year);
System.out.println(c.color);
System.out.println(c.mileage);
}
}
