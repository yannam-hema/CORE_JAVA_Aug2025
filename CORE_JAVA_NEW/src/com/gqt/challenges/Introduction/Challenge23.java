package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge23 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int factorsSum=0;
	 for(int i=1;i<n;i++) {
		 if(n%i==0) {
			 factorsSum+=i;
		 }
	 }
	 if(n==factorsSum) {
		 System.out.println("It is a perfect number");
	 }
	 else {
		 System.out.println("Not a perfect Number");
	 }
	}
}
