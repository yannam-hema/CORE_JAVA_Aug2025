package com.gqt.challenges.DataTypes;
class yannamFamily{
	String name;
	int age;
	String gender;
	public yannamFamily(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void display()
	{
		System.out.println(name + "  "+ age +"  "+ gender);
	}
}
public class Challenge20 {
public static void main(String[] args) {
	yannamFamily arr[]= {
		new yannamFamily("hema",21,"female"),
		new yannamFamily("lahari", 17, "female"),
		new yannamFamily("hari", 15, "Male"),
	};
	for(yannamFamily ob:arr ) {
		ob.display();
	}
}
}
