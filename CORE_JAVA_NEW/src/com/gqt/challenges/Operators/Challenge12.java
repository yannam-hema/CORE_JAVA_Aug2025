package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int new_n=n;
	int rev=0;
	while(new_n>0) {
		int d=new_n%10;
		rev=rev*10+d;
		new_n=new_n/10;
	}
	if(rev==n) {
		System.out.println("Number is Palindrome");
	}
	else {
		System.out.println("Number is NOT a palindrome");
	}
}
}
