package com.gqt.challenges.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge4 {
public static void main(String[] args) {
	ExecutorService ex = Executors.newFixedThreadPool(2);
	Thread tOne= new Thread() {
		public void run() {
			System.out.println(Thread.currentThread().getName());;
		}
	};
	Thread tTwo= new Thread() {
		public void run() {
			System.out.println(Thread.currentThread().getName());;
		}
	};
	
	ex.submit(tOne);
	ex.submit(tTwo);
	
	ex.shutdown();
}
}
