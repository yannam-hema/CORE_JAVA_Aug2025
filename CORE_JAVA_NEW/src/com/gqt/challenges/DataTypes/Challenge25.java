package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge25 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // sizes of two matrices
	        System.out.print("Enter rows of first matrix: ");
	        int n1 = sc.nextInt();
	        System.out.print("Enter cols of first matrix: ");
	        int m1 = sc.nextInt();
	        System.out.print("Enter rows of second matrix: ");
	        int n2 = sc.nextInt();
	        System.out.print("Enter cols of second matrix: ");
	        int m2 = sc.nextInt();
	        if (m1 != n2) {
	            System.out.println("Matrix multiplication not possible. (m1 must equal n2)");
	            return;
	        }
	        int mat1[][] = new int[n1][m1];
	        int mat2[][] = new int[n2][m2];
	        int res[][] = new int[n1][m2];
	        System.out.println("Enter first matrix:");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m1; j++) {
	                mat1[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter second matrix:");
	        for (int i = 0; i < n2; i++) {
	            for (int j = 0; j < m2; j++) {
	                mat2[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m2; j++) {
	                res[i][j] = 0;
	                for (int k = 0; k < m1; k++) {
	                    res[i][j] += mat1[i][k] * mat2[k][j];
	                }
	            }
	        }
	        System.out.println("Result matrix:");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m2; j++) {
	                System.out.print(res[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
