package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		double avg=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("Average of elements in Array "+avg);
	}

}
