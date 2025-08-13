package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge20 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    double area=Math.PI*r*r;
    double circumference=2*Math.PI*r;
    System.out.println("Area of  a circle "+ area);
    System.out.println("perimeter of a circle "+circumference);
	}
}
