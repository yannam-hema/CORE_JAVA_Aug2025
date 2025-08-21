package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge13 {
   public static long productOfEle(int[] a, int n) {
      long prod = 1;

      for(int i = 0; i < n; ++i) {
         prod *= (long)a[i];
      }

      return prod;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements in an array");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array elements");

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      long result = productOfEle(arr, n);
      System.out.println("Product of elements " + result);
   }
}
