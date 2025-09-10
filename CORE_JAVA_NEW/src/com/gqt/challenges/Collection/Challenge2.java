package com.gqt.challenges.Collection;

import java.util.LinkedList;

public class Challenge2 {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList();
	ll.add(5);
	ll.add(67);
	ll.add(100);
	System.out.println(ll);
	ll.remove(1);
	System.out.println(ll);
	for(int i:ll) {
		System .out.print(i +" ");
	}
}
}
