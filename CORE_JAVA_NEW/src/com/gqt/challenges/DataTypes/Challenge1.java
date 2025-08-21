package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Integer Value: ");
	int n=sc.nextInt();
	System.out.println("Enter Long Value: ");
	long l=sc.nextLong();
	System.out.println("Enter Float Value: ");
	float f =sc.nextFloat();
	System.out.println("Enter Double Value: ");
	double d =sc.nextDouble();
	
	System.out.println("Integer Value = "+ n + " "+"Long Value = "+ l + " " 
			+"Float Value = "+ f + " "+"Double Value = "+ d);
}
}
