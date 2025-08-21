package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge5 {
	public static double area(int r) {
		return Math.PI*r*r;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r=sc.nextInt();
	System.out.println("Area of  a circle "+area(r));
}
}
