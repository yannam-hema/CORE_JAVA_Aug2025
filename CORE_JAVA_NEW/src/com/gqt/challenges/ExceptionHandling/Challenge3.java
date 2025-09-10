package com.gqt.challenges.ExceptionHandling;

import java.util.Scanner;
class Hema{
	void display() {
		System.out.println("Hello !");
	}
}
public class Challenge3 {
public static void main(String[] args) {
Hema h = null;
try {
	h.display();
}catch (Exception e) {
	System.out.println(e);
}
}
}
