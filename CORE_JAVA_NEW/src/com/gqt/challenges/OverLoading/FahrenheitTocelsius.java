package com.gqt.challenges.OverLoading;
class FtoC{
	 int conversion(int a) {
	        return (int)((a - 32) * (5.0 / 9.0));
	    }
	    float conversion(float a) {
	        return (float)((a - 32) * (5.0 / 9.0));
	    }
	    double conversion(double a) {
	        return (a - 32) * (5.0 / 9.0);
	    }
}
public class FahrenheitTocelsius {
	public static void main(String[] args) {
		FtoC obj = new FtoC();
		System.out.println(obj.conversion(98));
		System.out.println(obj.conversion((float)99.1234567));
		System.out.println(obj.conversion(123.12345678912345));
	}
}
