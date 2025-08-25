package com.gqt.common;

class MicrosoftWord1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
		 typing();	
		}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}
       		
	}

	private void saving() {
		try {
			for(;;){
				System.out.println("Saving in progress....");
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	private void checking() {
		try {
			for(;;){
				System.out.println("checking in progress....");
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	private void typing() {
		try {
			for(int i=1;i<=5;i++){
				System.out.println("Typing in progress....");
				Thread.sleep(1000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}

public class UsingDaemonTechnique {
	public static void main(String[] args) {
		
		MicrosoftWord1 ms1 = new MicrosoftWord1();	
		ms1.setName("Typing");
		System.out.println(ms1.getPriority());
		MicrosoftWord1 ms2 = new MicrosoftWord1();
		ms2.setName("checking");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		
		MicrosoftWord1 ms3 = new MicrosoftWord1();
		ms3.setName("saving");
		ms3.setPriority(8);
		ms3.setDaemon(true);
		
		ms1.start();
		ms2.start();
		ms3.start();
		}
}
