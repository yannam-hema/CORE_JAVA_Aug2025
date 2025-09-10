package com.gqt.challenges.Collection;

import java.util.PriorityQueue;

public class Challenge9 {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	pq.add(23);
	pq.add(900);
	pq.add(11);
	System.out.println(pq);
	System.out.println("After deleting :");
	pq.remove(23);
	System.out.println(pq);
	System.out.println("Iterating ");
	for(int i :pq) {
		System.out.print(i+" ");
	}
}
}
