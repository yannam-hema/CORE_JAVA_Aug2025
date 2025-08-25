package com.gqt.challenges.Operators;

class SI{
	void calculate(int p, int t, int r) {
        System.out.println((p*t*r)/100.0);
    }
    void calculate(int p, float t, int r) {
    	System.out.println((p*t*r)/100.0);
    }
}
public class SimpleInterest {
public static void main(String[] args) {
SI obj = new SI();
obj.calculate(20000,3,2);
obj.calculate(20000,(float)7.5,5);
}
}
