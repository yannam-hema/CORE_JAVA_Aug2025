package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements");
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();	
		}
		System.out.println("Enter how many places to rotate");
		int k=sc.nextInt();
		
		int newArr[]= new int[n];
		int j=0;
		for(int i=k;i<n;i++) {
			newArr[j++]=arr[i];
		}
		for(int i=0;i<k;i++) {
			newArr[j++]=arr[i];
		}
		System.out.println("Rotated Array");
		
		for(int i=0;i<n;i++) {
		 System.out.print(newArr[i]+" ");
		}
	}

}
