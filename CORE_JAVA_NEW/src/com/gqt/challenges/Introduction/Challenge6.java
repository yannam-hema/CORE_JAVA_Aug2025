package com.gqt.challenges.Introduction;

import java.util.Scanner;

//Quadratic equation = ax^2+ bx+c=0;
// to find roots first we need to find what kind of roots that equation has
// Step1:To find discriment
// if discriment value is 0 then roots are distinct and equal
// if discriment value is >0 then root are real and distinct
// if discriment value is <0 then roots are imaginery
public class Challenge6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The quadratic equation will be like ax^2+bx+c");
	System.out.println("enter a:");
	int a=sc.nextInt();
	System.out.println("enter b:");
	int b=sc.nextInt();
	System.out.println("enter c:");
	int c=sc.nextInt();
	
	double d=(b*b)- (4*a*c);
	 double r1,r2;
	if(d==0) {
	r1=r2=-b/(2.0*a);	
	System.out.println("Roots of the quadratic equation "+ r1+" , "+r2);
	}
	else if(d>0) {
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Roots of the quadratic equation "+ r1+" , "+r2);
	}
	else {
	  double x= -b/(2*a);
	  double y=Math.sqrt(-d)/(2.0*a);
	  System.out.println("Roots of the quadratic equation "+ (x+ " +i " + y)+" , "+(x+" -i "+y));
	}
}
}
