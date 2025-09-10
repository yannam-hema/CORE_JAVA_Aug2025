package com.gqt.challenges.Collection;

import java.util.HashSet;

public class Challenge3 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("one");
	hs.add("two");
	hs.add("one");
	hs.add("three");
	System.out.println(hs);// Hash set doesn't allow duplicates
	hs.remove("two");
	for(String s : hs) {
		System.out.print(s+" ");
	}
}
}
