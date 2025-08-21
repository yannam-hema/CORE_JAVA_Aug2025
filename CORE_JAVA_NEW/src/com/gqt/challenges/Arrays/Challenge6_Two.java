package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge6_Two {
   public static int[] InsertionSort(int[] a) {
      int n = a.length;

      for(int i = 0; i < n - 1; ++i) {
         int max = i;

         int temp;
         for(temp = i + 1; temp < n; ++temp) {
            if (a[temp] > a[max]) {
               max = temp;
            }
         }

         if (i != max) {
            temp = a[i];
            a[i] = a[max];
            a[max] = temp;
         }
      }

      return a;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of  Array elements");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the  Array elements");

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      int[] ascArray = InsertionSort(arr);
      System.out.println("After Sorting elements");

      for(int i = 0; i < n; ++i) {
         System.out.print(ascArray[i] + " ");
      }

      sc.close();
   }
}
