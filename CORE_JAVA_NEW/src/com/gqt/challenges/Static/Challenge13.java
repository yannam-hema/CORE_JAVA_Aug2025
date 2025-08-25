package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge13 {
	public static void area(int l , int b) {
		System.out.println("Area of Rectangle ="+(l*b));
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int l=sc.nextInt();
	int b=sc.nextInt();
	area(l,b);
}
}
