package com.gqt.challenges.ExceptionHandling;

import java.io.InterruptedIOException;

class Threadexp extends Thread{
	@Override
	public void run() {
		try {
		for(int i=1;i<=3;i++){
			System.out.println("Thread is runnning");
			Thread.sleep(2000);
			if(i==2) {
				throw new InterruptedException("Interuption is occured");
			}
		}
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class Challenge10 {
public static void main(String[] args) {
Threadexp tx = new Threadexp();
tx.start();
}
}
