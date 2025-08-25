package com.gqt.challenges.OverLoading;

class SphereVolume{
	static final double pi= Math.PI;
	double volume(int r) {
		return 4.0/3.0*pi*r*r*r;
	}
	double volume(float r) {
		return 4.0/3.0*pi*r*r*r;
	}
	double volume(double r) {
		return 4.0/3.0*pi*r*r*r;
	}
}

public class VolumeOfaSphere {
public static void main(String[] args) {
	SphereVolume sv = new SphereVolume();

System.out.println(sv.volume(8.123456789));	
System.out.println(sv.volume(8));	
System.out.println(sv.volume((float)56.67));
}
}
