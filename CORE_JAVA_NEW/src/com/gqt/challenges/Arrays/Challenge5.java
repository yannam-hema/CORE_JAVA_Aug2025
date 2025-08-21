package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge5 {
   public static int[] ReverseArray(int[] a) {
      int len = a.length;

      for(int i = 0; i < len / 2; ++i) {
         int temp = a[i];
         a[i] = a[len - i - 1];
         a[len - i - 1] = temp;
      }

      return a;
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

      int[] result = ReverseArray(arr);
      System.out.println("After reversing elements");

      for(int i = 0; i < result.length; ++i) {
         System.out.print(result[i] + " ");
      }

      sc.close();
   }
}
