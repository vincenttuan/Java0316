package com.ocp.day35;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class LottoLock implements Runnable {
    //private static final ReentrantLock LOCK = new ReentrantLock();
    @Override
    public void run() {
        try {
            // 取得五組 Lotto 號碼
            Random r = new Random();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                int n = r.nextInt(39) + 1;
                System.out.printf("%s 得到第 %d 組號碼: %d\n", 
                        Thread.currentThread().getName(), i, n);
            }
        } catch (Exception e) {
        }

    }

}

public class LottoLockDemo {

}
