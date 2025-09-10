package com.gqt.challenges.MultiThreading;

class threadexp1 extends Thread{
	@Override
	public void run() {
	System.out.println("thread1 is running");
	}
}
class threadexp2 extends Thread{
	@Override
	public void run() {
	System.out.println("thread2 is running");
	}
}
public class Challenge1 {
public static void main(String[] args) {
	threadexp1 t1= new threadexp1();
	t1.start();
	threadexp2 t2 = new threadexp2();
	t2.start();
}
}
