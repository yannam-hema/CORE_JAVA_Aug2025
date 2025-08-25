package com.gqt.challenges.DataTypes;

import java.math.BigInteger;

public class Challenge19 {
public static void main(String[] args) {
		int n=25;
		BigInteger b = BigInteger.ONE;
	while(n>0) {
	  b= b.multiply(BigInteger.valueOf(n));
		n--;
	}
	System.out.println(b);
}
}
