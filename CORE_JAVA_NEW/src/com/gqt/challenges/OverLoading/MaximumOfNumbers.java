package com.gqt.challenges.OverLoading;
class maximum{
	int max(int a , int b) {
		if(a>b) return a;
		else return b;
	}
	float max(float a , float b) {
		if(a>b) return a;
		else return b;
	}
	double max(double a , double b) {
		if(a>b) return a;
		else return b;
	}
}
public class MaximumOfNumbers {
public static void main(String[] args) {
	maximum obj = new maximum();
	System.out.println(obj.max(56, 78));
	System.out.println(obj.max(5.789,9.4567));
	System.out.println(obj.max((float)2.31, (float)7.34));
}
}
