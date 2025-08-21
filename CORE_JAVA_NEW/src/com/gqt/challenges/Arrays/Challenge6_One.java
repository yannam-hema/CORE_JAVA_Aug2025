package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge6_One {
   public static int[] bubbleSort(int[] a) {
      int n = a.length;

      for(int i = 0; i < n; ++i) {
         for(int j = 0; j < n - i - 1; ++j) {
            if (a[j] > a[j + 1]) {
               int temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }
      }

      return a;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array size");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the Array elements");

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      int[] ascArray = bubbleSort(arr);
      System.out.println("After Sorting elements");

      for(int i = 0; i < n; ++i) {
         System.out.print(ascArray[i] + " ");
      }

      sc.close();
   }
}
