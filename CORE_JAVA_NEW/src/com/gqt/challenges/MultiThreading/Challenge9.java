package com.gqt.challenges.MultiThreading;

import java.util.concurrent.CountDownLatch;

class LatchExp extends Thread{
	private CountDownLatch latch;
	private int id;
	public LatchExp( CountDownLatch latch , int id ) {
		this.latch=latch;
		this.id=id;
	}@Override
	public void run() {
		System.out.println(id+" started "+getName());
		try {
		Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(id+" finished "+getName());
		latch.countDown();
	}
}
public class Challenge9 {
public static void main(String[] args) {
	int count =2;
	CountDownLatch latch = new CountDownLatch(count);
	for(int i=1;i<=count;i++) {
		new LatchExp(latch, i).start();
	}
	try {
		System.out.println("Main thread waits for to complete latch class");
		latch.await();
		System.out.println("Main thread continues");
	}catch (InterruptedException e) {
		System.out.println(e);
	}
}
}
