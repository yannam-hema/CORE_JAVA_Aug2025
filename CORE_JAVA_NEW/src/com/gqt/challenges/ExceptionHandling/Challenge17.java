package com.gqt.challenges.ExceptionHandling;

public class Challenge17 {
	public static void validateAge(int a) throws IllegalArgumentException{
		if(a<18) {
			throw new IllegalArgumentException("Age is below than we expected");
		}
		else {
			System.out.println("Welcome !!");
		}
	}
public static void main(String[] args) {
int x=24;
int y=13;
try {
	validateAge(x);
	validateAge(y);
}catch (IllegalArgumentException e) {
	System.out.println(e);
}
}
}
