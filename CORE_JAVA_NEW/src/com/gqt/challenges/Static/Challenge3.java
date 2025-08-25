package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	calcArea(n);
}
public static void calcArea(int n) {
	 final double pi= Math.PI;
	double Area=pi*n*n;
	System.out.println(Area);
}
}
