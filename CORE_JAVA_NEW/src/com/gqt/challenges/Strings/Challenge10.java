package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge10 {
	public static boolean checkAnagrams(String a , String b) {
		int n=a.length();
		int m=b.length();
		if(n!=m) {
			return false;
		}
		a=a.toLowerCase();
		b=b.toLowerCase();
		int freq[]= new int[26];
		for(int i=0;i<26;i++) {
			freq[i]=0;
		}
		for(int i=0;i<n;i++) {
			freq[a.charAt(i)-'a']++;
			freq[b.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String -1");
	String str1= sc.nextLine();
	System.out.println("Enter String -2");
	String str2= sc.nextLine();
	
	if(checkAnagrams(str1,str2)==true) {
		System.out.println("They are anagrams");
	}
	else {
		System.out.println("They are NOT anagrams");
	}
}
}
