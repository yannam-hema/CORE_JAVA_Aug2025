package com.gqt.challenges.ExceptionHandling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Challenge19 {
    public static void main(String[] args) {
        String date = "27-08-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 

        try {
            LocalDate date1 = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) { 
            System.out.println(e);
        }
    }
}
