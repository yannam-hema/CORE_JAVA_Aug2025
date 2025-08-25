package com.gqt.challenges.Inheritance;

class Person1{
	String name;
	int age;
}
class Employee1 extends Person{
int id;
int salary;
Employee1(int id, int salary){
	this.id=id;
	this.salary=salary;
}
void display() {
System.out.println("name = "+name +" age ="+age);
System.out.println("Id = "+id+" salary = "+salary);
}
}

public class Challenge21 {
public static void main(String[] args) {
Employee1 e = new Employee1(101, 2000000);
e.name="Ravi";
e.age=45;
e.display();
}
}

