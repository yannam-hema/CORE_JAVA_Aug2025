package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.contains(s2)) {
			System.out.println("Yes! s2 substring of s1");
		}
		else {
			System.out.println("s2 is NOT substring of s1");			
		}
	}

}
