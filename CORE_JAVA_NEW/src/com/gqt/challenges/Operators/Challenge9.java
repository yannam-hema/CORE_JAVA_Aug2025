package com.gqt.challenges.Operators;

import java.util.Scanner;

public class Challenge9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char c=sc.next().charAt(0);
	if(c>='a'&& c<='z' || c>='a'&& c<='z' ) {
	if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'||
	 c=='A'|| c=='E'|| c=='I'|| c=='O'||c=='U') {
		System.out.println("Character is Vowel");
	}
	else {
		System.out.println("Character is Consonant");
	}
	}
	else {
		System.out.println("It is not a character");
	}
}
}
