package com.gqt.challenges.OverLoading;

class sumExample2{
	float add(float n1 , float n2) {
		return (n1+n2);
	}
	float add(float n1 , float n2 , float n3 , float n4) {
		return (n1+n2+n3+n4);
	}
}
public class SumOfFloatNumbers {
public static void main(String[] args) {
	sumExample2 ob = new sumExample2();
	System.out.println(ob.add((float)7.8, (float)9.76));
	System.out.println(ob.add((float)7.8, (float)9.76, (float)8.76 , (float)9.34));
}
}
