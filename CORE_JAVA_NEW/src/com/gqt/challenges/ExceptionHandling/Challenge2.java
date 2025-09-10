package com.gqt.challenges.ExceptionHandling;

import java.util.Scanner;

public class Challenge2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n1 :");
	int n1=sc.nextInt();
	System.out.println("Enter n2 :");
	int n2=sc.nextInt();
	try {
		System.out.println(n1/n2);
	}
	catch (ArithmeticException e) {
		System.out.println(e+" is handled");
	}
}
}
