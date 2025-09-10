package com.gqt.challenges.Collection;

import java.util.ArrayDeque;

public class Challenge11 {
public static void main(String[] args) {
	//both queue and stack functionalities
	ArrayDeque<String > ad = new ArrayDeque<>();
	ad.add("hello");
	ad.add("world");
	ad.push("hi");
	ad.push("hey");
	System.out.println(ad);
	System.out.println("After deletion");
	ad.poll();
	System.out.println(ad);
	System.out.println("iterating");
	for(String s: ad) {
		System.out.print(s+" ");
	}
}
}
