package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("enter the string (it allow spaces also )");
		String str= sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
