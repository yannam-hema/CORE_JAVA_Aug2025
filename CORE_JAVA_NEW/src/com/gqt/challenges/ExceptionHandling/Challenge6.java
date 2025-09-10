package com.gqt.challenges.ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Challenge6 {
	public static void fileWriter() throws IOException {
		FileWriter fw = new FileWriter("sth.txt");
		fw.close();
		fw.write("hello! hema ");
	}
public static void main(String[] args) {
	try {
	fileWriter();
	}catch (IOException e) {
		System.out.println(e);
	}	
}
}
