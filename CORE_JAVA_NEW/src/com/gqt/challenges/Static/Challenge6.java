package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge6 {
	public static int mini(int a , int b) {
		if(a<b) return a;
		else return b;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n1");
	int n1=sc.nextInt();
	System.out.println("Enter n2");
	int n2=sc.nextInt();
	System.out.println("Minimum Number " +mini(n1,n2));
}
}
