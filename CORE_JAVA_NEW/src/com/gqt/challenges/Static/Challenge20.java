package com.gqt.challenges.Static;

import java.util.Scanner;

public class Challenge20 {
	public static int conversion(int a) {
        return (int)((a - 32) * (5.0 / 9.0));
    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temp : ");
	int temp=sc.nextInt();
	System.out.println(conversion(temp));
}
}
