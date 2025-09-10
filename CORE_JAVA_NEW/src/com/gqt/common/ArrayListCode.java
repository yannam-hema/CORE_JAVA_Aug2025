package com.gqt.common;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArrayListCode {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	ArrayList al2 = new ArrayList();
	al.add(30);
	al.addFirst(89);
	al.add(87);
	al2.add(986);
	al2.add(65);
	al2.add(780);
	al2.add(al2);
	al.remove(0);
	al.remove(al2);
	LinkedList ll = new LinkedList();
	ll.add(89);
	PriorityQueue pq = new PriorityQueue();
	pq.add(12);
	pq.add(12);
	pq.add(89);
	pq.remove(12);
	//pq.
	System.out.println(pq);
	ArrayDeque ad = new ArrayDeque();
	//ad.
	TreeSet ts = new TreeSet();
	//ts.
	HashSet hs = new HashSet();
	//hs.
	LinkedHashSet lh = new LinkedHashSet();
	
}
}
