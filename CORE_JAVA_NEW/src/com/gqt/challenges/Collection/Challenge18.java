package com.gqt.challenges.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Challenge18 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList();
	al.add("hema");
	al.add("lahari");
	al.add("hari");
	ListIterator<String> it = al.listIterator();
	System.out.println("Iteration....from front");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("Iteration....from back");
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
}
}
