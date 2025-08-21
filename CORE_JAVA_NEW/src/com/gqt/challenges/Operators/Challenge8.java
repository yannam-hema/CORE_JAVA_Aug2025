package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal Amount");
	double p=sc.nextInt();
	System.out.println("Enter the time peroid");
	double t=sc.nextInt();
	System.out.println("Enter the rate of interest");
	double r=sc.nextInt();
	
	 double result = p * Math.pow((1 + r / 100), t) - p;
	System.out.println("Compound interest "+result);
	
}
}
