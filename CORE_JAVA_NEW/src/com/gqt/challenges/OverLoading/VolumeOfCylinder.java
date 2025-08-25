package com.gqt.challenges.OverLoading;
class CylinderVolume{
	static final float pi=(float)Math.PI;
	double volume(int r , int h) {
		return pi*r*r*h;
	}
	double volume(float r , int h) {
		return pi*r*r*h;
	}
	double volume(float r , float h) {
		return pi*r*r*h;
	}
}
public class VolumeOfCylinder {
public static void main(String[] args) {
	CylinderVolume obj = new CylinderVolume();
	System.out.println(obj.volume((float)9.78, (float)8.63));
	System.out.println(obj.volume((float)9.78, 8));
	System.out.println(obj.volume(6,9));
}
}
