package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.print(n+" X "+i+" = "+(n*i));
			System.out.println();
		}
	}
}
