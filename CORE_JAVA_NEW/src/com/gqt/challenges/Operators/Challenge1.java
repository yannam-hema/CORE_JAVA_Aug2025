package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge1 {
	public static void add(int a,int b) {
		System.out.println("Addition of numbers "+(a+b));
	}
	public static void subtract(int a,int b) {
		System.out.println("subtraction of numbers "+(a-b));
	}
	public static void multiply(int a,int b) {
		System.out.println("multiplication of numbers "+(a*b));
	}
	public static void divide(int a,int b) {
		if(b==0) {
			System.out.println("Division can't be performed");
		}
		else {
		System.out.println("division of numbers "+(a/b));
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	add(a,b);
	subtract(a,b);
	multiply(a,b);
	divide(a,b);
	sc.close();
}
}
