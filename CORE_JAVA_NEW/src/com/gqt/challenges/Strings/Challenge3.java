package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		str=str.toUpperCase();
		int v_cnt=0;
		int c_cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' ) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U') {
					v_cnt++;
				}
				else {
					c_cnt++;
				}
			}
		}
		
		System.out.println("Vowel count "+ v_cnt);
		System.out.println("Consonant_count"+c_cnt);
		
		sc.close();

	}

}
