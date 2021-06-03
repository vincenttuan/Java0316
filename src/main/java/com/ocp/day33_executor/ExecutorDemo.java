package com.ocp.day33_executor;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

class MyExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
    
}

public class ExecutorDemo {
    public static void main(String[] args) {
        // 取得現在時間的工作
        Runnable r1 = () -> System.out.println(new Date());
        // 取得幸運數字的工作
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        
        Executor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r2);
        
        // Java 8
        Executor exec2 = (r) -> new Thread(r).start();
        exec2.execute(r1);
        exec2.execute(r2);
    }
}
