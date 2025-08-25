package com.gqt.challenges.Static;
class ObjectCount{
	static int count=0;
	public ObjectCount() {
		count++;
		System.out.println("Object Created count "+count);
	}
}
public class Challenge1 {
public static void main(String[] args) {
	ObjectCount obj = new ObjectCount();
	ObjectCount obj1 = new ObjectCount();
	ObjectCount obj2 = new ObjectCount();
}
}
