package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge15 {
	public static void area(int d1 , int d2) {
		System.out.println("Area of Rhombus ="+(0.5)*(d1*d2));
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d1=sc.nextInt();
	int d2=sc.nextInt();
	area(d1,d2);
}
}
