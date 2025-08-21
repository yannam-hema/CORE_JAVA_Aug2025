package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int n=s.length();
	int sum=0;
	int p=0;
	for(int i=n-1;i>=0;i--) {
		if(s.charAt(i)=='1') {
		sum+=(int)Math.pow(2, p);
		}
		p++;
	}
	System.out.println(sum);
	sc.close();
}
}
