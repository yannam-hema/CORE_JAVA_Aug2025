package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge14 {
   public static void SecondLargeAndSmall(int[] arr, int n) {
      int max = Integer.MIN_VALUE;
      int smax = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int smin = Integer.MAX_VALUE;

      for(int i = 0; i < n; ++i) {
         if (arr[i] > max) {
            smax = max;
            max = arr[i];
         }

         if (arr[i] < min) {
            smin = min;
            min = arr[i];
         }

         if (arr[i] > smax && arr[i] < max) {
            smax = arr[i];
         }

         if (arr[i] < smin && arr[i] > min) {
            smin = arr[i];
         }
      }

      System.out.println("Second largest ele in the array " + smax);
      System.out.println("Second smallest ele in the array " + smin);
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

      SecondLargeAndSmall(arr, n);
   }
}
