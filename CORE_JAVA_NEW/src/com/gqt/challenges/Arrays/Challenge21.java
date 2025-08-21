package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge21 {
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
     
     int rowSum[]= new int[n];
     int colSum[]= new int[m];
     
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<m;j++) {
    		 rowSum[i]+=arr[i][j];
    		 colSum[j]+=arr[i][j];
    	 }
     }
     System.out.println("Each Row sum ");
     for(int i=0;i<n;i++) {
    	System.out.print(rowSum[i]+" "); 
     }
     System.out.println();
     System.out.println("Each col sum ");
     for(int i=0;i<m;i++) {
    	System.out.print(colSum[i]+" "); 
     }
	}
}
