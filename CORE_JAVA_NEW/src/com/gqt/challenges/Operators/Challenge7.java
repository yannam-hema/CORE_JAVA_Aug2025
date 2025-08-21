package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	if(n%5==0 && n%7==0) {
		System.out.println("The number is divisible by both 5 and 7");
	}
	else {
		System.out.println("The number is NOT divisible by both 5 and 7");
	}
}
}
