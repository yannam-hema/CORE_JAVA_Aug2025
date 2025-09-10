package com.gqt.challenges.Collection;

import java.util.LinkedHashMap;

public class Challenge7 {
public static void main(String[] args) {
	LinkedHashMap<String, String> hp = new LinkedHashMap<String, String>();
	hp.put("hema" , "A+");
	hp.put("lahari", "A++");
	hp.put("hari", "A++");
	hp.put("Ramani", "A");
	hp.put("Ravi", "A++");
	System.out.println(hp);
	hp.remove("hema");
	System.out.println("After deleting");
	System.out.println(hp);
	System.out.println("Iterating");
	for(String s: hp.keySet()) {
		System.out.println(s+ " :" +hp.get(s));
	}
}
}
