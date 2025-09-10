package com.gqt.challenges.Collection;

import java.util.concurrent.PriorityBlockingQueue;

public class Challenge22 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> pq = new PriorityBlockingQueue<>();
        pq.add("Hi");
        pq.add("Hello");
        pq.add("Hey");
        pq.add("Hema");
        System.out.println(pq);
        System.out.println("Iterating:");
        for (String i : pq) {
            System.out.println(i);
        }
        pq.poll();
        System.out.println("After deletion" +pq);
    }
}
