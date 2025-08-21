package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge12_Two {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	StringBuilder sb = new StringBuilder();
	while(n>0) {
		int d=n%10;
		sb.append(d);
		n=n/10;
	}
	System.out.println(sb.reverse());
}
}
