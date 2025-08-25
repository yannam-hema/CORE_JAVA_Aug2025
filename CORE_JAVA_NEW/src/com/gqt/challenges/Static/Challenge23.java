package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge23 {
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        int result = power(base, exp);
        System.out.println(base + "^" + exp + " = " + result);
        sc.close();
    }
}
