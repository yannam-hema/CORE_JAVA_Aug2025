package com.gqt.challenges.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int n=sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the Array Elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter K value (To find kth largest and kth smallest)");
	int k=sc.nextInt();
	Arrays.sort(arr);
    int K_Small=arr[k-1];
    int K_Largest=arr[n-k];
    
    System.out.println(k+""+"th largest = "+K_Largest +" "+ k+ ""+"th smallest = "+K_Small);
}
}
