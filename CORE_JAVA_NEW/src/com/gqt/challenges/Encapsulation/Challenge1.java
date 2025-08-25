package com.gqt.challenges.Encapsulation;
class Student{
	private String name;
	private int rollNumber;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
public class Challenge1 {
public static void main(String[] args) {
Student st = new Student();
st.setName("Hema");
st.setRollNumber(12);
st.setAge(21);
System.out.println(st.getName());
System.out.println(st.getRollNumber());
System.out.println(st.getAge());
}
}
