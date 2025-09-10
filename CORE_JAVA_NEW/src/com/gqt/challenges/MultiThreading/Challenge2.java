package com.gqt.challenges.MultiThreading;

class Warrior extends Thread{
	String res1="ak-47";
	String res2="9mm";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("hema")) {
			HemaAcq();
		}
		else {
			someOneElseAcq();
		}
	}
	
	public void HemaAcq() {
		try {
			synchronized (res1) {
				System.out.println("Hema acquired "+ res1);
				Thread.sleep(4000);
				synchronized (res2) {
					System.out.println("Hema acquired "+ res2);
					Thread.sleep(4000);	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void someOneElseAcq() {
		try {
			synchronized (res1) {
				System.out.println("someone acquired "+ res1);
				Thread.sleep(4000);
				synchronized (res2) {
					System.out.println("someone acquired "+ res2);
					Thread.sleep(4000);	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Challenge2 {
public static void main(String[] args) {
	Warrior w1 = new Warrior();
	w1.setName("hema");
	w1.start();
	Warrior w2 = new Warrior();
	w2.setName("lahari");
	w2.start();
}
}
