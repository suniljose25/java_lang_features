package concurrency.platform;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static class SimpleTask implements Runnable {
        @Override
        public void run() {
            System.out.printf("Thread start - %s\n", Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread end");
        }
    }
    public static void main(String[] args) {
        // With ExecutorService and thread pools
        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            executor.submit(new SimpleTask());
        }

        // Thread t1 = new Thread(new SimpleTask());
        // t1.start();

        // both are the same thing

        Thread.Builder.OfPlatform builder = Thread.ofPlatform().name("platform-thread-", 1);
        for (int i=0;i< 5000;i++) {
            builder.start(new SimpleTask());
        }

        System.out.println("The End?");
    }

    static void doSomething() {
        System.out.println("This is a IO operation");
    }
}
