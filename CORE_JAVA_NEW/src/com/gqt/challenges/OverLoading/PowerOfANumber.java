package com.gqt.challenges.OverLoading;
class power{
	void powerFunc(int n, int p ) {
		long res=1;
		for(int i=1;i<=p;i++) {
			res*=n;
		}
		System.out.println(res);
	}
	void powerFunc(float n, int p ) {
		long res=1;
		for(int i=1;i<=p;i++) {
			res*=n;
		}
		System.out.println(res);
	}
	
	void powerFunc(double n, int p ) {
		long res=1;
		for(int i=1;i<=p;i++) {
			res*=n;
		}
		System.out.println(res);
	}
}

public class PowerOfANumber {
public static void main(String[] args) {
	power obj = new power();
	obj.powerFunc(7, 2);
	obj.powerFunc((float)6.87, 2);
	obj.powerFunc(6.123456789, 2);
}
}
