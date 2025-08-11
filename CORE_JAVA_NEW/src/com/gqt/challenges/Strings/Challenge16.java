package com.gqt.challenges.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      String str= sc.nextLine();
      HashMap<Character,Integer> mp = new HashMap<>();
      for(int i=0;i<str.length();i++) {
    	 mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1); 
      }
      HashSet<Character> hs= new HashSet<>();
      for(int i=0;i<str.length();i++) {
    	  if(mp.get(str.charAt(i))>1) {
    		  hs.add(str.charAt(i));
    	  }
      }
      if(hs.size()==0) {
    	 System.out.print("All characters are distinct"); 
      }
      else {
      System.out.println("The duplicate Characters are :");
      for(char i: hs) {
    	  System.out.print(i+ " ");
      }
      }
      sc.close();
	}

}
