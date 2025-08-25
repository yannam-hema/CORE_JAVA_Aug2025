package com.gqt.challenges.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Challenge21 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str= sc.nextLine();
      StringBuilder sb = new StringBuilder();
      HashMap<Character,Integer> mp = new HashMap<>();
      for(int i=0;i<str.length();i++) {
    	 mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1); 
      }
      for(int i=0;i<str.length();i++) {
    	  if((mp.get(str.charAt(i))==1)) {
    		 sb.append(str.charAt(i)); 
    	  }
    	  else if(mp.get(str.charAt(i))>1){
    		 mp.put(str.charAt(i), mp.get(str.charAt(i))-1); 
    	  }
      }
      System.out.println("String after deleting the repeated characters "+sb.toString());
        sc.close();
	}

}
