package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge15 {
	public static long recursion(int n , int p) {
		if(p<1) {
			return 1;
		}
		return n*recursion(n, p-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("Enter the exponent");
	int p=sc.nextInt();
	long result=recursion(n,p);
	System.out.println(result);
}
}
