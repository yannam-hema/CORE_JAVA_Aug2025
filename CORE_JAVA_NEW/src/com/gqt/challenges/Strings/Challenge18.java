package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge18 {
	
	public static String Capitalize(String s) {
		String res="";
		char c=s.charAt(0);
         if(c>='a' && c<='z') {
        	 c=(char) ((char)c-32);
         }
		res+=c;
		for(int i=1;i<s.length();i++) {
			res+=s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str= sc.nextLine();
      int n=str.length();
      StringBuilder sb = new StringBuilder();
      StringBuilder result = new StringBuilder();
      for(int i=0;i<n;i++) {
    	if(str.charAt(i)==' ') {
    	String word=Capitalize(sb.toString());
    	result.append(word);
    	result.append(" ");
    	sb.setLength(0);
    	}
    	else {
    		sb.append(str.charAt(i));
    	}
      }
      String word=Capitalize(sb.toString());
      result.append(word);
      System.out.println(result.toString());
      sc.close();
	}

}
