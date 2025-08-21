package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge17 {
    
    public static String stringReverse(String s, String r, int n) {
        if (n < 0) {
            return r;
        }
        return stringReverse(s, r + s.charAt(n), n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        String res = stringReverse(s, "", s.length() - 1);
        System.out.println("Reversed string: " + res);
        
        sc.close();
    }
}
