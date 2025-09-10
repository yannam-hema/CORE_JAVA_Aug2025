package com.gqt.challenges.ExceptionHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Challenge20 {
public static void main(String[] args) {
	String pattern = "(a-z";
	String name="hema";
	try {
		Pattern p =  Pattern.compile(pattern);
		Matcher m = p.matcher(name);
	}catch (PatternSyntaxException e) {
		System.out.println(e);
	}
}
}
