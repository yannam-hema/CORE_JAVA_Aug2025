package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge15 {
	
	public static String reverse(String s) {
		int n=s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=n-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str= sc.nextLine();
      int n=str.length();
      StringBuilder sb = new StringBuilder();
      StringBuilder result = new StringBuilder();
      for(int i=0;i<n;i++) {
    	if(str.charAt(i)==' ') {
    	String word=reverse(sb.toString());
    	result.append(word);
    	result.append(" ");
    	sb.setLength(0);
    	}
    	else {
    		sb.append(str.charAt(i));
    	}
      }
      String word=reverse(sb.toString());
      result.append(word);
      System.out.println(result.toString());
      sc.close();
	}

}
