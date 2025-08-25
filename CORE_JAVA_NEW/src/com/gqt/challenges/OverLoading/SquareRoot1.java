package com.gqt.challenges.OverLoading;

class squareroot{
	void sqrt(int n) {
		System.out.println(Math.sqrt(n));
	}
	void sqrt(float n) {
		System.out.println(Math.sqrt(n));
	}
	void sqrt(double n) {
		System.out.println(Math.sqrt(n));
	}
}
public class SquareRoot1 {
public static void main(String[] args) {
squareroot sq= new squareroot();
sq.sqrt(8);
sq.sqrt((float)49.567);
sq.sqrt(345.2345678);
}
}
