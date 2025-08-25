package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge11 {
	static final double pi= Math.PI;
	public static double volume(int r , int h) {
		return pi*r*r*h;
	}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius : ");
int r = sc.nextInt();
System.out.println("Enter height : ");
int h = sc.nextInt();
System.out.println(volume(r,h));
}
}
