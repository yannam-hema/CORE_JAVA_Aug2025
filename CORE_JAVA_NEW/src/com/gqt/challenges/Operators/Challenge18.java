package com.gqt.challenges.Operators;

import java.util.Scanner;

class Challenge18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("the sum of "+ n+" Numbers is "+sum);
	}
}
