package com.gqt.challenges.MultiThreading;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

class HemaProducer extends Thread {
    private TransferQueue<String> queue;
    HemaProducer(TransferQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            System.out.println("Hema is producing a message...");
            queue.transfer("Hello from Hema"); // waits until consumer takes it
            System.out.println("Hema message was received!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class HemaConsumer extends Thread {
    private TransferQueue<String> queue;

    HemaConsumer(TransferQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            String msg = queue.take(); // waits until producer gives
            System.out.println("Consumer got: " + msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Challenge24 {
    public static void main(String[] args) {
        TransferQueue<String> queue = new LinkedTransferQueue<>();
        new HemaConsumer(queue).start();
        new HemaProducer(queue).start();
    }
}
