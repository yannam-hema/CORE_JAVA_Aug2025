package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int new_n=n;
		int len=0;
	    while(m>0) {
	    	len++;
	    	m=m/10;
	    }
	    int sum=0;
	    while(new_n>0) {
	    	int d=new_n%10;
	    	sum+=(int)Math.pow(d,len);
	    	new_n=new_n/10;
	    }
	    if(n==sum) {
	    	System.out.println("Armstrong Number");
	    }
	    else {
	    	System.out.println("NOT a Armstrong Number");
	    }
	}
}
