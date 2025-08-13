package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean leap=false;
		 if (n % 400 == 0) {
	            leap = true;
	        } else if (n % 100 == 0) {
	            leap = false;
	        } else if (n % 4 == 0) {
	            leap = true;
	        } else {
	            leap = false;
	        }
		if(leap) {
			System.out.println("It's a leap year");
		}
		else {
			System.out.println("It's NOT a leap year");
		}
	}

}
