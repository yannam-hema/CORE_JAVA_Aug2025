package com.gqt.challenges.ExceptionHandling;

import java.util.Scanner;

public class Challenge1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size:");
	int n= sc.nextInt();
	System.out.println("Array array elemnts ");
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	try {
		System.out.println(arr[2*n]);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e +" is Handled");
	}
}
}
