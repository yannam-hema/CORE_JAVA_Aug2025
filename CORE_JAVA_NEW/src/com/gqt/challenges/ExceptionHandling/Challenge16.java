package com.gqt.challenges.ExceptionHandling;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Challenge16 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ravi chandra reddy");
        al.add("ramani");
        al.add("yannam");
        try {
            for (String i : al) {
                al.remove(i);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println( e);
        }
    }
}
