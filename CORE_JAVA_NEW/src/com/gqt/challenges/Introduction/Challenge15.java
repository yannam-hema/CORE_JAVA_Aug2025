package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		while(m>0) {
			sum+=(m%10);
			m=m/10;
		}
		System.out.println("sum of digits of a number "+sum);
	}

}
