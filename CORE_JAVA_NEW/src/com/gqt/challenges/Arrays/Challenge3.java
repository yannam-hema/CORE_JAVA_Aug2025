package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge3 {
   public static int[] copyEle(int[] a) {
      int len = a.length;
      int[] newArray = new int[len];

      for(int i = 0; i < len; ++i) {
         newArray[i] = a[i];
      }

      return newArray;
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

      int[] newArray = copyEle(arr);
      System.out.println("new Array Elements");

      for(int i = 0; i < n; ++i) {
         System.out.print(newArray[i] + " ");
      }

      sc.close();
   }
}
