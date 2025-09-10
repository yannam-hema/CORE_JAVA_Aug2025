package com.gqt.challenges.Collection;

import java.util.Vector;

public class Challenge16 {
public static void main(String[] args) {
	Vector<String > v = new Vector<String>();
	v.add("bengaluru");
	v.add("hyderabad");
	v.add("vizag");
	v.add("mumbai");
	System.out.println(v);
	v.remove("mumbai");
	System.out.println("After deleting :");
	System.out.println(v);
	System.out.println("Iterating ....");
	for(String s: v) {
		System.out.print(s+" ");
		System.out.println();
	}
}
}
