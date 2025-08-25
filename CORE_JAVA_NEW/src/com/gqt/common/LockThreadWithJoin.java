package com.gqt.common;
class Human1 extends Thread{
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

public class LockThreadWithJoin {
	public static void main(String[] args) throws InterruptedException {
		Human1 h1= new Human1();
		h1.setName("Person1");
		
		Human1 h2= new Human1();
		h2.setName("Person2");
		
		Human1 h3= new Human1();
		h3.setName("Person3");
		
		h1.start();
		h1.join(6000);
		h2.start();
		h2.join(8000);
		h3.start();
	}

}
