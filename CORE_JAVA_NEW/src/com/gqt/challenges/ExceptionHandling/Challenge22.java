package com.gqt.challenges.ExceptionHandling;

import java.util.FormatterClosedException;
import java.util.*;
public class Challenge22 {
public static void main(String[] args) {
	try {
	 Formatter formatter = new Formatter();
	 formatter.close();
	 formatter.format("helloooo", 21);
	}catch (FormatterClosedException e) {
		System.out.println(e);
	}
}
}
