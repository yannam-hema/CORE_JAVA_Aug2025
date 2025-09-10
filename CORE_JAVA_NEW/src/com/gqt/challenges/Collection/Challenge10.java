package com.gqt.challenges.Collection;

import java.util.Stack;

public class Challenge10 {
public static void main(String[] args) {
Stack<Integer> st = new Stack<Integer>();
st.add(21);
st.add(11);
st.add(89);
System.out.println(st);
System.out.println("after deletion");
st.pop();
System.out.println(st);
System.out.println("Iterating");
for(int i: st) {
	System.out.print(i+" ");
}
}
}
