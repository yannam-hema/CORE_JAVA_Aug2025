package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge7 {
	public static void powerOfAnumber(int n , int e) {
		 long power=1;
		 for(int i=1;i<=e;i++) {
			 power*=n;
		 }
		 System.out.println(power);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int number=sc.nextInt();
		 System.out.println("Enter exponent");
		 int exponent=sc.nextInt();
		 powerOfAnumber(number, exponent);
		}
}
