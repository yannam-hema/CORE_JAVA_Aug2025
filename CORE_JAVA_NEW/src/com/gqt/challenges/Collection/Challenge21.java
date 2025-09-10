package com.gqt.challenges.Collection;

import java.util.concurrent.LinkedBlockingQueue;

public class Challenge21 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> que = new LinkedBlockingQueue<>(2);

        que.add("hey");
        que.add("hi");
        System.out.println(que);

        System.out.println("Iterating");
        for (String i : que) {
            System.out.print(i + " ");
        }
        System.out.println();

        // que.add("hema"); // error

        que.remove("hi");  
        System.out.println(que);

        System.out.println("Iterating");
        for (String i : que) {
            System.out.println(i);
        }
    }
}
