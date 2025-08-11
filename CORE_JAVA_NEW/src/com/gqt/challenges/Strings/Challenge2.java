package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
        	res=res+str.charAt(i);
        }
        if(str.equals(res)) {
        	System.out.println("Palindrome!!");
        }
        else {
        	System.out.println("Not a Palindrome");
        }
        sc.close();
	}
}
