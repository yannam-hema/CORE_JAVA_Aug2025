package com.gqt.common;
class MicrosoftWord extends Thread{
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
			for(int i=1;i<=5;i++){
				System.out.println("Saving in progress....");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	private void checking() {
		try {
			for(int i=1;i<=5;i++){
				System.out.println("checking in progress....");
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
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}
public class RaceCondition {
public static void main(String[] args) {
MicrosoftWord ms1 = new MicrosoftWord();	
ms1.setName("Typing");
MicrosoftWord ms2 = new MicrosoftWord();
ms2.setName("checking");
MicrosoftWord ms3 = new MicrosoftWord();
ms3.setName("saving");
ms1.start();
ms2.start();
ms3.start();
}
}
