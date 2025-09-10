package com.gqt.challenges.MultiThreading;

class Threadexp extends Thread {
    public Threadexp(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "completed");
    }
}

public class Challenge11 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");
        Threadexp t1 = new Threadexp(group, "Thread-1");
        Threadexp t2 = new Threadexp(group, "Thread-2");
        Threadexp t3 = new Threadexp(group, "Thread-3");
        t1.start();
        t2.start();
        t3.start();

    }
}

