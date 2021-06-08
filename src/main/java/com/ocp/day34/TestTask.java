package com.ocp.day34;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable { // 短任務

    @Override
    public void run() {
        System.out.println("短任務完成");
    }
}

class LongTast implements Runnable { // 長任務

    @Override
    public void run() {
        System.out.println("長任務開始");
        try {
            TimeUnit.SECONDS.sleep(5); // 執行長任務中...
        } catch (Exception e) {
        }
        System.out.println("長任務結束");
    }
}

public class TestTask {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTast());
        service.submit(new Task());

        service.shutdown();

        // 偵測 pool 有沒有關閉
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("Pool not close ...");
        }
        System.out.println("Pool closed");
    }
}
