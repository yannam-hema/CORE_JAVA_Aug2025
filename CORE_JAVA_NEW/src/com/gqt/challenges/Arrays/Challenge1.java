package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge1 {
   public static int sumEle(int[] a) {
      int len = a.length;
      int sum = 0;

      for(int i = 0; i < len; ++i) {
         sum += a[i];
      }

      return sum;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("enter elements");

      int result;
      for(result = 0; result < n; ++result) {
         arr[result] = sc.nextInt();
      }

      result = sumEle(arr);
      System.out.println("Sum of elements in array : " + result);
      sc.close();
   }
}
