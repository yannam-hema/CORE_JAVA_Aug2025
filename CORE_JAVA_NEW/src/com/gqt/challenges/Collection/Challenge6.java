package com.gqt.challenges.Collection;

import java.util.TreeMap;

public class Challenge6 {
public static void main(String[] args) {
	TreeMap<String, String> tm = new TreeMap<String, String>();
	tm.put("Andhra pradesh" , "Amaravathi");
	tm.put("karnataka", "Bengaluru");
	tm.put("Tamilnadu", "chennai");
	tm.put("Telangana", "Hyderabad");
	System.out.println(tm);
	System.out.println("After deletion: ");
	tm.remove("Tamilnadu");
	System.out.println(tm);
	System.out.println("iteration using Keyset");
	for(String s : tm.keySet()) {
		System.out.print(s +" : "+tm.get(s));
		System.out.println();
	}
}
}
