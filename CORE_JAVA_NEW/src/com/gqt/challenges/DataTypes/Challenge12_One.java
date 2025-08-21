package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge12_One {
	//String to integer
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String consists of Numbers");
 String str=sc.nextLine();
 int num=0;
 for(int i=0;i<str.length();i++) {
	num=num*10+(str.charAt(i)-'0'); 
 }
 System.out.println("String converted into number "+num);
}
}
