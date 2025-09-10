package com.gqt.challenges.ExceptionHandling;

public class Challenge8 {
public static void main(String[] args) {
	int i=1;
	try {
	while(i>0) {
		System.out.println("Hema");
		i++;
	}
	}catch (StackOverflowError e) {
		System.out.println(e);
	}
}
}
