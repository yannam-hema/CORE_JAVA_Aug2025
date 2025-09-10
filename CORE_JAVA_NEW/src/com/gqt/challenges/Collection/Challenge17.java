package com.gqt.challenges.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Challenge17 {
public static void main(String[] args) {
	Vector<String > v = new Vector<String>();
	v.add("bengaluru");
	v.add("hyderabad");
	v.add("vizag");
	v.add("mumbai");
	Enumeration<String> e = v.elements();
	System.out.println("Iterating ...");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
