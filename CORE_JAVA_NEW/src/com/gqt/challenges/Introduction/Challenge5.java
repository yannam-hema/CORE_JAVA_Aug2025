package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge5 {
	
	public static long factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long result=factorial(n);
		System.out.println("Factorial of "+n+" is :- "+result);
	}

}
