package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge21 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter first side of a triangle:");
    double n1 = sc.nextDouble();
    System.out.println("Enter second side of a triangle:");
    double n2 = sc.nextDouble();
    System.out.println("Enter third side of a triangle:");
    double n3 = sc.nextDouble();
    
    if((n1+n2)>n3 && (n2+n3)>n1 && (n1+n3)>n2) {
    double s=(n1+n2+n3)/2;
    
    double area=Math.sqrt(s*(s-n1)*(s-n2)*(s-n3));
    
    System.out.println("Area of Triangle usinh heron's Farmula "+area);
    }
    else {
    	System.out.println("Trianle can't be formed with these sides");
    }
	
}
}
