package com.gqt.challenges.Collection;

import java.util.Hashtable;

public class Challenge14 {
public static void main(String[] args) {
	Hashtable<String, String > ht = new Hashtable<String, String>();
	ht.put("rain", "clouds");
	ht.put("fruits", "flowers");
	ht.put("plant", "seed");
	ht.put("pen", "ink");
	System.out.println(ht);
	System.out.println("After deleting :");
	ht.remove("pen");
	System.out.println(ht);
	System.out.println("iterating ..");
	for(String s : ht.keySet()) {
		System.out.print(ht.get(s)+ " -->" + s);
		System.out.println();
	}
}
}
