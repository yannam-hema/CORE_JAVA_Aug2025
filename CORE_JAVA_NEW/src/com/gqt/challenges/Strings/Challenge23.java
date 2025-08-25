package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge23 {
	//panagram : string contain all alphabetic letters(at least once)
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
s=s.toLowerCase();
int freq[]= new int[26];
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
	freq[s.charAt(i)-'a']++;
	}
}
boolean panagram = true;
for(int i=0;i<26;i++) {
	if(freq[i]==0) {
		panagram=false;
		break;
	}
}
if(panagram==true) {
	System.out.println("String is Panagram");
}
else {
	System.out.println("String is NOT a panagram");
}
}
}
