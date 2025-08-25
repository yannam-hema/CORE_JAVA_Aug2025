package com.gqt.challenges.Encapsulation;

class Employee{
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class Challenge13 {
public static void main(String[] args) {
Employee e = new Employee();
e.setName("Hema yannam");
e.setId(21);
e.setSalary(25000);
System.out.println(e.getId());
System.out.println(e.getName());
System.out.println(e.getSalary());
}
}
