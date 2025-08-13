package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge25 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int number=sc.nextInt();
	 System.out.println("Enter exponent");
	 int exponent=sc.nextInt();
	 long power=1;
	 for(int i=1;i<=exponent;i++) {
		 power*=(number);
	 }
	 System.out.println(power);
	}
}
