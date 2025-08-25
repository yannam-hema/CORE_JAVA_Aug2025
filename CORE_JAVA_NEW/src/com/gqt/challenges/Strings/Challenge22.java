package com.gqt.challenges.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Challenge22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	String s2= sc.next();
	HashSet<Character> hs = new HashSet<>();
	ArrayList<Character> ls = new ArrayList<>();
	for(int i=0;i<s1.length();i++) {
		hs.add(s1.charAt(i));
	}
	for(int i=0;i<s2.length();i++) {
		if(hs.contains(s2.charAt(i))) {
			ls.add(s2.charAt(i));
			hs.remove(s2.charAt(i));
		}
	}
	System.out.print("Characters are present in both strings :");
	for(char j : ls) {
		System.out.print(j+" ");
	}
}
}
