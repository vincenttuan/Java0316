package com.ocp.day33_executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(100));
            int num = new Random().nextInt(100);
            System.out.println(num);
        } catch (Exception e) {
        }
    }
}

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {
        System.out.println("請給我10組 Lotto 數字");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100; i++) {
            service.submit(new Lotto());
        }

        System.out.printf("Thread count: %d\n", Thread.activeCount());
        service.shutdown();
    }
}
