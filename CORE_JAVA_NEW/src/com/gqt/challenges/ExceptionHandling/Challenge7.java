package com.gqt.challenges.ExceptionHandling;

public class Challenge7 {
public static void main(String[] args) {
	try {
	Class.forName("something");
	}catch (ClassNotFoundException e) {
		System.out.println(e);
	}
}
}
