package com.gqt.challenges.MultiThreading;

import java.util.concurrent.*;

class Hema3 implements Callable<String> {
    private String work;
    Hema3(String work) {
        this.work = work;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000); 
        return work + " is done by " + Thread.currentThread().getName();
    }
}

public class Challenge23 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletionService<String> service = new ExecutorCompletionService<>(executor);
        service.submit(new Hema3("Cooking"));
        service.submit(new Hema3("Cleaning"));
        service.submit(new Hema3("Washing"));
        // take results one by one as they finish
        for (int i = 1; i <= 3; i++) {
            try {
                Future<String> result = service.take(); 
                System.out.println(result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
