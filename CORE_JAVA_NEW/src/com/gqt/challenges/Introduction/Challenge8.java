package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge8 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(first+" "+second+" ");
		for(int i=2;i<=n;i++) {
			int current=first+second;
			System.out.print(current+" ");
			first=second;
			second=current;
		}

	}

}
