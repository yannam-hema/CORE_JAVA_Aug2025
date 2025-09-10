package com.gqt.challenges.ExceptionHandling;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Challenge25 {
public static void main(String[] args) {
	try {
		LocalDate daye = LocalDate.of(2025, 2, 31);
	}catch (DateTimeException e) {
	System.out.println(e);
	}
}
}
