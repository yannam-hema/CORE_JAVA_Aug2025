package com.gqt.challenges.Inheritance;

class Person{
	String name;
	int age;
}
class Student extends Person{
int rollNumber;
String subject;
Student(int rollNumber, String subject){
	this.rollNumber=rollNumber;
	this.subject=subject;
}
void display() {
System.out.println("name = "+name +" age ="+age);
System.out.println("Roll Number = "+rollNumber+" subject = "+subject);;
}
}

class Teacher extends Person{
int rollNumber;
String subject;
Teacher(int rollNumber, String subject){
	this.rollNumber=rollNumber;
	this.subject=subject;
}
void display() {
System.out.println("name = "+name +" age ="+age);
System.out.println("Roll Number = "+rollNumber+" subject = "+subject);;
}
}

public class Challenge9 {
public static void main(String[] args) {
Student s = new Student(12, "Chemistry");
s.name="Hema";
s.age=21;
s.display();
Teacher t = new Teacher(101, "Science");
t.name="Ravi";
t.age=45;
t.display();
}
}
