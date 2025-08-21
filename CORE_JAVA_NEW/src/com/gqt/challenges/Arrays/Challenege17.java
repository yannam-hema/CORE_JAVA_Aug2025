package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenege17 {
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
        
        // Spiral Traversal
        System.out.println("Spiral Representation of matrix:");
        int top = 0, bottom = n-1, left = 0, right = m-1;
        
        while(left <= right && top <= bottom) {
            
            // Top row (left → right)
            for(int i=left; i<=right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            
            // Right column (top → bottom)
            for(int i=top; i<=bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            
            // Bottom row (right → left)
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            
            // Left column (bottom → top)
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
