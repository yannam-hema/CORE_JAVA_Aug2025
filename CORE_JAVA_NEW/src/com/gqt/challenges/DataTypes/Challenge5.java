package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean b = true;
	if(n%2!=0) {
		b=false;
	}
	if(b==true) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("ODD Number");
	}
}
}
