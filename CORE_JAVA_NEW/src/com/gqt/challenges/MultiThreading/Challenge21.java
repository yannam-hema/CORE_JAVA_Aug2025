package com.gqt.challenges.MultiThreading;

import java.util.concurrent.Semaphore;

class Hema extends Thread {
    Semaphore sem;
    Hema(Semaphore sem, String name) {
        super(name);
        this.sem = sem;
    }
    @Override
    public void run() {
        try {// acquire
            sem.acquire();
            System.out.println(getName() + " is working");
            Thread.sleep(1000); 
            System.out.println(getName() + " finished work");
            sem.release();//release
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Challenge21 {
    public static void main(String[] args) {
        // only 2 threads can access at the same time
        Semaphore sem = new Semaphore(2);
        new Hema(sem, "Thread-1").start();
        new Hema(sem, "Thread-2").start();
        new Hema(sem, "Thread-3").start();
        new Hema(sem, "Thread-4").start();
    }
}
