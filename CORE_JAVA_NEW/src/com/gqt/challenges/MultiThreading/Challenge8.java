package com.gqt.challenges.MultiThreading;

class Thread1 extends Thread{
	private static ThreadLocal <Integer> tl = ThreadLocal.withInitial(()->0);
	@Override
	public void run() {
		int val=tl.get();
		System.out.println(tl.get());
				val+=5;
		 tl.set(val);
		 System.out.println(Thread.currentThread().getName() + " = "+tl.get());
	}
}
public class Challenge8 {
public static void main(String[] args) {
Thread1 t1 = new Thread1();
t1.start();
}
}
