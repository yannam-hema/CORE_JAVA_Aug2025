package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge4 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    s=s.toLowerCase();
    int freq[]= new int[26];
    for(int i=0;i<s.length();i++) {
 	   if(s.charAt(i)>='a' && s.charAt(i)<='z') {
 	   freq[s.charAt(i)-'a']++;
 	   }
    }
    char c='a';
    for(int i=0;i<26;i++) {
 	System.out.println("occurence of "+c+" in the string is "+freq[i] );
 	c++;
    }
    sc.close();
	}
}
