package com.gqt.challenges.MultiThreading;

import java.util.concurrent.CyclicBarrier;

class MyThreadcb extends Thread {
    CyclicBarrier cb;

    MyThreadcb(CyclicBarrier cb, String name) {
        super(name);
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " reached phase 1");
            cb.await();

            System.out.println(getName() + " reached phase 2");
            cb.await();

            System.out.println(getName() + " reached phase 3");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Challenge20 {
    public static void main(String[] args) {
        // 3 threads will wait at barrier (2 child + main)
        CyclicBarrier cb = new CyclicBarrier(3);

        new MyThreadcb(cb, "Thread-1").start();
        new MyThreadcb(cb, "Thread-2").start();

        try {
            System.out.println("Main reached phase 1");
            cb.await();

            System.out.println("Main reached phase 2");
            cb.await();

            System.out.println("Main reached phase 3");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main finished all phases");
    }
}
