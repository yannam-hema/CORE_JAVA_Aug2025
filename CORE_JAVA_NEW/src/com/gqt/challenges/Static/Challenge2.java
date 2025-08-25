package com.gqt.challenges.Static;

public class Challenge2 {
public static void main(String[] args) {
	int n=5;
	factorial(n);
}
public static void factorial(int n) {
	int res=1;
	for(int i=1;i<=n;i++) {
		res*=i;
	}
	System.out.println(res);
}
}
