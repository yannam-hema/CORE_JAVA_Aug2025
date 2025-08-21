package com.gqt.challenges.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Challenge9 {
   public static void intersectionOfArrays(int[] a, int[] b, int n, int m) {
      HashSet<Integer> st = new HashSet();
      int[] newArr = new int[n];
      int k = 0;
      for(int i = 0; i < n; ++i) {
         st.add(a[i]);
      }

      for(int i = 0; i < m; ++i) {
         if (st.contains(b[i])) {
            newArr[k++] = b[i];
            st.remove(b[i]);
         }
      }

     for(int i=0;i<k;i++) {
    	 System.out.print(newArr[i]+" ");
     }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of  elements in Array 1 ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the Array elements");
      for(int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      System.out.println("Enter no of  elements in Array 2  ");
      int m = sc.nextInt();
      int[] arr2 = new int[m];
      System.out.println("Enter the Array elements ");

      for(int i = 0; i < m; ++i) {
         arr2[i] = sc.nextInt();
      }

      intersectionOfArrays(arr, arr2, n, m);

 

   }
}
