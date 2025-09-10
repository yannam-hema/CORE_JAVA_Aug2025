package com.gqt.challenges.ExceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Challenge13 {
public static void main(String[] args) {
	ArrayList ls = new ArrayList();
	ls.add("hema");
	try {
	Iterator it =ls.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	}catch (NoSuchElementException e) {
		System.out.println(e);
	}
}
}
