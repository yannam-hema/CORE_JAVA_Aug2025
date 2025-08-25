package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge18 {
	public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n=sc.nextInt();
	System.out.println("Enter side  : ");
	int s=sc.nextInt();
	System.out.println(area(n ,s));
}
}
