package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge22 {
    public static void sumOfDigits(int n , int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        } else {
            s += (n % 10);
            n = n / 10;
            sumOfDigits(n, s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigits(n, 0);
        sc.close();
    }
}
