package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        int start = Math.max(n1, n2);
        int result = 0;
        while (true) {
            if (start % n1 == 0 && start % n2 == 0) { 
                result = start;
                break;
            }
            start++;
        }
        System.out.println("LCM of those numbers: " + result);
        sc.close();
    }
}
