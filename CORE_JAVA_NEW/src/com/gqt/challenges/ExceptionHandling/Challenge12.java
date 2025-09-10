package com.gqt.challenges.ExceptionHandling;

class Threadexp2 extends Thread{
	@Override
	public void run() {
		System.out.println("running !!");
	}
}
public class Challenge12 {
public static void main(String[] args) {
	try {
	Threadexp2 th = new Threadexp2();
	th.start();
	System.out.println("Thread has started running ");
	th.start();
	}catch (IllegalThreadStateException e) {
		System.out.println(e);
	}
}
}
