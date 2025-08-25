package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String combined=s1+s1;
		if(combined.contains(s2)) {
			System.out.println("Yes! s2 rotation of s1");
		}
		else {
			System.out.println("s2 NOT rotation of s1");			
		}
	}

}
