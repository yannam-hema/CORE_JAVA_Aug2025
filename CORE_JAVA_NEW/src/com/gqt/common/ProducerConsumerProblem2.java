package com.gqt.common;
class producer1 extends Thread{
	Queue1 a;
	public producer1(Queue1 q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.produce(i++);
		}
	}
}
class consumer1 extends Thread{
Queue1 b;
public consumer1(Queue1 q) {
	b=q;
}
@Override
	public void run() {
	int i=1;
	while(true) {
		b.consume();
	}
	}
}
class Queue1{
      int x;
      boolean value_inside_x=false;
	synchronized  void produce(int i) {
		try {
		if(value_inside_x==false) {	
	     x=i;
	   System.out.println("producer has produced the data "+ x);
	   value_inside_x=true;
	   notify();
		}
		else {
			wait();
		}
	}
	catch(Exception e) {
	e.printStackTrace();		
	}	
	}
	
	synchronized  void consume() {
		try {
			if(value_inside_x==true) {	
		   System.out.println("consumer has consumed the data "+ x);
		   value_inside_x=false;
		   notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
		e.printStackTrace();		
		}	
	}
	
}
public class ProducerConsumerProblem2 {
public static void main(String[] args) {
	Queue1 q = new Queue1();
	(new consumer1(q)).start();
	(new producer1(q)).start();
}
}
