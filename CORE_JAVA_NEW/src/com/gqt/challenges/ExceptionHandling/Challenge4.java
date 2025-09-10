package com.gqt.challenges.ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Challenge4 {
public static void main(String[] args) {
	try {
		File file = new File("something.txt");
        FileInputStream fs = new FileInputStream(file);
        System.out.println(fs);
	}catch (FileNotFoundException  e) {
		System.out.println(e);
	}
}
}
