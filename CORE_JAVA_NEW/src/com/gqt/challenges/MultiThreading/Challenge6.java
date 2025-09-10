package com.gqt.challenges.MultiThreading;

class Warrior1 extends Thread{
	static String res1="ak-47";
	static String res2="9mm";
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
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Hema acquired "+ res2);
					Thread.sleep(2000);	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void someOneElseAcq() {
		try {
			synchronized (res2) {
				System.out.println("someone acquired "+ res2);
				Thread.sleep(2000);
				synchronized (res1) {
					System.out.println("someone acquired "+ res1);
					Thread.sleep(2000);	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Challenge6 {
public static void main(String[] args) throws InterruptedException {
	Warrior1 w1 = new Warrior1();
	Warrior1 w2 = new Warrior1();
	w1.setName("hema");
	w2.setName("lahari");
	w1.start();
	w2.start();
}
}
