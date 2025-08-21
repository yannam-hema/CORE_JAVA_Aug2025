package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge2 {
   public static void LargeAndSmallEle(int[] a) {
      int len = a.length;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i < len; ++i) {
         if (a[i] > max) {
            max = a[i];
         }

         if (a[i] < min) {
            min = a[i];
         }
      }

      System.out.println("largest element in array is " + max);
      System.out.println("Smallest element in array is " + min);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("enter elements");

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      LargeAndSmallEle(arr);
      sc.close();
   }
}
