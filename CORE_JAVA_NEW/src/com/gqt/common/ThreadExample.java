package com.gqt.common;

import java.util.Scanner;

class Operation extends Thread{
	@Override
 public void run() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Addition Operation is started");
	 System.out.println("Enter the first number :");
	 int n1=sc.nextInt();
	 System.out.println("Enter the second number :");
	 int n2=sc.nextInt();
	 int res=n1+n2;
	 System.out.println("result :"+res);
	 System.out.println("Addition Operation is hogaya :) ");
 }
}

class Operation2 extends Thread {
	public  void run(){
		 System.out.println("Printing name has suru hai");
		 for(int i=1;i<=10;i++) {
			 System.out.println("Yannam Hema");
			 try {
			 Thread.sleep(2000);
			 }
			 catch (Exception e) {
				// TODO: handle exception
			}
		 }
		 System.out.println("printing operation hogaya :) ");
	 }
}

class Operation3 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Bank Operation is started");
		 System.out.println("Enter the Account number :");
		 int n1=sc.nextInt();
		 System.out.println("Enter the pin number :");
		 int n2=sc.nextInt();
		 System.out.println("Bank Operation is hogaya :) ");
	}
}
public class ThreadExample {
	public static void main(String[] args) {
		Operation o1 = new Operation();
		Operation2 o2 = new Operation2();
		Operation3 o3= new Operation3();
		o1.start();
		o2.start();
		o3.start();
	}
}
