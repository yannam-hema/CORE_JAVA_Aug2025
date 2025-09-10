package com.gqt.challenges.ExceptionHandling;

import java.util.List;

public class Challenge14 {
public static void main(String[] args) {
	try {
	List l = List.of("hema", "hari");
	l.add("lahari");
	}catch (UnsupportedOperationException e) {
		System.out.println(e);
	}
}
}
