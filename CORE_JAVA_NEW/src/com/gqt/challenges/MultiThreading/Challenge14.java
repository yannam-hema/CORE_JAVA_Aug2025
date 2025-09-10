package com.gqt.challenges.MultiThreading;

class ThreadVolatileExp extends Thread{
	private volatile boolean run=true;
	@Override
	public void run() {
		while(run) {
			System.out.println(getName()+" running");
		}
		
	}
	public void stoprun() {
		run=false;
		System.out.println(getName()+" stopped");
	}
}
public class Challenge14 {
public static void main(String[] args) throws InterruptedException{
	ThreadVolatileExp tv = new ThreadVolatileExp();
	tv.start();
	Thread.sleep(1000);
	tv.stoprun();
}
}
