package com.ocp.day32_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cb;
    private String name;
    public Car(CyclicBarrier cb) {
        this.cb = cb;
        this.name = Thread.currentThread().getName();
    }

    @Override
    public void run() {
        System.out.printf("%s 從台北出發\n", name);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了\n", name);
            cb.await();
        } catch (Exception e) {
        }
        
        System.out.printf("%s 繼續往高雄前進\n", name);
    }
}
