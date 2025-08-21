package com.gqt.challenges.Arrays;

import java.util.Scanner;

public class Challenge10 {
   public static boolean checkPlaindrome(int[] arr) {
      int n = arr.length;

      for(int i = 0; i < n / 2; ++i) {
         if (arr[i] != arr[n - i - 1]) {
            return false;
         }
      }

      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements in an aarray");
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
      }

      boolean result = checkPlaindrome(arr);
      if (result) {
         System.out.println("Yes!!! It is a Palindrome!!!");
      } else {
         System.out.println("NOT a Palindrome!!!");
      }

   }
}
