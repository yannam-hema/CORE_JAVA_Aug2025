package com.gqt.challenges.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		char result=' ';
		HashMap<Character, Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++) {
			mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
		}
		
		for(int i=0;i<n;i++) {
			if(mp.get(str.charAt(i))==1) {
				result=str.charAt(i);
				break;
			}
		}
		if(result==' ') {
		System.out.println("All characters are repeated");
		}
		else {
		System.out.println("The non-Repeated character is :- "+ result);
		}
	}
}
