package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge9 {
	public static void areaOfTriangle(int b , int h) {
		System.out.println((0.5)*b*h);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base :");
	int b = sc.nextInt();
	System.out.println("Enter height : ");
	int h = sc.nextInt();
	areaOfTriangle(b,h);
}
}
