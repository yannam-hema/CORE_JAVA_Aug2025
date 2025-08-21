package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge2 {
	
	public static void performAND(int a , int b) {
		System.out.println("AND Operation of "+ (a&b));
	}
	public static void performOR(int a , int b) {
		System.out.println("OR Operation of "+ (a|b));
	}
	public static void performXOR(int a , int b) {
		System.out.println("XOR Operation of "+ (a^b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		performAND(a,b);
		performOR(a,b);
		performXOR(a,b);

	}

}
