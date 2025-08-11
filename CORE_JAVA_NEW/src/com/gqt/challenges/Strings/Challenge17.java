package com.gqt.challenges.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Challenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      String str= sc.nextLine();
	      int n=str.length();
	      Set<Character> st = new HashSet<>();
	      char result =' ';
	      for(int i=0;i<n;i++) {
	    	  if(st.contains(str.charAt(i))) {
	    		  result=str.charAt(i);
	    		  break;
	    	  }
	    	  else {
	    	  st.add(str.charAt(i));
	    	  }
	      }
	      
	    
	      
	     
	      System.out.println("First Repeated Character in the String - "+ result);
	      
	}

}
