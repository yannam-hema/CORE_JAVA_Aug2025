package com.gqt.challenges.MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class HemaThread extends Thread {
    private Lock lock;
    private Condition condition;

    HemaThread(Lock lock, Condition condition, String name) {
        super(name);
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(getName() + " waiting...");
            condition.await(); // wait for signal
            System.out.println(getName() + " got signal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class Challenge26 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        HemaThread t1 = new HemaThread(lock, condition, "Thread-1");
        t1.start();
        Thread.sleep(2000); 
        lock.lock();
        try {
            System.out.println("main thread sending signal...");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
