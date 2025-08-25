package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int n=sc.nextInt();
		System.out.println("Enter the col size");
		int m=sc.nextInt();
		int arr[][]= new int[n][m];
		System.out.println("Enter the matrix elements");
		for(int i=0;i<n;i++) {
			for(int j=0 ;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int res[][]= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0 ;j<m;j++) {
			res[i][j]=arr[j][i];
			}
		}
		
		System.out.println("After Transponse");
		for(int i=0;i<n;i++) {
			for(int j=0 ;j<m;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
