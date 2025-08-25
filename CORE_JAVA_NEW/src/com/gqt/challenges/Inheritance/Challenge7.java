package com.gqt.challenges.Inheritance;

class Employee{
String name;
int id;
long salary;
}
class Manager extends Employee{
	String department;
	String designation;
	Manager(String department, String designation){
		this.department=department;
		this.designation=designation;
	}
	void display() {
		System.out.println("name = " + name +" id = "+id+" salary = "+salary);
		System.out.println("department = "+department +" designation = "+ designation);
	}
}
public class Challenge7 {
public static void main(String[] args) {
	Manager m = new Manager("CSE" , "Assist Professor");
	m.name="Vamsi sir";
	m.id=2;
	m.salary=20000000;
	m.display();
}
}
