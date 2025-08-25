package com.gqt.challenges.OverLoading;
class Minimum{
	int min(int a , int b) {
		if(a<b) return a;
		else return b;
	}
	float min(float a , float b) {
		if(a<b) return a;
		else return b;
	}
	double min(double a , double b) {
		if(a<b) return a;
		else return b;
	}
}
public class MinimumOfNumbers {
public static void main(String[] args) {
	Minimum obj = new Minimum();
	System.out.println(obj.min(56, 78));
	System.out.println(obj.min(5.789,9.4567));
	System.out.println(obj.min((float)2.31, (float)7.34));
}
}
