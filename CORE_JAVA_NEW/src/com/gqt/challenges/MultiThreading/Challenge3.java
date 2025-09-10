package com.gqt.challenges.MultiThreading;

class exp1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread1");
	}
}
class exp2 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread2");
	}
}
public class Challenge3 {
public static void main(String[] args) {
exp1 obj1 = new exp1();
exp2 obj2 = new exp2();
obj1.setName("Firstone");
obj1.setPriority(8);
obj2.setName("second one");
obj2.setPriority(4);
System.out.println(obj1);
System.out.println(obj2);
}
}
