package com.gqt.challenges.Introduction;
//prime number
import java.util.Scanner;

public class Challenge4 {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		else if(n==2 || n==3) {
			return false;
		}
		else if(n%2==0 || n%3==0) {
			return false;
		}
		int a=5;
		int b=7;
		while(a*a<=n) {
			if(n%a==0 || n%b==0) {
				return false;
			}
			a++;
			b++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(n)==true) {
			System.out.println("Yes!!!! Prime");
		}
		else {
			System.out.println("NOT a  Prime");
		}
		sc.close();
	}

}
