package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	if(n==0) {
		System.out.println("It's Zero");
	}
	else if(n>0) {
		System.out.println("it's a positive number");
	}
	else {
		System.out.println("It's a negative number");
	}
}
}
