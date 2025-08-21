package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge18 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array :");
	int n=sc.nextInt();
	int arr1[]= new int[n];
	System.out.println("enter array 1 elements");
	for(int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
	}
	int arr2[]= new int[n];
	System.out.println("enter array 2 elements");
	for(int i=0;i<n;i++) {
		arr2[i]=sc.nextInt();
	}
	boolean equal=true;
	for(int i=0;i<n;i++) {
		if(arr1[i]!=arr2[i]) {
			equal=false;
			break;
		}
	}
	if(equal==true) {
		System.out.println("Yes Both arrays are equal");
	}
	else {
		System.out.println("NO Both arrays are NOT equal");
	}
}
}
