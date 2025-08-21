package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge20 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  
     System.out.println("Enter rows and columns of a matrix:");
     int n = sc.nextInt();
     int m = sc.nextInt();
     
     int arr[][] = new int[n][m];
     System.out.println("Enter the matrix elements:");
     for(int i=0;i<n;i++) {
         for(int j=0;j<m;j++) {
             arr[i][j] = sc.nextInt();
         }
     }
     
     int sum=0;
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<m;j++) {
    		 if(i>=j) {
    			 sum+=arr[i][j];
    		 }
    	 }
     }
     System.out.println("Sum of lower triangular matrix elements "+sum);
	}
}
