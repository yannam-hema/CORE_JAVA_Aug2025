package com.gqt.challenges.Collection;

import java.util.BitSet;

public class Challenge13 {
public static void main(String[] args) {
	BitSet b = new BitSet();
	b.set(1);
	b.set(4);
	b.set(8);
	System.out.println(b);
	b.clear(4);
	System.out.println(b);
	System.out.println("iterating :");
	for( int i=b.nextSetBit(0);i>=0;i=b.nextSetBit(i+1)) {
		System.out.print(i +" ");
	}
}
}
