package com.gqt.challenges.Abstraction;

abstract class Employee{
abstract void calculateSalary();
abstract void calculateBonus();
}
class Manager extends Employee{
	Manager(){
		System.out.println("Manager's class");
	}
	@Override
	void calculateBonus(){
		System.out.println("Manager's Bonus method");
	}
	@Override
	void calculateSalary() {
		System.out.println("Manager's salary method");
	}
}
class Clerk extends Employee{
	Clerk(){
		System.out.println("Clerk's class");
	}
	@Override
	void calculateBonus(){
		System.out.println("Clerk's Bonus method");
	}
	@Override
	void calculateSalary() {
		System.out.println("Clerk's salary method");
	}
}
public class Challenge5 {
public static void main(String[] args) {
Manager m = new Manager();
m.calculateBonus();
m.calculateSalary();
Clerk c = new Clerk();
c.calculateBonus();
c.calculateSalary();
}
}
