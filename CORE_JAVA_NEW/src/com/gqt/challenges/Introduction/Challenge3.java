package com.gqt.challenges.Introduction;

public class Challenge3 {
public static void main(String[] args) {
	int a=100;
	int b=200;
	System.out.println("Before swapping a = "+ a + " b = "+ b);
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("After swapping a = "+ a + " b = "+ b);
   }
}
