package com.gqt.challenges.Strings;
//convert upperCase letters into lower Case Letters
import java.util.Scanner;

public class Challenge8 {
	public static boolean isUpper(char c) {
		if(c>='A' && c<='Z') {
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
		if(isUpper(c)==true) {
			sb.append((char)(c+32));
		}
		else {
			sb.append(c);
		}
	}
	System.out.println(sb);
	sc.close();
}
}
