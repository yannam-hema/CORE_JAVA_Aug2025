package com.gqt.challenges.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Challenge8 {
public static void main(String[] args) {
	Queue<Integer> que = new LinkedList<>();
	que.add(12);
	que.add(23);
	que.add(9);
	System.out.println(que);
	System.out.println("After deletion :");
	que.remove();//remove first element
	System.out.println(que);
	for(int i: que) {
		System.out.print(i+" ");
	}
}
}
