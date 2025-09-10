package com.gqt.challenges.MultiThreading;

import java.util.concurrent.Exchanger;

class Hema1 extends Thread {
    Exchanger<String> ex;
    Hema1(Exchanger<String> ex, String name) {
        super(name);
        this.ex = ex;
    }
    @Override
    public void run() {
        try {
            // each thread data
            String msg = getName() + " has a message";
            System.out.println(getName() + " is sending: " + msg);
            // exchange message with another thread
            String receive = ex.exchange(msg);
            System.out.println(getName() + " received: " + receive);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Challenge22 {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new Hema1(ex, "Thread-1").start();
        new Hema1(ex, "Thread-2").start();
    }
}
