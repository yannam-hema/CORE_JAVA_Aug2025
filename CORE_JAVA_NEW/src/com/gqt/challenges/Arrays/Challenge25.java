package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge25 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int n=sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the Array Elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	int pos=0;
	int neg=0;
	int zero=0;
	
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			zero++;
		}
		else if(arr[i]>0) {
			pos++;
		}
		else {
			neg++;
		}
	}
	
	System.out.println("Positive numbers "+pos+" "+"Zero elements "+zero+" "+"Negative Elements "+neg);
	
}
}
