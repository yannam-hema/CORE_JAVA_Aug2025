package com.gqt.challenges.Collection;

import java.util.TreeSet;

public class challenge4 {
public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(43);
	ts.add(21);
	ts.add(90);
	ts.add(2);
	System.out.println(ts);
	ts.remove(2);
	System.out.print("After deletion :");
	System.out.println(ts);
	System.out.print("Iterating :");
	for(int i : ts) {
		System.out.print(i+" ");
	}
}
}
