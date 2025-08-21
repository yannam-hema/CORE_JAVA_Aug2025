package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge8 {
   public static int[] mergeSortedArrays(int[] a, int[] b, int[] mergeArr, int n, int m, int len) {
      int i = 0;
      int j = 0;
      int k = 0;
      while(i < n && j < m) {
         if (a[i] <= b[j]) {
            mergeArr[k++] = a[i];
            i++;
         } else {
            mergeArr[k++] = b[j];
            j++;
         }
      }

      while(i < n) {
         mergeArr[k++] = a[i];
         i++;
      }

      while(j < m) {
         mergeArr[k++] = b[j];
         j++;
      }

      return mergeArr;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an Array ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the 1st Array elements (sorted)");
      for(int i = 0; i< n; i++) {
         arr[i] = sc.nextInt();
      }
      int arr2[]= new int[n];
      System.out.println("Enter the 2nd Array elements (sorted) ");
      for(int i=0;i<n;i++) {
         arr2[i] = sc.nextInt();
      }

      int newLength = 2*n;
      int[] newArray = new int[newLength];
      int[] result = mergeSortedArrays(arr, arr2, newArray, n, n, newLength);

      for(int i = 0; i < newLength; ++i) {
         System.out.print(result[i] + " ");
      }

      sc.close();
   }
}
