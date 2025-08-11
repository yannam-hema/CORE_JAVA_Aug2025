package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean numbers=true;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9')) {
			  numbers=false;
			  break;
			}
		}
		if(numbers==true) {
			System.out.println("String contain ONLY numbers");
		}
		else {
			System.out.println("String contain other than numbers");
		}
	}

}
