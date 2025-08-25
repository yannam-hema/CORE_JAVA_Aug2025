package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge10 {
	public static void SimpleInterest(int p , int t , int r) {
		System.out.println((p*t*r)/100);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter prinipal :");
	int p = sc.nextInt();
	System.out.print("Enter interest : ");
	int r = sc.nextInt();
	System.out.print("Enter no of years : ");
	int t = sc.nextInt();
	SimpleInterest(p,t,r);
}
}
