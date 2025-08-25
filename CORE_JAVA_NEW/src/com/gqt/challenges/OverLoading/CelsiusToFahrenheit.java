package com.gqt.challenges.OverLoading;

class CtoF{
	 int conversion(int a) {
	        return (int)(a * (9.0 / 5.0) + 32);
	    }
	    float conversion(float a) {
	        return (float)(a * (9.0 / 5.0) + 32);
	    }
	    double conversion(double a) {
	        return (a * (9.0 / 5.0) + 32);
	    }
}
public class CelsiusToFahrenheit {
public static void main(String[] args) {
	CtoF obj = new CtoF();
	System.out.println(obj.conversion(0));
	System.out.println(obj.conversion(100));
	System.out.println(obj.conversion((float)99.1234567));
	System.out.println(obj.conversion(78.12345678912345));
}
}
