package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
        	res=res+str.charAt(i);
        }
        System.out.println("Reversed String "+res);
        sc.close();
	}

}
