package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge16 {
	public static void area(int d1 , int d2) {
		System.out.println("Area of Parallelogram ="+(d1*d2));
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base : ");
	int b=sc.nextInt();
	System.out.println("Enter height : ");
	int h=sc.nextInt();
	area(b,h);
}
}
