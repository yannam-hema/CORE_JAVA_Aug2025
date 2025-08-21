package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge12 {
   public static long sumOfnegative(int[] arr, int n) {
      long sum = 0L;

      for(int i = 0; i < n; ++i) {
         if (arr[i] < 0) {
            sum += (long)Math.abs(arr[i]);
         }
      }

      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements in an array");
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      long result = sumOfnegative(arr, n);
      System.out.println("sum of the negative numbers " + result);
   }
}
