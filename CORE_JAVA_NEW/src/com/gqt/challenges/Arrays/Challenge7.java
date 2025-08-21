package com.gqt.challenges.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Challenge7 {
   public static void freqArray(int[] a, int n) {
      int maxele = a[0];
      HashSet<Integer> st = new HashSet();
      for(int i = 1; i < n; ++i) {
         if (a[i] > maxele) {
            maxele = a[i];
         }
         st.add(a[i]);
      }
      int[] freq = new int[maxele + 1];

      for(int i = 0; i < n; ++i) {
         freq[a[i]]++;
         st.add(a[i]);
      }
      
      for(int j : st) {
    	  System.out.print("frequency of " + j + "  is " + freq[j]);
          System.out.println();
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of Array elements");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the Array elements");

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      freqArray(arr, n);
      sc.close();
   }
}
