package com.gqt.common;

class Human extends Thread{
	@Override
	public void run() {
		try {
		System.out.println(Thread.currentThread().getName()+" has entered rest room");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+" has using the rest room");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName()+" has exited rest room");
		Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class ProblemWithMultiThreading {
public static void main(String[] args) {
	Human h1= new Human();
	h1.setName("Person1");
	
	Human h2= new Human();
	h2.setName("Person2");
	
	Human h3= new Human();
	h3.setName("Person3");
	
	h1.start();
	h2.start();
	h3.start();
}
}
