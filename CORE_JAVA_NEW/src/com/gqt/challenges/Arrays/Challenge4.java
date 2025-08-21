package com.gqt.challenges.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Challenge4 {
   public static int[] RemoveDupEle(int[] a) {
      int len = a.length;
      Set<Integer> st = new HashSet();

      for(int i= 0; i < len; i++) {
         st.add(a[i]);
      }

      int newSize = st.size();
      int k=0;
      int[] UniqueArray = new int[newSize];
      for(int j:st) {
       UniqueArray[k++]=j;
      }

      return UniqueArray;
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

      int[] result = RemoveDupEle(arr);
      System.out.println("After removing Duplicate elements");

      for(int i = 0; i < result.length; i++) {
         System.out.print(result[i] + " ");
      }

      sc.close();
   }
}
