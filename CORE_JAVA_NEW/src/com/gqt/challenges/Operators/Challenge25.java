package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge25 {
	//Armstrong without using while loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int new_n=n;
		int len=0;
		for(int i=m;i>0;i=m) {
			len++;
			m=m/10;
		}
		int number = 0;
		for(int i=new_n;i>0;i=i/10) {
			number+=(int)Math.pow(i%10,len);
		}
	
		if(number==n) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
