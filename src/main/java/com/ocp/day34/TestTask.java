package com.ocp.day34;

import java.util.concurrent.TimeUnit;

class Task implements Runnable { // 短任務
    @Override
    public void run() {
        System.out.println("短任務完成");
    }
}

class LongTest implements Runnable { // 長任務
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
    
}
