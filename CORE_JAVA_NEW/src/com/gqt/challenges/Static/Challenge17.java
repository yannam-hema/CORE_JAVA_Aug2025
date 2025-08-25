package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge17 {
	public static void area(int a , int b ,int h) {
		System.out.println("Area of trapezium ="+((a+b)/2)*h);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side a : ");
	int a=sc.nextInt();
	System.out.println("Enter side b : ");
	int b=sc.nextInt();
	System.out.println("Enter height : ");
	int h=sc.nextInt();
	area(a,b,h);
}
}
