package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge13 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter String 1");
	 String str1=sc.nextLine();
	 int n=str1.length();
	 System.out.println("Enter String 2");
	 String str2=sc.nextLine();
	 int m=str2.length();
	 int i = str1.indexOf('e');
	 System.out.println("The Index of character 'e' is = "+i);
	 String subStr=str1.substring(1, n-1);
	 System.out.println("Substring of a string from index 1 to n-2 = "+subStr);
	 if(str1.equals(str2)) {
		 System.out.println("Strings are equal");
	 }
	 else {
		 System.out.println("Strings are not equal");
	 }
}
}
