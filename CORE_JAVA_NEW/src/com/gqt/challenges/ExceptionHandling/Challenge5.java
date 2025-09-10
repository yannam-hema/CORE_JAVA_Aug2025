package com.gqt.challenges.ExceptionHandling;

public class Challenge5 {
public static void main(String[] args) {
	try {
	String str="1234q";
	System.out.println((Integer.parseInt(str)));
	}catch (NumberFormatException e) {
		System.out.println(e);
	}
}
}
