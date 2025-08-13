package com.gqt.challenges.Introduction;

import java.util.Scanner;

public class Challenge14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
        StringBuilder sb = new StringBuilder();
        while(m>0) {
        	int rem=m%2;
        	sb.append(rem);
        	m=m/2;
        }
        System.out.println("Binary representaion of "+ n +" is " + sb.reverse());
	}

}
