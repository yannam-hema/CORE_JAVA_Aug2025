package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge16 {
	public static void fibonnaciSeries(int f , int s, int n) {
		if(n<2) {
			return;
		}
		int curr=f+s;
		System.out.print(curr+" ");
		fibonnaciSeries(s,curr,n-1);	
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int f=0;
	int s=1;
	System.out.print(f+" ");
	System.out.print(s+" ");
	fibonnaciSeries(f,s,n);
}
}
