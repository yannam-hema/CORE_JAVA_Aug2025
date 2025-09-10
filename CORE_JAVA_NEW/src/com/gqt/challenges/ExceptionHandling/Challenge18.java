package com.gqt.challenges.ExceptionHandling;

import java.io.FilePermission;

public class Challenge18 {
	public static void filePermission() throws SecurityException {
		FilePermission fp = new FilePermission("challenge1", "read");
		throw new SecurityException("Access is denied");	
	}
public static void main(String[] args) {
	try {
filePermission();
	}catch (SecurityException e) {
		System.out.println(e);
	}
}
}
