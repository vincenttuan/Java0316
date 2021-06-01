package com.ocp.day30_thread;

// 繼承 Thread 類別
class RunningThread extends Thread {
    @Override
    public void run() {
        System.out.println("RunningThread...");
    }
}

// 實作 Runnable 介面
class RunningRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("RunningRunnable...");
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        RunningThread rt = new RunningThread();
        rt.start();
        
        RunningRunnable rr =  new RunningRunnable();
        Thread t = new Thread(rr);
        t.start();
        
        // Java 8
        Runnable r = () -> System.out.println("Java 8 Runnable...");
        Thread t2 = new Thread(r);
        t2.start();
    }
}
