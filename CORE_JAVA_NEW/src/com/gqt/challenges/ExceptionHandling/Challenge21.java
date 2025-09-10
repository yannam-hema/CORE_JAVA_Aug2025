package com.gqt.challenges.ExceptionHandling;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Challenge21 {
	public static void main(String[] args) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("ExampleFile");
        } catch (MissingResourceException e) {
            System.out.println(e);
        }
    }
}
