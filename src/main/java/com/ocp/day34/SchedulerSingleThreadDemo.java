package com.ocp.day34;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerSingleThreadDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("工作開始...");
        // 匯款
        Callable<Integer> callable = () -> {
            int amount = new Random().nextInt(100000);
            System.out.printf("匯款 $%,d\n", amount);
            return amount;
        };
        // 單一排程
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture future =  service.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.printf("匯款 $%,d 完成!\n", future.get());
        service.shutdown();
    }
}
