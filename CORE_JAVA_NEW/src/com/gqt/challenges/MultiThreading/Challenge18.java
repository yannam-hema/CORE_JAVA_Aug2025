package com.gqt.challenges.MultiThreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Producer1 extends Thread {
    private BlockingQueue<Integer> queue;

    public Producer1(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                System.out.println("Producer produced: " + i);
                queue.put(i);
                i++;
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 extends Thread {
    private BlockingQueue<Integer> queue;

    public Consumer1(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int item = queue.take(); 
                System.out.println("Consumer consumed: " + item);
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Challenge18 {
    public static void main(String[] args) {
        // BlockingQueue with capacity of 2
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        new Producer1(queue).start();
        new Consumer1(queue).start();
    }
}
