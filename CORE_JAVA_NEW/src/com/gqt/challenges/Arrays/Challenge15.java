package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge15 {
   public static int FindIndex(int[] a, int n, int ele) {
      for(int i = 0; i < n; i++) {
         if (a[i] == ele) {
            return i;
         }
      }

      return -1;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements in an array");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array elements");

      for(int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      System.out.println("Enter the element to find");
      int ele = sc.nextInt();
      int index = FindIndex(arr, n, ele);
      if (index == -1) {
         System.out.println("Element not found");
      } else {
         System.out.println("Element found at index " + index);
      }

   }
}
