package com.gqt.challenges.OverLoading;
class SumExample{
	int add(int n1, int n2) {
		return n1+n2;
	}
	int add(int n1, int n2 , int n3) {
		return n1+n2+n3;
	}
}
public class SumOfIntegers {
public static void main(String[] args) {
	SumExample ob = new SumExample();
	System.out.println(ob.add(9, 91));
	System.out.println(ob.add(9, 12, 8));
}
}
