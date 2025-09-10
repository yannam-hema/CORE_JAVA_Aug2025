package com.gqt.challenges.MultiThreading;

import java.util.concurrent.Phaser;

class Threadph1 extends Thread {
    Phaser ph;

    public Threadph1(Phaser ph, String name) {
        super(name);
        this.ph = ph;
        ph.register(); // register this thread with phaser
    }

    @Override
    public void run() {
        System.out.println(getName() + " arrived at phase 1");
        ph.arriveAndAwaitAdvance(); // wait for all

        System.out.println(getName() + " arrived at phase 2");
        ph.arriveAndAwaitAdvance();

        System.out.println(getName() + " arrived at phase 3");
        ph.arriveAndAwaitAdvance();

        ph.arriveAndDeregister(); 
    }
}

public class Challenge19 {
    public static void main(String[] args) {
        Phaser ph = new Phaser(1); 
        new Threadph1(ph, "Thread-1").start();
        new Threadph1(ph, "Thread-2").start();
        for (int p = 1; p <= 2; p++) {
            System.out.println("Main thread at phase " + p);
            ph.arriveAndAwaitAdvance();
        }

        ph.arriveAndDeregister();
        System.out.println("Main thread finished all phases");
    }
}
