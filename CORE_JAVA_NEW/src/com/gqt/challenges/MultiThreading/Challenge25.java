package com.gqt.challenges.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class HemaJob implements Runnable {
    private String name;
    HemaJob(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is running at " + System.currentTimeMillis());
    }
}
public class Challenge25 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        // run once after 2 seconds
        scheduler.schedule(new HemaJob("Hema OneTime"), 2, TimeUnit.SECONDS);
        // run repeatedly every 3 seconds, after 1 second delay
        scheduler.scheduleAtFixedRate(new HemaJob("Hema Repeating"), 1, 3, TimeUnit.SECONDS);
        // run for 10 seconds then shutdown
        scheduler.schedule(() -> {
            System.out.println("Shutting down...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
