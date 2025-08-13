package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the base of a triangle");
	double b=sc.nextDouble();
	System.out.println("enter the height of a triangle");
    double h=sc.nextDouble();
    double area=0.5*b*h;
    System.out.println("Area of a triangle "+area);
	}

}
