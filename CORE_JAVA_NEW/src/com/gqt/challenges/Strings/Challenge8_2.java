package com.gqt.challenges.Strings;

import java.util.Scanner;

//convert lower case letters into upper case letters
public class Challenge8_2 {
	public static boolean isLower(char c) {
		if(c>='a' && c<='z') {
			return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(isLower(c)==true) {
				sb.append((char)(c-32));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
