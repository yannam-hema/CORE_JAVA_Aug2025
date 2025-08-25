package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	double x=sc.nextDouble();
	double y=sc.nextDouble();
	System.out.println("float sum = "+(a+b));
	System.out.println("float subtraction = "+(a-b));
	System.out.println("float multiply = "+(a*b));
	System.out.println("float division = "+(a/b));
	System.out.println("double sum = "+(x+y));
	System.out.println("double subtarction = "+(x-y));
	System.out.println("double multiply = "+(x*y));
	System.out.println("double division = "+(x/y));
}
}
