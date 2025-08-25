package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge12 {
    public static void CompoundInterest(int p, int r, int n) {
        double amount = p * Math.pow((1 + (r / 100.0)), n);
        double ci = amount - p;
        System.out.println("CI = " + ci);
    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter prinipal :");
	int p = sc.nextInt();
	System.out.print("Enter interest : ");
	int r = sc.nextInt();
	System.out.print("Enter no of years : ");
	int t = sc.nextInt();
	CompoundInterest(p,t,r);
}
}
