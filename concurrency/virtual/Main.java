package concurrency.virtual;

import java.util.concurrent.*;

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
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future = myExecutor.submit(() -> System.out.println("Running thread"));
            future.get();


            myExecutor.submit(() -> System.out.println("Running thread"));
            myExecutor.submit(() -> System.out.println("Running thread"));

            System.out.println("Task completed");
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }



        // Did this just so that we can have names for the thread ¯\_(ツ)_/¯
        ThreadFactory virtualThreadFactory = Thread.ofVirtual().name("virtual-thread-", 0).factory();

        try (ExecutorService myExecutor = Executors.newThreadPerTaskExecutor(virtualThreadFactory)) {
            for (int i=0;i< 50000;i++) {
                myExecutor.submit(new SimpleTask());
            }
        }

        System.out.println("End");
    }
}
