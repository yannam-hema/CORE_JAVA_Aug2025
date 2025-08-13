package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge13 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  while(a>0 && b>0) {
		  if(a>b) {
			  int rem=a%b;
			  a=rem;
		  }
		  else {
			  int rem=b%a;
			  b=rem;
		  }
	  }
	  if(b>0) {
		  System.out.println("GCD of two numbers "+b);
	  }
	  else {
		  System.out.println("GCD of two numbers "+a); 
	  }
	}

}
