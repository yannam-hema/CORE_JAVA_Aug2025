package com.gqt.challenges.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadExp3 implements Callable<Integer>{
int n;
public ThreadExp3(int n) {
	this.n=n;
}
@Override
	public Integer call() throws Exception {
		return n*n;
	}
}
public class Challenge17 {
public static void main(String[] args) {
	ExecutorService ex = Executors.newSingleThreadExecutor();
	ThreadExp3 t1 = new ThreadExp3(3);
	Future<Integer> f = ex.submit(t1);
	try {
			Integer r= f.get();
			System.out.println(r);
	}catch (InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
	ex.shutdown();
}
}
