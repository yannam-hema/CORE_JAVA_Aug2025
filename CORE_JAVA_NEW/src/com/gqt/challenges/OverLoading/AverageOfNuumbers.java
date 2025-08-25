package com.gqt.challenges.OverLoading;

class Average{
	int average(int n1, int n2 ,int n3) {
		return ((n1+n2+n3)/3);
	}
	float average(float n1, float n2 , float n3) {
		return ((n1+n2+n3)/3);
	}
	double average(double n1, double n2 , double n3) {
		return ((n1+n2+n3)/3);
	}
}
public class AverageOfNuumbers {
public static void main(String[] args) {
	Average avg= new Average();
	System.out.println(avg.average(12, 24, 36));
	System.out.println(avg.average((float)2.3, (float)5.6, (float)6.7));
	System.out.println(avg.average(5.678, 67.234567, 89.123456789));
}
}
