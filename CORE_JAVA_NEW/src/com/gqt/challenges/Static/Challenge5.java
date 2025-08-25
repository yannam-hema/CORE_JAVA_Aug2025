package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge5 {
	public static int maxi(int a , int b) {
		if(a>b) return a;
		else return b;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n1");
	int n1=sc.nextInt();
	System.out.println("Enter n2");
	int n2=sc.nextInt();
	System.out.println("Maximum Number " +maxi(n1,n2));
}
}
