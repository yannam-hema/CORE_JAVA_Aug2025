package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge23 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal Amount");
	double p=sc.nextDouble();
	System.out.println("Enter the time period");
	double t= sc.nextDouble();
	System.out.println("Enter rate of rate of interest");
	double r=sc.nextDouble();
	
	double SI=(p*t*r)/100;
	System.out.println("Simple interest = "+SI);
}
}
