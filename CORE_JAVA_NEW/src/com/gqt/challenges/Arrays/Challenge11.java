package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge11 {
   public static long sumOfPositive(int[] arr, int n) {
      long sum = 0;

      for(int i = 0; i < n; ++i) {
         if (arr[i] > 0) {
            sum += (long)arr[i];
         }
      }

      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements in an aarray");
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      long result = sumOfPositive(arr, n);
      System.out.println("sum of the postive numbers " + result);
   }
}
