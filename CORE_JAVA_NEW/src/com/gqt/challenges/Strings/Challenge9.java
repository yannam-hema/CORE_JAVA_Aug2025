package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		int max=0;
		StringBuilder sb = new StringBuilder();
		StringBuilder res= new StringBuilder();
		for(int i=0;i<n;i++) {
		  if(str.charAt(i)==' ') {
			  if(sb.length()>max) {
			  max=sb.length();
			  res=new StringBuilder(sb.toString());
			  }
			  sb.setLength(0);
		  }
		  else {
			  sb.append(str.charAt(i));
		  }
		  
		}
		
		if(sb.length()>max) {
		max=sb.length();
		res=new StringBuilder(sb.toString());
		}
		
		System.out.println("Longest Word in the String " + res+" and it's length is- "+max);
		sc.close();
		
	}
}



// use new StringBuilder while assigning string if not it might get error